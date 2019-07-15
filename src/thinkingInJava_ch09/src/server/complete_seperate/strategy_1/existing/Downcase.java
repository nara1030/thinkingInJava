package server.complete_seperate.strategy_1.existing;

public class Downcase extends Processor {
	@Override
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}
