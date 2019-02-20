package maintest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.NotMain;

public class GoldilocksTesting {
	
	NotMain nm = new NotMain();

	@Test
	public void isSheAlive() {
		assertNotEquals("She doesn't exist", nm.doThings(100, 80));
	}
	
	@Test
	public void porridgeListPopulated() {
		assertNotEquals("You have no porridge", nm.doThings(100, 80));
	}
	
	@Test
	public void chairListPopulated() {
		assertNotEquals("You have no chairs", nm.doThings(100, 80));
	}
	
	@Test
	public void ifNoChair() {
		assertEquals("No suitable chair", nm.doThings(0, 0));
	}
	
	@Test
	public void canFindChair() {
		assertNotEquals("No suitable chair", nm.doThings(999, 999));
	}
}
