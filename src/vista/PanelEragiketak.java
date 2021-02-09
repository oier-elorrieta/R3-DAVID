package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.ControladorPanelEragiketak;
import javax.swing.JSeparator;

import java.awt.Font;;

@SuppressWarnings("serial")
public class PanelEragiketak extends JPanel{

	private ControladorPanelEragiketak cpe;

	private JButton btnLogging,btnTicket,btnFactura,btnEskaera,btnStock,btnComanda;
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();
	private JLabel lblNombreUsuario,lblEMota;
	
	public PanelEragiketak(ControladorPanelEragiketak cpe) {

		this.cpe = cpe;

		setLayout(null);
//------------------------------------------------------------------------------	
		btnLogging = new JButton("Logging");
		btnLogging.setBounds(320, 275, 120, 20);
		add(btnLogging);

		btnTicket = new JButton("Ticket");
		btnTicket.setBounds(50, 87, 120, 20);
		btnTicket.setVisible(false);
		add(btnTicket);
		
		btnFactura = new JButton("Factura");
		btnFactura.setBounds(275, 87, 120, 20);
		btnFactura.setVisible(false);
		add(btnFactura);
		
		btnEskaera = new JButton("Eskaera");
		btnEskaera.setBounds(50, 185, 120, 20);
		btnEskaera.setVisible(false);
		add(btnEskaera);
		
		btnStock = new JButton("Stock");
		btnStock.setBounds(175, 239, 120, 20);
		add(btnStock);
		
		btnComanda = new JButton("Comanda");
		btnComanda.setBounds(275, 184, 120, 20);
		btnComanda.setVisible(false);
		add(btnComanda);
//-----------------------------------------------------------------------------	
		JLabel lblEragiketak = new JLabel("Eragiketak");
		lblEragiketak.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEragiketak.setBounds(195, 4, 80, 20);
		add(lblEragiketak);

		JLabel lblUser = new JLabel("User:");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUser.setBounds(10, 5, 40, 20);
		add(lblUser);
		
		lblNombreUsuario = new JLabel("Nombre Usuario");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombreUsuario.setBounds(45, 5, 90, 20);
		add(lblNombreUsuario);
		
		JLabel lblTypeE = new JLabel("Mota:");
		lblTypeE.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTypeE.setBounds(315, 4, 40, 20);
		add(lblTypeE);
		
		lblEMota = new JLabel("Establezimendu mota");
		lblEMota.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEMota.setBounds(350, 4, 90, 20);
		add(lblEMota);
//--------------------------------------------------------------------------------
		separator_1.setBounds(0, 30, 225, 7);
		add(separator_1);


		separator_2.setBounds(225, 30, 225, 7);
		add(separator_2);
		
		separator_3.setBounds(0, 270, 450, 2);
		add(separator_3);
//--------------------------------------------------------------------------
		konprobatuMota();
		initializeEvents();
	}
	
	private void konprobatuMota() {
		String[] establezimendu = cpe.konprobatuMota();
		lblNombreUsuario.setText(establezimendu[0]);
		lblEMota.setText(establezimendu[1]);
		switch(establezimendu[1]) {
		case "Bar":
			Bar();
			break;
		case "Cafetegi":
			cafe();
			break;
		case "Jatetxe":
			jate();
			break;
		}
	}
	
	private void jate() {
		btnTicket.setVisible(true);
		btnFactura.setVisible(true);
		btnEskaera.setVisible(true);
		btnComanda.setVisible(true);
	}

	private void cafe() {
		btnTicket.setVisible(true);
		btnFactura.setVisible(true);
	}

	private void Bar() {
	btnTicket.setVisible(true);
	}

	private void initializeEvents() {
		this.btnTicket.addActionListener(listenerBotonTicket(this.cpe));
		this.btnFactura.addActionListener(listenerBotonFactura(this.cpe));
		this.btnEskaera.addActionListener(listenerBotonEskaera(this.cpe));
		this.btnLogging.addActionListener(listenerBotonLogging(this.cpe));
	}

	private ActionListener listenerBotonLogging(ControladorPanelEragiketak cpe) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpe.accionadoBottonLogging();
			}
		};
	}
	private ActionListener listenerBotonTicket(ControladorPanelEragiketak cpe) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpe.accionadoBottonTicket();
			}
		};
	}
	
	private ActionListener listenerBotonFactura(ControladorPanelEragiketak cpe) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpe.accionadoBottonFactura();
			}
		};
	}
	
	
	private ActionListener listenerBotonEskaera(ControladorPanelEragiketak cpe) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpe.accionadoBottonEskaera();
			}
		};
	}
	
}