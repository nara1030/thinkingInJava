package client.fatory_method_pattern.application;

import server.factory_method_pattern.application.CheckersFactory;
import server.factory_method_pattern.application.ChessFactory;
import server.factory_method_pattern.application.Game;
import server.factory_method_pattern.application.GameFactory;

public class Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move())
			;
	}

	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}
