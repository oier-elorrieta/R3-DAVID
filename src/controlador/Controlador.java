package controlador;

import modelo.Modelo;
import vista.Vista;

public class Controlador {

	private Modelo modelo;
	private Vista vista;
	private ControladorPanelLogging cpl;
	private ControladorPanelRegister cpr;
	private ControladorPanelEragiketak cpe;
	private ControladorPanelTicket cpt;
	private ControladorPanelEskaera cpEs;
	private ControladorPanelFactura cpf;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.cpl = new ControladorPanelLogging(this.modelo, this.vista, this);
		this.cpr = new ControladorPanelRegister(this.modelo, this.vista, this);
		this.cpe = new ControladorPanelEragiketak(this.modelo, this.vista, this);
		this.cpt = new ControladorPanelTicket(this.modelo, this.vista, this);
		this.cpEs = new ControladorPanelEskaera(this.modelo, this.vista, this);
		this.cpf = new ControladorPanelFactura(this.modelo, this.vista, this);
		this.navegarPanelEragiketa();
	}
	
	public void navegarPanelLogging() {
		System.out.println("Navegar panel Logging");
		this.cpl.mostrarPanelLogging();
	}
	
	public void navegarPanelRegister() {
		System.out.println("Navegar panel Register");
		this.cpr.mostrarPanelRegister();
	}
	
	public void navegarPanelEragiketa() {
		System.out.println("Navegar panel Eragiketa");
		this.cpe.mostrarPanelEragiketa();
	}
	
	public void navegarPanelTicket() {
		System.out.println("Navegar panel Ticket");
		this.cpt.mostrarPanelTicket();
	}
	public void navegarPanelFactura() {
		System.out.println("Navegar panel Logging");
		this.cpf.mostrarPanelFactura();
	}
	public void navegarPanelEscaera() {
		System.out.println("Navegar panel Logging");
		this.cpEs.mostrarPanelEskaera();
	}
}
