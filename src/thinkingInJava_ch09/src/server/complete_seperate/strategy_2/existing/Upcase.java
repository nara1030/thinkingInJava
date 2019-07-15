package server.complete_seperate.strategy_2.existing;

public class Upcase extends StringProcessor {
	@Override
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}
}
