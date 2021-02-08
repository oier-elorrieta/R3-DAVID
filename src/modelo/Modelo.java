package modelo;

public class Modelo {
	private bbddSartze bbdd;
	
	public Modelo() {
		this.setBbdd();
	}
	public bbddSartze getBbdd() {
		return this.bbdd;
	}
	public void setBbdd() {
		this.bbdd=new bbddSartze();
	}
}
