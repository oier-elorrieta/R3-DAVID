package modelo;

public class Produktu {
	
	private String izena;
	private int preCom;
	private int preVen;
	private String mota;
	private int fecCad;

	public Produktu(String izena, int preCom, int preVen, String mota, int fecCad) {
		this.izena = izena;
		this.preCom = preCom;
		this.preVen = preVen;
		this.mota = mota;
		this.fecCad = fecCad;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public int getPreCom() {
		return preCom;
	}

	public void setPreCom(int preCom) {
		this.preCom = preCom;
	}

	public int getPreVen() {
		return preVen;
	}

	public void setPreVen(int preVen) {
		this.preVen = preVen;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public int getFecCad() {
		return fecCad;
	}

	public void setFecCad(int fecCad) {
		this.fecCad = fecCad;
	}
	
	
}
