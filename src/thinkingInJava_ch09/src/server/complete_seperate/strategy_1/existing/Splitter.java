package server.complete_seperate.strategy_1.existing;

import java.util.Arrays;

public class Splitter extends Processor {
	@Override
	public String process(Object input) {
		// split() �޼ҵ� ���� ���� ���� ���� ���� ���ڿ��� �и��ȴ�:
		return Arrays.toString(((String) input).split(" "));
	}
}
