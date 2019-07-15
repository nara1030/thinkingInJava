package server.complete_seperate.strategy_1.expansion;

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}

	public Waveform process(Waveform input) {
		return input;
	}
}
