package server.complete_seperate.strategy_1.existing;

import java.util.Arrays;

public class Splitter extends Processor {
	@Override
	public String process(Object input) {
		// split() 메소드 인자 값에 의해 여러 개의 문자열로 분리된다:
		return Arrays.toString(((String) input).split(" "));
	}
}
