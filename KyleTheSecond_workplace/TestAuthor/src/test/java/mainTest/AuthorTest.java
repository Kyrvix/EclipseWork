package mainTest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import main.Author;

public class AuthorTest {
	@Test @Ignore
	public void testAuthor() {
		Author testing = new Author("b");
		assertNull(testing.getName());
	}
	@Test
	public void testAuthorString() {
		Author testing = new Author("b");
		assertNotNull(testing.getName());
	}
	@Test
	public void testSetName() {
		Author testing = new Author();
		testing.setaName("a");
		assertEquals("a", testing.getName());
	}
	@Test
	public void testFail() {
		Author testing = new Author("Charles");
		if (testing.getName() != "Charles") {
			fail("This has failed");
		}
	}
}
