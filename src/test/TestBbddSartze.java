package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modelo.bbddSartze;

class TestBbddSartze {

private static bbddSartze bbdd;
	
	@BeforeAll
	public static void preAll() {
		bbdd = new bbddSartze();
	}
	@Test
	public void testProductuakJaso() {
		String[] expected= {"coca cola","red bull","botilatu ura","Cafe starbuss"};
		String[] actual = bbdd.produktuakJaso();
		assertArrayEquals(expected, actual);
	}
	@Test
	public void testGetPrezioak() {
		String[] expected= {"100","100","100","100"};
		String[] actual = bbdd.getPrezioak();
		assertArrayEquals(expected, actual);
	}
	@Test
	public void testProduktuPrezioa() {
		int expected = 100;
		int actual = bbdd.produktuPrezioa("coca cola");
		assertEquals(expected, actual);
	}

}
