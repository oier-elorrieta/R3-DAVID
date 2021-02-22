package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Produktu;

class TestProduktu {
	private Produktu p1;
	@BeforeEach
	public void pre() {
		p1 = new Produktu("cola cao", 200, 250, "edarri", 20250124);
	}
	@AfterEach
	public void post() {
		p1=null;
	}
	@Test
	public void testIzena(){
		p1.setIzena("Wine");
		String expected = "Wine";
		String actual = p1.getIzena();
		assertEquals(expected, actual);
	}
	@Test
	public void testPreCom(){
		p1.setPreCom(150);
		int expected = 150;
		int actual = p1.getPreCom();
		assertEquals(expected, actual);
	}
	@Test
	public void testPreVen(){
		p1.setPreVen(200);
		int expected = 200;
		int actual = p1.getPreVen();
		assertEquals(expected, actual);
	}
	@Test
	public void testMota(){
		p1.setMota("freskagarri");
		String expected = "freskagarri";
		String actual = p1.getMota();
		assertEquals(expected, actual);
	}
	@Test
	public void testFecCad(){
		p1.setFecCad(2022);
		int expected = 2022;
		int actual = p1.getFecCad();
		assertEquals(expected, actual);
	}
}
