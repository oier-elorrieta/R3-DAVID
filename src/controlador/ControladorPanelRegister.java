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
		System.out.println("User berria sortu");
		this.controlador.navegarPanelLogging();
	}
	
	public void accionadoBottonSortu() {
		System.out.println("establezimendu berria registratu");
	}
	
	public void accionadoBottonVolverPanelLogging() {
		System.out.println("logging panelera bueltatu");
		this.controlador.navegarPanelLogging();
	}

}
