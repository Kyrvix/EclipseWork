package com.qa.BlackJackTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.BlackJack.BlackJack;

public class BlackJackTest {
	@Test
	public void notValid() {
		assertEquals("Both are valid", -1, BlackJack.playBlackJack(15, 33));
	}

	@Test
	public void bothBust() {
		assertEquals("Didn't bust correctly", 0, BlackJack.playBlackJack(24, 22));
	}
}
