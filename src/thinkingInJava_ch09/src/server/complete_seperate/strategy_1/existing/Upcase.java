package server.complete_seperate.strategy_1.existing;

public class Upcase extends Processor {
	@Override
	public String process(Object input) { // ����(Covariant) �� ��ȯ
		return ((String) input).toUpperCase();
	}
}
