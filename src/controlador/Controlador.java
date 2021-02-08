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
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		this.cpe = new ControladorPanelEragiketak(this.modelo, this.vista, this);
		this.cpt = new ControladorPanelTicket(this.modelo, this.vista, this);
		this.cpEs = new ControladorPanelEskaera(this.modelo, this.vista, this);
		this.cpf = new ControladorPanelFactura(this.modelo, this.vista, this);
		this.navegarPanelEragiketa();
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
