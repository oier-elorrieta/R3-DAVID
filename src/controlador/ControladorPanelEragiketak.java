package controlador;

import modelo.Modelo;
import vista.PanelEragiketak;
import vista.Vista;

public class ControladorPanelEragiketak {

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
	
	public void accionadoBottonLogging() {
		this.controlador.navegarPanelLogging();
	}
	
	public void accionadoBottonTicket() {
		this.controlador.navegarPanelTicket();
	}
	
	public void accionadoBottonFactura() {
		this.controlador.navegarPanelFactura();
	}
	
	public void accionadoBottonEskaera() {
		this.controlador.navegarPanelEscaera();
	}

	public String[] konprobatuMota() {
		String[] establezimendu = this.modelo.getBbdd().getEstablezimendu();
		return establezimendu;
	}
	

}