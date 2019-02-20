package mainTest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import main.Book;
import main.Item;
import main.Magazine;
import main.Map;

public class LibraryTesting {
	@Test
	public void uniqueTestBook() {
		Book book = new Book("Sojourn", 6275);
		if (book.getTitle() == null) {
			fail();
		}
	}

	@Test
	public void uniqueTestMap() {
		Map map = new Map("England", 354);
		if (map.getLocation() == null) {
			fail();
		}
	}

	@Test
	public void uniqueTestMag() {
		Magazine mag = new Magazine("Teenagers", 358);
		if (mag.getDemographic() == null) {
			fail();
		}
	}

	@Test
	public void checkinTest() {
		Item book = new Book("Sojourn", 357);
		assertEquals("Contains no books", true, Item.inventory.contains(book));
	}
}
