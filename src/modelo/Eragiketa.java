package modelo;

import java.util.Date;

public abstract class Eragiketa {
	private static int nTrasakzio = 1;
	private int ntrans;
	private Date fec;
	private String[][] proKop;
//----------------------------------------------------------------------------------------------------
	public Eragiketa(String[][] proKop) {
		this.proKop=proKop;
		ntrans=Eragiketa.nTrasakzio++;
	}
//----------------------------------------------------------------------------------------------------
	public static int getnTrasakzio() {
		return nTrasakzio;
	}
	public static void setnTrasakzio(int nTrasakzio) {
		Eragiketa.nTrasakzio = nTrasakzio;
	}
	public int getNtrans() {
		return ntrans;
	}
	public void setNtrans(int ntrans) {
		this.ntrans = ntrans;
	}
	public Date getFec() {
		return fec;
	}
	public void setFec(Date fec) {
		this.fec = fec;
	}
	public String[][] getProKop() {
		return proKop;
	}
	public void setProKop(String[][] proKop) {
		this.proKop = proKop;
	}
//----------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		String produktuak="";
		for (int i = 0; i < proKop.length; i++) {
			produktuak=produktuak+proKop[i][0]+":"+proKop[i][1];
		}
		return "ntrans=" + ntrans + ",fec=" + fec + ",proKop=" + produktuak;
	}
}
