package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelEragiketak cpe;
	private ControladorPanelTicket cpt;
	private ControladorPanelEskaera cpEs;
	private ControladorPanelFactura cpf;
	private ControladorPanelLogging cpl;
	private ControladorPanelRegister cpr;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.cpl = new ControladorPanelLogging(this.modelo, this.vista, this);
		this.cpr = new ControladorPanelRegister(this.modelo, this.vista, this);
		this.cpe = new ControladorPanelEragiketak(this.modelo, this.vista, this);
		this.cpt = new ControladorPanelTicket(this.modelo, this.vista, this);
		this.cpEs = new ControladorPanelEskaera(this.modelo, this.vista, this);
		this.cpf = new ControladorPanelFactura(this.modelo, this.vista, this);
		this.navegarPanelLogging();
	}
	

	public void navegarPanelLogging() {
		this.cpl.mostrarPanelLogging();
	}
	
	public void navegarPanelRegister() {
		this.cpr.mostrarPanelRegister();
	}
	public void navegarPanelEragiketa() {
		this.cpe.mostrarPanelEragiketa();
	}
	
	public void navegarPanelTicket() {
		this.cpt.mostrarPanelTicket();
	}
	public void navegarPanelFactura() {
		this.cpf.mostrarPanelFactura();
	}
	public void navegarPanelEscaera() {
		this.cpEs.mostrarPanelEskaera();
	}
}
