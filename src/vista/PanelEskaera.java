package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.ControladorPanelEskaera;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;;

@SuppressWarnings("serial")
public class PanelEskaera extends JPanel{

	private ControladorPanelEskaera cpEs;

	private JButton btnLogging,btnSortu,btnAtzera;
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();
	private JComboBox<String> combo;
	private JTextPane tpEskaera;
	private JLabel lblError;
	private JLabel lblUserName;
	private JTextField tfDirekzioa;
	private JCheckBox cbBidali;
	public PanelEskaera(ControladorPanelEskaera cpEs) {

		this.cpEs = cpEs;

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
		JLabel lblEskaera = new JLabel(" Eskaera Sortu");
		lblEskaera.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEskaera.setBounds(177, 5, 120, 20);
		add(lblEskaera);

		JLabel lblUser = new JLabel("User:");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUser.setBounds(10, 5, 35, 20);
		add(lblUser);

		separator_1.setBounds(0, 30, 450, 7);
		add(separator_1);
		separator_2.setOrientation(SwingConstants.VERTICAL);

		separator_2.setBounds(225, 30, 2, 240);
		add(separator_2);

		separator_3.setBounds(0, 270, 450, 2);
		add(separator_3);

		tpEskaera = new JTextPane();
		tpEskaera.setBounds(235, 40, 205, 220);
		tpEskaera.setEditable(false);
		add(tpEskaera);

		combo = new JComboBox<String>();
		combo.setBounds(10, 125, 205, 22);
		add(combo);

		JLabel lblDir = new JLabel("Direkzioa");
		lblDir.setBounds(10, 95, 55, 14);
		add(lblDir);

		tfDirekzioa = new JTextField();
		tfDirekzioa.setBounds(65, 95, 120, 20);
		add(tfDirekzioa);
		tfDirekzioa.setEnabled(false);
		tfDirekzioa.setColumns(10);

		cbBidali = new JCheckBox("Etxera bidali");
		cbBidali.setBounds(70, 50, 85, 23);
		add(cbBidali);

		lblUserName = new JLabel("User Izena");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUserName.setBounds(45, 5, 60, 20);
		add(lblUserName);
		
		lblError = new JLabel("Direkzioa beharrezkoa da");
		lblError.setForeground(Color.RED);
		lblError.setBounds(10, 158, 205, 14);
		lblError.setVisible(false);
		add(lblError);

		//--------------------------------------------------------------------------
		beteComboBox();
		initializeEvents();
	}

	private void beteComboBox() {
		String[] produktuak = cpEs.beteProduktuak();
		for (int i = 0; i < produktuak.length; i++) {
			combo.addItem(produktuak[i]);
		}
	}

	private void initializeEvents() {
		this.btnLogging.addActionListener(listenerBotonLogging(this.cpEs));
		this.combo.addActionListener(listenerCombo(this.cpEs));
		this.btnAtzera.addActionListener(listenerBotonAtzera(this.cpEs));
		this.cbBidali.addActionListener(listenerCheckBoxCbBidali(this.cpEs));
		this.btnSortu.addActionListener(listenerBotonSortu(this.cpEs));
	}

	private ActionListener listenerBotonSortu(ControladorPanelEskaera cpEs) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbBidali.isSelected()==true) {
					if(tfDirekzioa.getText().isBlank()) {
						lblError.setVisible(true);
						}
					else {
						lblError.setVisible(false);
						String dir = tfDirekzioa.getText();
						tpEskaera.setText(cpEs.accionadoBottonSortu(dir));
						combo.setEnabled(false);
						cbBidali.setEnabled(false);
						tfDirekzioa.setEnabled(false);
						btnSortu.setEnabled(false);
					}
				}
				else {
					lblError.setVisible(false);
					tpEskaera.setText(cpEs.accionadoBottonSortu());
					combo.setEnabled(false);
					cbBidali.setEnabled(false);
					tfDirekzioa.setEnabled(false);
					btnSortu.setEnabled(false);
				}
			}
		};

	}

	private ActionListener listenerBotonLogging(ControladorPanelEskaera cpEs) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//WIP
			}
		};
	}

	private ActionListener listenerCheckBoxCbBidali(ControladorPanelEskaera cpEs) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbBidali.isSelected()==true) {
					tfDirekzioa.setEnabled(true);
				}else if(cbBidali.isSelected()==false){
					tfDirekzioa.setEnabled(false);
				}

			}
		};
	}

	private ActionListener listenerBotonAtzera(ControladorPanelEskaera cpEs) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cpEs.accionadoBottonAtzera();
			}
		};
	}

	private ActionListener listenerCombo(ControladorPanelEskaera cpEs) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSortu.setEnabled(true);
				String prezio = cpEs.getProduktuPrezioa(combo.getSelectedItem().toString());	
				tpEskaera.setText(tpEskaera.getText()+"\r"+prezio);
			}
		};
	}
}