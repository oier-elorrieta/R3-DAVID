package controlador;

import modelo.Metodos;
import modelo.Modelo;
import vista.PanelFactura;
import vista.Vista;

public class ControladorPanelFactura {
//----------------------------------------------------------------------------------------------------------------------------------------
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	private PanelFactura pfactura;
	private Metodos metodo;
//----------------------------------------------------------------------------------------------------------------------------------------
	public ControladorPanelFactura(Modelo modelo, Vista vista, Controlador controlador) {
		this.modelo = modelo;
		this.vista = vista;
		this.controlador = controlador;	
		metodo = new Metodos();
	}
//----------------------------------------------------------------------------------------------------------------------------------------
	public void mostrarPanelFactura() {
		this.pfactura = new PanelFactura(this);
		this.vista.mostrarPanel(this.pfactura);
	}
//----------------------------------------------------------------------------------------------------------------------------------------
	public void accionadoBottonAtzera() {
		this.controlador.navegarPanelEragiketa();
	}

	public String accionadoBottonSortu(String izen,String abizen,String nif) {
		String faktura ="izena : "+izen+"\rabizena : "+abizen+"\rNif : "+nif+"\r-------------------\r";
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