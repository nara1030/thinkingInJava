package server.complete_seperate.strategy_2.expansion;

import server.complete_seperate.strategy_1.expansion.Filter;
import server.complete_seperate.strategy_1.expansion.Waveform;
import server.complete_seperate.strategy_2.existing.Processor;

public class FilterAdapter implements Processor {
	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}
}
