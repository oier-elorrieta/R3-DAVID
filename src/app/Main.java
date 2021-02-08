package app;
import controlador.Controlador;
import modelo.*;
import vista.Vista;

public class Main {
	
	private static Modelo modelo;
	private static Vista vista;
	@SuppressWarnings("unused")
	private static Controlador controlador;
	
	public static void main(String[] args) {
		modelo = new Modelo();    
		vista = new Vista();      
		controlador = new Controlador(modelo, vista);
	}

}