package controlador;

import modelo.Modelo;
import vista.PanelEragiketak;
import vista.Vista;

public class ControladorPanelEragiketak {

	@SuppressWarnings("unused")
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelEragiketak panelEragiketa;
	
	public ControladorPanelEragiketak(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
	}
	
	public void mostrarPanelEragiketa() {
		this.panelEragiketa = new PanelEragiketak(this);
		this.vista.mostrarPanel(this.panelEragiketa);
	}
	
	public void accionadoBottonVolverPanelLogging() {
		//this.controlador.navegarPanelLogging();
		System.out.println("WIP");
	}
	
	public void accionadoBottonTicket() {
		System.out.println("navegar Panel Ticket");
		this.controlador.navegarPanelTicket();
	}
	
	public void accionadoBottonFactura() {
		System.out.println("navegar panel factura");
		this.controlador.navegarPanelFactura();
	}
	
	public void accionadoBottonComanda() {
		System.out.println("navegar panel comanda");
		//this.controlador.navegarPanelLogging();
	}
	
	public void accionadoBottonEskaera() {
		System.out.println("navegar panel Eskaera");
		this.controlador.navegarPanelEscaera();
	}
	
	public void accionadoBottonStock() {
		System.out.println("navegar panel stock");
		//this.controlador.navegarPanelLogging();
	}

}