package modelo;

public class Faktura extends Eragiketa{
	private String izena;
	private String abizena;
	private String nif;
	private int total;
//----------------------------------------------------------------------------------------------------
	public Faktura(String[][] proKop, String izena, String abizena, String nif,int total) {
		super(proKop);
		this.izena = izena;
		this.abizena = abizena;
		this.nif = nif;
		this.total=total;
	}
//----------------------------------------------------------------------------------------------------
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getAbizena() {
		return abizena;
	}
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
//----------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return super.toString()+",izena=" + izena + ",abizena=" + abizena + ",nif=" + nif+ ",total=" + total;
	}
}
