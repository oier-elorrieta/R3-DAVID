package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Ticket;

class TestTicket {

	private Ticket t1;
	
	@BeforeEach
	public void pre() {
		String[][] proKop = {{"cola cao","3"},{"red bull","5"}};
		t1=new Ticket(proKop, 800);
	}
	@AfterEach
	public void post() {
		t1=null;
	}
	@Test
	public void TestTotal() {
		int expected = 890;
		t1.setTotal(890);
		int actual = t1.getTotal();
		assertEquals(expected, actual);
	}
	@Test
	public void TestProKop() {
		String[][] expected = {{"ura","1"},{"cafe","3"}};
		String[][] prokop = {{"ura","1"},{"cafe","3"}};
		t1.setProKop(prokop);
		String[][] actual = t1.getProKop();
		assertArrayEquals(expected, actual);
	}
	@Test
	public void TestFecha() {
		Date d1 = new Date(10000000);
		t1.setFec(d1);
		Date expected = new Date(10000000);
		assertEquals(expected, t1.getFec());
		
	}
	@SuppressWarnings("static-access")
	@Test
	public void TestNTransakzio() {
		int expected = 2;
		assertEquals(expected, t1.getnTrasakzio());
	}
	@SuppressWarnings("static-access")
	@Test
	public void TestNTransakzio2() {
		int expected = 3;
		t1.setnTrasakzio(3);
		assertEquals(expected, t1.getnTrasakzio());
	}
	@Test
	public void TestNtrans() {
		int expected = 5;
		t1.setNtrans(5);
		assertEquals(expected, t1.getNtrans());
		
	}
	

}
