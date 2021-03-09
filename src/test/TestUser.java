package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.User;

class TestUser {
	
	private User us;
	
	@BeforeEach
	public void pre() {
		us = new User("mikel", "gomez", "akua", "123456789q", "panmojao");
	}
	@AfterEach
	public void post() {
		us=null;
	}
	
	@Test
	void testIzena() {
		us.setIzena("javi");
		assertEquals("javi", us.getIzena());
	}
	@Test
	void testAbizena() {
		us.setAbizena("muñoz");
		assertEquals("muñoz", us.getAbizena());
	}
	@Test
	void testEizena() {
		us.setEIzena("paez");
		assertEquals("paez", us.getEIzena());
	}
	@Test
	void testNif() {
		us.setNif("987654321a");
		assertEquals("987654321a", us.getNif());
	}
	@Test
	void testPassword() {
		us.setPasahitza("panseco");
		assertEquals("panseco", us.getPasahitza());
	}

}
