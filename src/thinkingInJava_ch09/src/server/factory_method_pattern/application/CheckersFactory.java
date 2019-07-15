package server.factory_method_pattern.application;

public class CheckersFactory implements GameFactory {
	@Override
	public Game getGame() {
		return new Checkers();
	}
}
