package modelo;

public class bbddSartze {
	private User[] usuarioak;
	private Establezimendu[] establezimenduak;
	private int establezimendu;
	
	public bbddSartze() {
		Produktu[] produktuak=produktuak();
		usuarioak= usuarioak();
		establezimenduak=establezimenduak(produktuak);
	}
	private Establezimendu[] establezimenduak(Produktu[] produktuak) {
		Establezimendu[] establezimenduak;
		Establezimendu e1 =new Establezimendu(produktuak, "elena", "iparAguirre20", "505505505a", "Bar", "Markel");
		Establezimendu e2 =new Establezimendu(produktuak, "nito", "ekiMartinez21", "050050050b", "Cafetegi", "Gorka");
		Establezimendu e3 =new Establezimendu(produktuak, "kerry", "hegoGonzalez19", "909909909c", "Jatetxe", "Eneko");
		Establezimendu e4 =new Establezimendu(produktuak, "kaberga", "mendeTrevilla21", "090090090d", "Bar", "Jon");
		establezimenduak=new Establezimendu[4];
		establezimenduak[0]=e1;
		establezimenduak[1]=e2;
		establezimenduak[2]=e3;
		establezimenduak[3]=e4;
		return establezimenduak;
	}
	private User[] usuarioak() {
		User[] usuarioak;
		User u1 = new User("markel", "aguirre", "elena", "055505550a", "12");
		User u2 = new User("gorka", "martinez", "nito", "500050005b", "12");
		User u3 = new User("eneko", "gonzalez", "kerry", "099909990c", "12");
		User u4 = new User("jon", "trevilla", "kaberga", "900090009d", "12");
		usuarioak=new User[4];
		usuarioak[0] = u1;
		usuarioak[1] = u2;
		usuarioak[2] = u3;
		usuarioak[3] = u4;
		return usuarioak;
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
		for (int i = 0; i < usuarioak.length; i++) {
			if (usuarioak[i].getIzena().equals(Izena)) {
				if(usuarioak[i].getPasahitza().equals(pasahitza)) {
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
			produktuIzenak[i]=establezimenduak[establezimendu].getProduktuak()[i].getIzena();
		}

		return produktuIzenak;
	}
	public String[] getPrezioak() {
		String[] produktuPrezioak = new String[4];

		for (int i = 0; i < produktuPrezioak.length; i++) {
			produktuPrezioak[i]=establezimenduak[establezimendu].getProduktuak()[i].getPreVen()+"";
		}
		return produktuPrezioak;
	}
	public int produktuPrezioa(String izen) {
		int prezioa = 0;
		for (int i = 0; i < establezimenduak[establezimendu].getProduktuak().length; i++) {
			if(establezimenduak[establezimendu].getProduktuak()[i].getIzena().equals(izen)) {
				prezioa=establezimenduak[establezimendu].getProduktuak()[i].getPreVen();
			}
		}
		
		return prezioa;
	}
	public String[] getEstablezimendu() {
		String izena=usuarioak[establezimendu].getIzena();
		String mota=establezimenduak[establezimendu].getMota();
		String[] string ={izena,mota};
		return string;
	}
}
