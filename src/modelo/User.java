package modelo;

public class User {
private String Izena;
private String Abizena;
private String EIzena;
private String Nif;
private String Pasahitza;
public User(String izena, String abizena, String eIzena, String nif, String pasahitza) {
	this.Izena = izena;
	this.Abizena = abizena;
	this.EIzena = eIzena;
	this.Nif = nif;
	this.Pasahitza = pasahitza;
}
public String getIzena() {
	return this.Izena;
}
public void setIzena(String izena) {
	this.Izena = izena;
}
public String getAbizena() {
	return this.Abizena;
}
public void setAbizena(String abizena) {
	this.Abizena = abizena;
}
public String getEIzena() {
	return this.EIzena;
}
public void setEIzena(String eIzena) {
	this.EIzena = eIzena;
}
public String getNif() {
	return this.Nif;
}
public void setNif(String nif) {
	this.Nif = nif;
}
public String getPasahitza() {
	return this.Pasahitza;
}
public void setPasahitza(String pasahitza) {
	this.Pasahitza = pasahitza;
}


}
