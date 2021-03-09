package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import modelo.Establezimendu;
import modelo.Produktu;

public class TestEstablezimendu {
private Establezimendu e1;
	
	@BeforeEach
	public void pre() {
		Produktu[] produktuak = {new Produktu("ura", 100, 150, "freskagarri", 000000)};
		e1 = new Establezimendu(produktuak, "akua", "kankun", "1515151a", "Bar", "yo");
	}
	@AfterEach
	public void post() {
		e1=null;
	}
}
