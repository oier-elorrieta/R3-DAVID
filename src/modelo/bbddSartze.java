package modelo;

import java.util.ArrayList;
import java.sql.*;

public class bbddSartze {
	private static final Exception Error = null;
	private ArrayList<User> usuarioak= new ArrayList<>();
	private ArrayList<Establezimendu> establezimenduak= new ArrayList<>();;
	private static ArrayList<Eragiketa> eragiketak = new ArrayList<>() ;
	private int establezimendu;
	private Connection bbdd;
    private static final String URL = "jdbc:mysql://localhost:33060/hosteleria";
    private static final String USUARIO = "root";
    private static final String PASSW = "elorrieta";

	public bbddSartze() {
		bbdd=conexion();
		prueba();
		Produktu[] produktuak=produktuak();
		usuarioak();
		establezimenduak(produktuak);
	}
	private Connection conexion() {
		 Connection conexion = null;        
	        try {
	            conexion = DriverManager.getConnection(URL, USUARIO, PASSW);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	        return conexion;
	    }
	private void prueba() {
		Statement s;
		ResultSet rs;
		try {
		s = bbdd.createStatement();
		rs = s.executeQuery ("select * from establezimendu");
		while (rs.next())
		{
		    System.out.println (rs.getCharacterStream (1) );
		}
		}catch (Exception e) {
			
		}
		
	}
	
	private void establezimenduak(Produktu[] produktuak) {
		try {
			sortuEstablezimendu(produktuak, "elena", "iparAguirre20", "505505505a", "Bar", "Markel");
			sortuEstablezimendu(produktuak, "nito", "ekiMartinez21", "050050050b", "Cafetegi", "Gorka");
			sortuEstablezimendu(produktuak, "kerry", "hegoGonzalez19", "909909909c", "Jatetxe", "Eneko");
			sortuEstablezimendu(produktuak, "kaberga", "mendeTrevilla21", "090090090d", "Bar", "Jon");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private void usuarioak() {
		try{
			sortuUser("markel", "aguirre", "elena", "055505550a", "12");
			sortuUser("gorka", "martinez", "nito", "500050005b", "12");
			sortuUser("eneko", "gonzalez", "kerry", "099909990c", "12");
			sortuUser("jon", "trevilla", "kaberga", "900090009d", "12");
		}catch (Exception e) {
		}

	}
	private Produktu[] produktuak() {
		Produktu[] produktuak;
		Produktu cola = new Produktu("coca cola", 85, 100, "refresko", 00002030);
		Produktu bull = new Produktu("red bull", 85, 100, "refresko", 00002030);
		Produktu ura = new Produktu("botilatu ura", 85, 100, "refresko", 00002030);
		Produktu cafe = new Produktu("Cafe starbuss", 85, 100, "refresko", 00002030);
		produktuak=new Produktu[4];
		produktuak[0]=cola;
		produktuak[1]=bull;
		produktuak[2]=ura;
		produktuak[3]=cafe;
		return produktuak;
	}
	public boolean balidatuUser(String Izena,String pasahitza) {
		boolean balidatuta = false;
		for (int i = 0; i < usuarioak.size(); i++) {
			if (usuarioak.get(i).getIzena().equals(Izena)) {
				if(usuarioak.get(i).getPasahitza().equals(pasahitza)) {
					establezimendu = i;
					balidatuta = true;
				}
			}
		}
		return balidatuta;	
	}

	public String[] produktuakJaso() {			
		String[] produktuIzenak = new String[4];

		for (int i = 0; i < produktuIzenak.length; i++) {
			produktuIzenak[i]=establezimenduak.get(establezimendu).getProduktuak()[i].getIzena();
		}

		return produktuIzenak;
	}
	public String[] getPrezioak() {
		String[] produktuPrezioak = new String[4];

		for (int i = 0; i < produktuPrezioak.length; i++) {
			produktuPrezioak[i]=establezimenduak.get(establezimendu).getProduktuak()[i].getPreVen()+"";
		}
		return produktuPrezioak;
	}
	public int produktuPrezioa(String izen) {
		int prezioa = 0;
		for (int i = 0; i < establezimenduak.get(establezimendu).getProduktuak().length; i++) {
			if(establezimenduak.get(establezimendu).getProduktuak()[i].getIzena().equals(izen)) {
				prezioa=establezimenduak.get(establezimendu).getProduktuak()[i].getPreVen();
			}
		}

		return prezioa;
	}

	public String[] getEstablezimendu() {
		String izena=usuarioak.get(establezimendu).getIzena();
		String mota=establezimenduak.get(establezimendu).getMota();
		String[] strings ={izena,mota};
		return strings;
	}
	public static void eragiketakGorde(Eragiketa eragi) {
		eragiketak.add(eragi);
	}
	public void sortuUser (String izena,String abizena,String EIzena, String nif, String pasahitza) throws Exception {
		if (izena.equals("")||abizena.equals("")||EIzena.equals("")||nif.equals("")||pasahitza.equals(""))throw Error;
		else {
			User u = new User(izena,abizena,EIzena,nif,pasahitza);
			usuarioak.add(u);
		}
	}
	public void sortuEstablezimendu(Produktu[] produktuak,String izena,String dir,String nif,String mota,String jabe) throws Exception {
		if (izena.equals("")||dir.equals("")||nif.equals("")||mota.equals("")||jabe.equals(""))throw Error;
		else {
			Establezimendu e =new Establezimendu(produktuak,izena,dir,nif,mota,jabe);
			establezimenduak.add(e);
		}
	}
}
