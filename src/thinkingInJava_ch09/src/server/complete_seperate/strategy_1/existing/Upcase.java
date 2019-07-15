package server.complete_seperate.strategy_1.existing;

public class Upcase extends Processor {
	@Override
	public String process(Object input) { // 공변(Covariant) 값 반환
		return ((String) input).toUpperCase();
	}
}
