package app;
import controlador.Controlador;
import modelo.*;
import vista.Vista;

public class Main {
	
	private static Modelo modelo;
	private static Vista vista;
	@SuppressWarnings("unused")
	private static Controlador controlador;
	private static bbddSartze bbdd;
	
	public static void main(String[] args) {
		bbdd = new bbddSartze();
		modelo = new Modelo(bbdd);    
		vista = new Vista();
                
		controlador = new Controlador(modelo, vista);
	}

}