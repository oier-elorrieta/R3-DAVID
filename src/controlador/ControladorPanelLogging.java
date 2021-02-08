package controlador;

import modelo.Modelo;
import vista.PanelLogging;
import vista.Vista;

public class ControladorPanelLogging {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelLogging panelLog;
	
	public ControladorPanelLogging(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelLogging() {
		this.panelLog = new PanelLogging(this);
		this.vista.mostrarPanel(this.panelLog);
	}
	
	public void accionadoBottonMostrarPanelRegister() {
		this.controlador.navegarPanelRegister();
	}
	
	public void accionadoBottonLogging() {
		this.controlador.navegarPanelEragiketa();
	}

}