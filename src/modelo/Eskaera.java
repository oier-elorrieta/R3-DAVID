package modelo;

public class Eskaera extends Eragiketa {
	private String dir;
	private int total;
//----------------------------------------------------------------------------------------------------
	public Eskaera(String[][]proKop,String dir,int total) {
		super(proKop);
		this.dir=dir;
		this.total=total;
	}
//----------------------------------------------------------------------------------------------------
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
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
		return super.toString()+",dir=" + dir + ",total=" + total;
	}
}
