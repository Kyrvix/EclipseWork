package com.qa.BlackJack;

public class BlackJack {
	public static int playBlackJack(int player, int dealer) {

		int x = 5;
		String y = (x == 5) ? "was 5" : "not 5"; // Ternary = returns true (left) or false (right) as a value for y
		System.out.println(y);

		if (player > 4 && player < 31 && dealer > 4 && dealer < 31) {
			if (player > 21 && dealer > 21) {
				return 0;
			} else if (player < 22 && dealer > 21) {
				return player;
			} else if (player > 21 && dealer < 22) {
				return dealer;
			} else {
				return Math.max(player, dealer);
			}
		} else {
			return -1;
		}
	}
}
