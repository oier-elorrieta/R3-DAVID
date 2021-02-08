package modelo;

public class bbddSartze {

	private Produktu cola;
	private Produktu bull;
	private Produktu ura;
	private Produktu cafe;
	private Produktu[] produktuak;
	
	public bbddSartze() {
		cola = new Produktu("coca cola", 85, 100, "refresko", 00002030);
		bull = new Produktu("red bull", 85, 100, "refresko", 00002030);
		ura = new Produktu("botilatu ura", 85, 100, "refresko", 00002030);
		cafe = new Produktu("Cafe starbuss", 85, 100, "refresko", 00002030);
		produktuak=new Produktu[4];
		produktuak[0]=cola;
		produktuak[1]=bull;
		produktuak[2]=ura;
		produktuak[3]=cafe;
	}

	public String[] produktuakJaso() {			
		String[] produktuIzenak = new String[4];

		for (int i = 0; i < produktuIzenak.length; i++) {
			produktuIzenak[i]=produktuak[i].getIzena();
		}

		return produktuIzenak;
	}
	public String[] getPrezioak() {
		String[] produktuPrezioak = new String[4];

		for (int i = 0; i < produktuPrezioak.length; i++) {
			produktuPrezioak[i]=produktuak[i].getPreVen()+"";
		}
		return produktuPrezioak;
	}
	public int produktuPrezioa(String izen) {
		int prezioa = 0;
		for (int i = 0; i < produktuak.length; i++) {
			if(produktuak[i].getIzena().equals(izen)) {
				prezioa=produktuak[i].getPreVen();
			}
		}
		
		return prezioa;
	}
}
