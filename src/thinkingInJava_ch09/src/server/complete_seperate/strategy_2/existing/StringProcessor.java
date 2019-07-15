package server.complete_seperate.strategy_2.existing;

import client.complete_seperate.strategy_2.Apply;

public abstract class StringProcessor implements Processor {
	@Override
	public String name() {
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);

	public static String s = "If she weighs the same as a duck, she's mad of wood";

	public static void main(String[] args) {
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(), s);
	}
}
