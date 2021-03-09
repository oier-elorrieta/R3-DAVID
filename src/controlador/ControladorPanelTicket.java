package controlador;

import modelo.Metodos;
import modelo.Modelo;
import vista.PanelTicket;
import vista.Vista;

public class ControladorPanelTicket {
//----------------------------------------------------------------------------------------------------------------------------------------
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelTicket panelTicket;
	private Metodos metodo;
//----------------------------------------------------------------------------------------------------------------------------------------
	public ControladorPanelTicket(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
		metodo = new Metodos();
	}
//----------------------------------------------------------------------------------------------------------------------------------------
	public void mostrarPanelTicket() {
		this.panelTicket = new PanelTicket(this);
		this.vista.mostrarPanel(this.panelTicket);
	}
//----------------------------------------------------------------------------------------------------------------------------------------
	public void accionadoBottonLogging() {
		this.controlador.navegarPanelLogging();
	}
	
	public void accionadoBottonAtzera() {
		this.controlador.navegarPanelEragiketa();
	}
	public String accionadoBottonSortu() {
		String faktura ="-------------------\r";
		faktura =metodo.accionadoBotonSortu(faktura);
		return faktura;
	}
	public String[] beteProduktuak() {
		String [] produktuak = this.modelo.getBbdd().produktuakJaso();
		String [] Prezioak = this.modelo.getBbdd().getPrezioak();
		metodo.setproKop(produktuak,Prezioak);
		return produktuak;
	}
	public String getProduktuPrezioa(String izen) {
		metodo.addProduktu(izen);
		int prezio =getPrezio(izen);
		String produkt = izen+" : "+(double)prezio/100+"€";
		return produkt;
	}
//----------------------------------------------------------------------------------------------------------------------------------------
	private int getPrezio(String izen) {
		return this.modelo.getBbdd().produktuPrezioa(izen);
	}

}