package modelo;

public class Ticket extends Eragiketa{
	private int total;
//----------------------------------------------------------------------------------------------------
	public Ticket(String[][] proKop, int total) {
		super(proKop);
		this.total = total;
	}
//----------------------------------------------------------------------------------------------------
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
//----------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return super.toString()+",total=" + total;
	}

}
