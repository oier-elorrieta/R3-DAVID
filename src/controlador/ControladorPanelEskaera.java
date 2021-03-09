package controlador;

import modelo.Metodos;
import modelo.Modelo;
import vista.PanelEskaera;
import vista.Vista;

public class ControladorPanelEskaera {
//----------------------------------------------------------------------------------------------------------------------------------------
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelEskaera pEskaera;
	private Metodos metodo;
//----------------------------------------------------------------------------------------------------------------------------------------
	public ControladorPanelEskaera(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
		metodo = new Metodos();
	}
//----------------------------------------------------------------------------------------------------------------------------------------	
	public void mostrarPanelEskaera() {
		this.pEskaera = new PanelEskaera(this);
		this.vista.mostrarPanel(this.pEskaera);
	}
//----------------------------------------------------------------------------------------------------------------------------------------	
	public void accionadoBottonLogging() {
		this.controlador.navegarPanelLogging();
	}
	
	public void accionadoBottonAtzera() {
		this.controlador.navegarPanelEragiketa();
	}
	
	public String accionadoBottonSortu(String dir) {
		String faktura ="Direkzio : "+dir+"\retxera bidali\r-------------------\r";
		faktura =metodo.accionadoBotonSortu(faktura);
		return faktura;
	}
	public String accionadoBottonSortu() {
		String faktura ="establezimenduan artu\r-------------------\r";
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