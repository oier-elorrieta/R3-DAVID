package modelo;

public class Modelo {
	private bbddSartze bbdd;
	
	public Modelo(bbddSartze bbdd) {
		this.setBbdd(bbdd);
	}
	public bbddSartze getBbdd() {
		return this.bbdd;
	}
	public void setBbdd(bbddSartze bbdd) {
		this.bbdd=bbdd;
	}
}
