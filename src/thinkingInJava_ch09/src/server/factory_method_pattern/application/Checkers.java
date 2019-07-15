package server.factory_method_pattern.application;

import server.util.Print;

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	@Override
	public boolean move() {
		Print.print("Checkers move " + moves);
		return ++moves != MOVES;
	}
}
