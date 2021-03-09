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
import java.awt.Font;
import java.awt.Color;;

@SuppressWarnings("serial")
public class PanelLogging extends JPanel{
	
	private ControladorPanelLogging cpl;
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();

	private JButton btnLogBezero, btnRegister;
	private JLabel lblError;
	private JTextField tfDNI;
	private JPasswordField psPasahitza;
	
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
		JLabel lblDNI = new JLabel("User DNI");
		lblDNI.setBounds(120, 35, 120, 14);
		add(lblDNI);
		
		tfDNI = new JTextField();
		tfDNI.setBounds(140, 60, 195, 25);
		add(tfDNI);
		tfDNI.setColumns(10);
		
		JLabel lblPasahitza = new JLabel("Pasahitza");
		lblPasahitza.setBounds(120, 115, 115, 14);
		add(lblPasahitza);
		
		psPasahitza = new JPasswordField();
		psPasahitza.setBounds(140, 140, 195, 25);
		add(psPasahitza);

		JLabel lblLogging = new JLabel("Logging");
		lblLogging.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogging.setBounds(185, 5, 68, 20);
		add(lblLogging);

		separator_1.setBounds(0, 30, 225, 7);
		add(separator_1);

		separator_2.setBounds(225, 30, 225, 7);
		add(separator_2);
		
		separator_3.setBounds(0, 270, 450, 2);
		add(separator_3);
		
		lblError = new JLabel("Izena edo pasahitza okerrak dira");
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblError.setForeground(Color.RED);
		lblError.setBounds(120, 176, 236, 14);
		lblError.setVisible(false);
		add(lblError);
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
				String pasahitza =new String(psPasahitza.getPassword());
				try {
				cpl.accionadoBottonLogging(tfDNI.getText(),pasahitza);
				}catch (Exception e) {
					lblError.setVisible(true);
				}
			}
		};
	}
//--------------------------------------------------------------------------------------------------
	private ActionListener ListenerBtnRegister(ControladorPanelLogging cpl) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpl.accionadoBottonMostrarPanelRegister();
			}
		};
	}
}

