package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Eskaera;

class TestEskaera {

	private Eskaera e1;
	
	@BeforeEach
	public void pre() {
		String[][] proKop = {{"cola cao","3"},{"red bull","5"}};
		e1 = new Eskaera(proKop, "ipar aguirre 22", 800);
	}
	@AfterEach
	public void post() {
		e1=null;
	}
	@Test
	public void TestDir() {
		e1.setDir("akabo kalea");
		String expected = "akabo kalea";
		assertEquals(expected, e1.getDir());
	}
	@Test
	public void TestTotal() {
		e1.setTotal(300);
		int expected = 300;
		assertEquals(expected, e1.getTotal());
	}
}
