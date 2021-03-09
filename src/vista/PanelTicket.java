package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controlador.ControladorPanelTicket;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;;

@SuppressWarnings("serial")
public class PanelTicket extends JPanel{

	private ControladorPanelTicket cpt;

	private JButton btnLogging,btnSortu,btnAtzera;
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();
	private JComboBox<String> combo;
	private JTextPane tpTicket;
	public PanelTicket(ControladorPanelTicket cpt) {

		this.cpt = cpt;

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
		JLabel lblTicket = new JLabel(" Ticket Sortu");
		lblTicket.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTicket.setBounds(187, 5, 100, 20);
		add(lblTicket);

		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUser.setBounds(10, 5, 35, 20);
		add(lblUser);

		separator_1.setBounds(0, 30, 450, 7);
		add(separator_1);
		separator_2.setOrientation(SwingConstants.VERTICAL);

		separator_2.setBounds(225, 30, 2, 240);
		add(separator_2);

		separator_3.setBounds(0, 270, 450, 2);
		add(separator_3);

		tpTicket = new JTextPane();
		tpTicket.setBounds(235, 40, 205, 220);
		tpTicket.setEditable(false);
		add(tpTicket);

		combo = new JComboBox<String>();
		combo.setBounds(10, 48, 205, 22);
		add(combo);
		//--------------------------------------------------------------------------
		beteComboBox();
		initializeEvents();
	}

	private void beteComboBox() {
		String[] produktuak = cpt.beteProduktuak();
		for (int i = 0; i < produktuak.length; i++) {
			combo.addItem(produktuak[i]);
		}
	}

	private void initializeEvents() {
		this.combo.addActionListener(listenerCombo(this.cpt));
		this.btnAtzera.addActionListener(listenerBotonAtzera(this.cpt));
		this.btnSortu.addActionListener(listenerBotonSortu(this.cpt));
		this.btnLogging.addActionListener(listenerBotonLogging(this.cpt));
	}

	private ActionListener listenerBotonLogging(ControladorPanelTicket cpt) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpt.accionadoBottonLogging();
			}
		};
	}

	private ActionListener listenerBotonSortu(ControladorPanelTicket cpt) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tpTicket.setText(cpt.accionadoBottonSortu());
				combo.setEnabled(false);
				btnSortu.setEnabled(false);
			}
		};
	}

	private ActionListener listenerBotonAtzera(ControladorPanelTicket cpt) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpt.accionadoBottonAtzera();
			}
		};
	}

	private ActionListener listenerCombo(ControladorPanelTicket cpt) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSortu.setEnabled(true);
				String prezio = cpt.getProduktuPrezioa(combo.getSelectedItem().toString());	
				tpTicket.setText(tpTicket.getText()+"\r"+prezio);
			}
		};
	}

}