package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import modelo.Establezimendu;
import modelo.Produktu;

class TestEstablezimendu {

	private Establezimendu e1;

	@BeforeEach
	public void pre() {
		Produktu p1=new Produktu("ura", 100, 150, "freskagarri", 000000);
		Produktu p2=new Produktu("tee", 100, 150, "freskagarri", 000323);
		Produktu[] produktuak = {p1,p2};
		e1 = new Establezimendu(produktuak, "akua", "kankun", "1515151a", "Bar", "yo");
	}
	@AfterEach
	public void post() {
		e1=null;
	}
	
	@Test
	void testEIzena() {
		e1.setEizena("traviata");
		assertEquals("traviata", e1.getEizena());
	}
	@Test
	void testDir() {
		e1.setDir("potu");
		assertEquals("portu", e1.getDir());
	}
	@Test
	void testNif() {
		e1.setNif("121212");
		assertEquals("121212", e1.getNif());
	}
	@Test
	void testMota() {
		e1.setMota("cafe");
		assertEquals("cafe", e1.getMota());
	}
	@Test
	void testJabe() {
		e1.setJabe("alguien");
		assertEquals("alguien", e1.getJabe());
	}
}
