package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.ControladorPanelFactura;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.Color;;

@SuppressWarnings("serial")
public class PanelFactura extends JPanel{

	private ControladorPanelFactura cpf;

	private JButton btnLogging,btnSortu,btnAtzera;
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();
	private JComboBox<String> combo;
	private JTextPane tpFaktura;
	private JTextField tfBIzen,tfBAbizen,tfBNif;
	private JLabel lblError;

	public PanelFactura(ControladorPanelFactura cpf) {

		this.cpf = cpf;

		setLayout(null);
//------------------------------------------------------------------------------	
		btnLogging = new JButton("Logging");
		btnLogging.setBounds(320, 275, 120, 20);
		add(btnLogging);
		
		btnSortu = new JButton("Sortu");
		btnSortu.setBounds(115, 245, 100, 20);
		btnSortu.setEnabled(false);
		add(btnSortu);
		
		btnAtzera = new JButton("Bueltatu");
		btnAtzera.setBounds(10, 245, 100, 20);
		add(btnAtzera);
//-----------------------------------------------------------------------------	
		JLabel lblFactura = new JLabel(" Faktura Sortu");
		lblFactura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFactura.setBounds(182, 5, 110, 20);
		add(lblFactura);

		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUser.setBounds(10, 5, 35, 20);
		add(lblUser);
		

		JLabel lblBIzena = new JLabel("Izena");
		lblBIzena.setBounds(10, 35, 46, 14);
		add(lblBIzena);
		
		tfBIzen = new JTextField();
		tfBIzen.setBounds(60, 35, 120, 20);
		add(tfBIzen);
		tfBIzen.setColumns(10);
		
		JLabel lblBAbizen = new JLabel("Abizena");
		lblBAbizen.setBounds(10, 65, 46, 14);
		add(lblBAbizen);
		
		tfBAbizen = new JTextField();
		tfBAbizen.setColumns(10);
		tfBAbizen.setBounds(60, 65, 120, 20);
		add(tfBAbizen);
		
		JLabel lblBNif = new JLabel("NIF");
		lblBNif.setBounds(10, 95, 46, 14);
		add(lblBNif);
		
		tfBNif = new JTextField();
		tfBNif.setColumns(10);
		tfBNif.setBounds(60, 95, 120, 20);
		add(tfBNif);
		
		tpFaktura = new JTextPane();
		tpFaktura.setBounds(235, 40, 205, 220);
		tpFaktura.setEditable(false);
		add(tpFaktura);
		
		combo = new JComboBox<String>();
		combo.setBounds(10, 125, 205, 22);
		add(combo);		
//---------------------------------------
		
		separator_1.setBounds(0, 30, 450, 7);
		add(separator_1);
		separator_2.setOrientation(SwingConstants.VERTICAL);

		separator_2.setBounds(225, 30, 2, 240);
		add(separator_2);
		
		separator_3.setBounds(0, 270, 450, 2);
		add(separator_3);
		
		lblError = new JLabel("Izena, Abizena, eta Nif bete behar dira");
		lblError.setForeground(Color.RED);
		lblError.setVisible(false);
		lblError.setBounds(10, 158, 205, 14);
		add(lblError);
//--------------------------------------------------------------------------
		beteComboBox();
		initializeEvents();
	}
	
	private void beteComboBox() {
		String[] produktuak = cpf.beteProduktuak();
		for (int i = 0; i < produktuak.length; i++) {
			combo.addItem(produktuak[i]);
		}
	}

	private void initializeEvents() {
		this.btnLogging.addActionListener(listenerBotonLogging(this.cpf));
		this.combo.addActionListener(listenerCombo(this.cpf));
		this.btnAtzera.addActionListener(listenerBotonAtzera(this.cpf));
		this.btnSortu.addActionListener(listenerBotonSortu(this.cpf));
	}

	private ActionListener listenerBotonLogging(ControladorPanelFactura cpf) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Logging");
				
			}
		};
	}
	
	private ActionListener listenerBotonAtzera(ControladorPanelFactura cpf) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Atzera");
				cpf.accionadoBottonAtzera();
			}
		};
	}
	
	private ActionListener listenerCombo(ControladorPanelFactura cpf) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSortu.setEnabled(true);
				String prezio = cpf.getProduktuPrezioa(combo.getSelectedItem().toString());	
				tpFaktura.setText(tpFaktura.getText()+"\r"+prezio);
			}
		};
	}
	
	private ActionListener listenerBotonSortu(ControladorPanelFactura cpf) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Sortu");
				if(tfBIzen.getText().isBlank()||tfBAbizen.getText().isBlank()||tfBNif.getText().isBlank()) {
					System.out.println("hay que rellenar todos los campos");
					lblError.setVisible(true);
				}else {
					lblError.setVisible(false);
					tpFaktura.setText(cpf.accionadoBottonSortu(tfBIzen.getText(),tfBAbizen.getText(),tfBNif.getText()));
					tfBIzen.setEnabled(false);
					tfBAbizen.setEnabled(false);
					tfBNif.setEnabled(false);
					combo.setEnabled(false);
					btnSortu.setEnabled(false);
				}			
			}
		};
	}
}