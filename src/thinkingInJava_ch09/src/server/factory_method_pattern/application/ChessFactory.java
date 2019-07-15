package server.factory_method_pattern.application;

public class ChessFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new Chess();
	}
}
