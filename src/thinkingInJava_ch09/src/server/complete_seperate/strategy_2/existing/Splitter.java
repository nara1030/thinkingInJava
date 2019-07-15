package server.complete_seperate.strategy_2.existing;

import java.util.Arrays;

public class Splitter extends StringProcessor {
	@Override
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}
