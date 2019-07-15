package server.factory_method_pattern.application;

import server.util.Print;

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	@Override
	public boolean move() {
		Print.print("Chess move " + moves);
		return ++moves != MOVES;
	}
}
