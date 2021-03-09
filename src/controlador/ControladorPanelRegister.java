package controlador;

import modelo.Modelo;
import vista.PanelRegister;
import vista.Vista;

public class ControladorPanelRegister {
	
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelRegister panelReg;
	
	public ControladorPanelRegister(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelRegister() {
		this.panelReg = new PanelRegister(this);
		this.vista.mostrarPanel(this.panelReg);
	}
	
	public void accionadoBottonRegister(String izena,String abizena,String EIzena,String nif,String pasahitza) throws Exception {
		this.modelo.getBbdd().sortuUser(izena, abizena, EIzena, nif, pasahitza);
		this.controlador.navegarPanelLogging();
	}
	
	public void accionadoBottonSortu(String izena,String dir,String nif,String mota,String jabe) throws Exception {
		this.modelo.getBbdd().sortuEstablezimendu(null, izena, dir, nif, mota, jabe);
	}
	
	public void accionadoBottonVolverPanelLogging() {
		this.controlador.navegarPanelLogging();
	}

}
