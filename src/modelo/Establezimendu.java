package modelo;

public class Establezimendu {
private Produktu [] produktuak;
private String Eizena;
private String Dir;
private String Nif;
private String Mota;
private String Jabe;
public Establezimendu(Produktu[] produktuak, String eizena, String dir, String nif, String mota, String jabe) {
	this.produktuak = produktuak;
	this.Eizena = eizena;
	this.Dir = dir;
	this.Nif = nif;
	this.Mota = mota;
	this.Jabe = jabe;
}
public Produktu[] getProduktuak() {
	return this.produktuak;
}
public void setProduktuak(Produktu[] produktuak) {
	this.produktuak = produktuak;
}
public String getEizena() {
	return this.Eizena;
}
public void setEizena(String eizena) {
	this.Eizena = eizena;
}
public String getDir() {
	return this.Dir;
}
public void setDir(String dir) {
	this.Dir = dir;
}
public String getNif() {
	return this.Nif;
}
public void setNif(String nif) {
	this.Nif = nif;
}
public String getMota() {
	return this.Mota;
}
public void setMota(String mota) {
	this.Mota = mota;
}
public String getJabe() {
	return this.Jabe;
}
public void setJabe(String jabe) {
	this.Jabe = jabe;
}


}
