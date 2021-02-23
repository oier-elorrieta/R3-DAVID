package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Metodos;

class TestMetodos {
	private static Metodos metodo;
	
	@BeforeEach
	public void pre() {
		metodo= new Metodos();
		String[] produktuak = {"cola","ura","kas"};
		String[] prezioak = {"100","100","100"};
		metodo.setproKop(produktuak, prezioak);
	}
	@AfterEach
	public void post() {
		metodo = null;
	}
	
	@Test
	public void testSetproKop() {
		String[] produktuak = {"fanta","cafe","burn"};
		String[] prezioak = {"200","200","200"};
		metodo.setproKop(produktuak, prezioak);
		String[][] actual =  metodo.getprokop();
		String[][] expected = {{"fanta","0","200"},{"cafe","0","200"},{"burn","0","200"}};
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testAccionadoBotonSortu() {
		String expected = "---------------\r\r-------------------\rtotala : " +(double)0 / 100+"€";
		String actual = metodo.accionadoBotonSortu("---------------\r");
		assertEquals(expected, actual);
	}
	
	

}
