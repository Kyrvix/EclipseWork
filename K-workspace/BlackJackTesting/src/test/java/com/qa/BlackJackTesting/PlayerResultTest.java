package com.qa.BlackJackTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.BlackJack.BlackJack;

public class PlayerResultTest {
	@Test
	public void playerWins() {
		assertEquals("Player did not win", 20, BlackJack.playBlackJack(20, 15));
	}

	@Test
	public void dealerBust() {
		assertEquals("Dealer bust not working, returning highest number", 20, BlackJack.playBlackJack(20, 27));
	}
}
