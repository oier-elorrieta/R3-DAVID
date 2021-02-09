package controlador;

import modelo.Modelo;
import vista.PanelRegister;
import vista.Vista;

public class ControladorPanelRegister {
	
	@SuppressWarnings("unused")
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
	
	public void accionadoBottonRegister() {
		this.controlador.navegarPanelLogging();
	}
	
	public void accionadoBottonSortu() {
	}
	
	public void accionadoBottonVolverPanelLogging() {
		this.controlador.navegarPanelLogging();
	}

}
