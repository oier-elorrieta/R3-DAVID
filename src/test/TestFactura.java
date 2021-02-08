package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Faktura;

class TestFactura {

	private Faktura f1 ;
	
	@BeforeEach
	public void pre() {
		String[][] proKop = {{"cola cao","3"},{"red bull","5"}};
		f1=new Faktura(proKop, "Markel", "Aguirre", "5555555550a", 1200);
	}
	@AfterEach
	public void post() {
		f1=null;
	}
	@Test
	public void TestIzena() {
		f1.setIzena("Gorka");
		String expected = "Gorka";
		assertEquals(expected, f1.getIzena());
	}
	@Test
	public void TestAbizena() {
		f1.setAbizena("Martinez");
		String expected = "Martinez";
		assertEquals(expected, f1.getAbizena());
	}
	@Test
	public void TestNif() {
		f1.setNif("4444444440b");
		String expected = "4444444440b";
		assertEquals(expected, f1.getNif());
	}
	@Test
	public void TestTotal() {
		f1.setTotal(23000);
		int expected = 23000;
		assertEquals(expected, f1.getTotal());
	}

}
