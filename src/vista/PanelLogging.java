package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.ControladorPanelLogging;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Font;;

@SuppressWarnings("serial")
public class PanelLogging extends JPanel{
	
	private ControladorPanelLogging cpl;
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();

	private JButton btnLogBezero, btnRegister;
	
	private JTextField tfBizena;
	private JPasswordField psBezero;
	
	public PanelLogging(ControladorPanelLogging cpl) {
		this.cpl = cpl;
		
		setLayout(null);
//--------------------------------------------------------------------------------------------------------------------		
		btnLogBezero = new JButton("Logging");
		btnLogBezero.setBounds(80, 219, 120, 20);
		add(btnLogBezero);
		
		btnRegister = new JButton("Registratu");
		btnRegister.setBounds(250, 219, 120, 20);
		add(btnRegister);
//--------------------------------------------------------------------------------------------------------------
		JLabel lblBezero = new JLabel("Bezero izena");
		lblBezero.setBounds(120, 35, 120, 14);
		add(lblBezero);
		
		tfBizena = new JTextField();
		tfBizena.setBounds(140, 60, 195, 25);
		add(tfBizena);
		tfBizena.setColumns(10);
		
		JLabel lblBPasahitza = new JLabel("Pasahitza");
		lblBPasahitza.setBounds(120, 115, 115, 14);
		add(lblBPasahitza);
		
		psBezero = new JPasswordField();
		psBezero.setBounds(140, 140, 195, 25);
		add(psBezero);

		JLabel lblBezeroa = new JLabel("Bezeroa");
		lblBezeroa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBezeroa.setBounds(185, 5, 60, 20);
		add(lblBezeroa);

		separator_1.setBounds(0, 30, 225, 7);
		add(separator_1);

		separator_2.setBounds(225, 30, 225, 7);
		add(separator_2);
		
		separator_3.setBounds(0, 270, 450, 2);
		add(separator_3);
//------------------------------------------------------------------------------------------------------------------	
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnLogBezero.addActionListener(logging(this.cpl));
		this.btnRegister.addActionListener(ListenerBtnRegister(this.cpl));
	}
//-------------------------------------------------------------------------------------------------------------------	
	private ActionListener logging(ControladorPanelLogging cpl) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Logging");
				cpl.accionadoBottonLogging();
				//cpl.accionadoBottonMostrarPanelGeneros();
			}
		};
	}
//--------------------------------------------------------------------------------------------------
	private ActionListener ListenerBtnRegister(ControladorPanelLogging cpl) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Register");
				cpl.accionadoBottonMostrarPanelRegister();
			}
		};
	}
}

