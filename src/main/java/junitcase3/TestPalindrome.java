package junitcase3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPalindrome {

	PalindromeCheck pc = new PalindromeCheck();

	@Test
	public void testPalindromeCheck() {
		assertTrue(pc.palindromeCheck("madam"));
		assertTrue(pc.palindromeCheck("mom"));
		assertTrue(pc.palindromeCheck("dad"));
		assertTrue(pc.palindromeCheck("malayalam"));
		assertFalse(pc.palindromeCheck("kerala"));
		assertFalse(pc.palindromeCheck("india"));
	}

}
