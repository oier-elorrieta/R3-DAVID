package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.ControladorPanelRegister;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;;

@SuppressWarnings("serial")
public class PanelRegister extends JPanel{

	private ControladorPanelRegister cpr;

	private JButton btnLogging,btnRegister,btnSortu;

	private JTextField tfIzena,tfAbizena;

	private JPasswordField pfBezero;
	private JTextField tfEIzen,tfDirekzio, tfNif, tfJabe;
	private JComboBox<String> cbMota;
	private JLabel lblErrorUser,lblErrorEstablezimendu;

	private final JSeparator separator = new JSeparator();
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();
	private JTextField tfDNI;
	private JTextField tfENIF;

	public PanelRegister(ControladorPanelRegister cpr) {

		this.cpr = cpr;

		setLayout(null);
		//------------------------------------------------------------------------------	
		btnLogging = new JButton("Logging");
		btnLogging.setBounds(10, 275, 120, 20);
		add(btnLogging);

		btnRegister = new JButton("Registratu");
		btnRegister.setBounds(52, 239, 120, 20);
		add(btnRegister);
		//-----------------------------------------------------------------------------	
		JLabel lblEstablezimendu = new JLabel(" Establezimendu");
		lblEstablezimendu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEstablezimendu.setBounds(277, 5, 120, 20);
		add(lblEstablezimendu);

		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUser.setBounds(92, 5, 35, 20);
		add(lblUser);	
		//-------------------------------------------------------------------------------
		JLabel lblBIzena = new JLabel("Izena");
		lblBIzena.setBounds(10, 35, 60, 29);
		add(lblBIzena);

		tfIzena = new JTextField();
		tfIzena.setBounds(95, 35, 120, 20);
		add(tfIzena);
		tfIzena.setColumns(10);

		JLabel lblBAbizena = new JLabel("Abizena");
		lblBAbizena.setBounds(10, 65, 60, 20);
		add(lblBAbizena);

		tfAbizena = new JTextField();
		tfAbizena.setBounds(95, 65, 120, 20);
		add(tfAbizena);
		tfAbizena.setColumns(10);

		JLabel lblBPasahitza = new JLabel("Pasahitza");
		lblBPasahitza.setBounds(10, 155, 60, 15);
		add(lblBPasahitza);

		tfDNI = new JTextField();
		tfDNI.setColumns(10);
		tfDNI.setBounds(95, 125, 120, 20);
		add(tfDNI);

		JLabel lblDNI = new JLabel("NIF");
		lblDNI.setBounds(10, 125, 60, 20);
		add(lblDNI);

		JLabel lblENIF = new JLabel("E.NIF");
		lblENIF.setBounds(10, 95, 60, 20);
		add(lblENIF);

		tfENIF = new JTextField();
		tfENIF.setColumns(10);
		tfENIF.setBounds(95, 95, 120, 20);
		add(tfENIF);

		pfBezero = new JPasswordField();
		pfBezero.setBounds(95, 155, 120, 20);
		add(pfBezero);

		lblErrorUser = new JLabel("Bete kanpo guztiak\r\n");
		lblErrorUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErrorUser.setForeground(Color.RED);
		lblErrorUser.setBounds(10, 201, 192, 14);
		lblErrorUser.setVisible(false);
		add(lblErrorUser);

		//------------------------------------------------------------------------------------------
		JLabel lblEIzena = new JLabel("E.Izena");
		lblEIzena.setBounds(235, 35, 60, 20);
		add(lblEIzena);

		tfEIzen = new JTextField();
		tfEIzen.setColumns(10);
		tfEIzen.setBounds(320, 35, 120, 20);
		add(tfEIzen);

		JLabel lblDirekzioa = new JLabel("Direkzioa");
		lblDirekzioa.setBounds(235, 65, 60, 20);
		add(lblDirekzioa);

		tfDirekzio = new JTextField();
		tfDirekzio.setColumns(10);
		tfDirekzio.setBounds(320, 65, 120, 20);
		add(tfDirekzio);

		JLabel lblNif = new JLabel("NIF");
		lblNif.setBounds(237, 95, 60, 20);
		add(lblNif);

		tfNif = new JTextField();
		tfNif.setColumns(10);
		tfNif.setBounds(320, 95, 120, 20);
		add(tfNif);

		JLabel lblJabe = new JLabel("Jabe");
		lblJabe.setBounds(235, 155, 60, 20);
		add(lblJabe);

		tfJabe = new JTextField();
		tfJabe.setColumns(10);
		tfJabe.setBounds(320, 155, 120, 20);
		add(tfJabe);

		JLabel lblEmota = new JLabel("E.Mota");
		lblEmota.setBounds(235, 125, 60, 20);
		add(lblEmota);

		cbMota = new JComboBox<String>();
		cbMota.setBounds(320, 125, 120, 20);
		add(cbMota);

		btnSortu = new JButton("Sortu");
		btnSortu.setBounds(320, 238, 120, 20);
		add(btnSortu);
		
		lblErrorEstablezimendu = new JLabel("Bete kanpo guztiak");
		lblErrorEstablezimendu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErrorEstablezimendu.setForeground(Color.RED);
		lblErrorEstablezimendu.setBounds(235, 200, 192, 14);
		lblErrorEstablezimendu.setVisible(false);
		add(lblErrorEstablezimendu);
		
		//----------------------------------------------------------------------		
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(225, 0, 2, 270);
		add(separator);

		separator_1.setBounds(0, 30, 225, 7);
		add(separator_1);


		separator_2.setBounds(225, 30, 225, 7);
		add(separator_2);

		separator_3.setBounds(0, 270, 450, 2);
		add(separator_3);
				//--------------------------------------------------------------------------
		beteCbMota();
		initializeEvents();
	}

	private void beteCbMota() {
		cbMota.addItem("Bar");
		cbMota.addItem("Cafetegi");
		cbMota.addItem("Jatetxe");
	}

	private void initializeEvents() {
		this.btnLogging.addActionListener(listenerBotonLogging(this.cpr));
		this.btnRegister.addActionListener(listenerBotonRegister(this.cpr));
		this.btnSortu.addActionListener(listenerBotonSortu(this.cpr));
	}

	private ActionListener listenerBotonLogging(ControladorPanelRegister cpr) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpr.accionadoBottonVolverPanelLogging();
			}
		};
	}

	private ActionListener listenerBotonSortu(ControladorPanelRegister cpr) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					cpr.accionadoBottonSortu(tfEIzen.getText(),tfDirekzio.getText(),tfNif.getText(),cbMota.getSelectedItem().toString(),tfJabe.getText());
				}catch (Exception e) {
					lblErrorEstablezimendu.setVisible(true);
				}
			}
		};
	}

	private ActionListener listenerBotonRegister(ControladorPanelRegister cpr) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pasahitza = new String(pfBezero.getPassword());
				try {
					cpr.accionadoBottonRegister(tfIzena.getText(),tfAbizena.getText(),tfENIF.getText(),tfDNI.getText(),pasahitza);
				} catch (Exception e) {
					lblErrorUser.setVisible(true);
				}
			}
		};
	}
}
