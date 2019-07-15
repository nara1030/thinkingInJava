package server.complete_seperate.strategy_1.existing;

public class Processor {
	public String name() {
		return getClass().getSimpleName();
	}

	public Object process(Object input) {
		return input;
	}
}
