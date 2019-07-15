package server.complete_seperate.strategy_1.expansion;

public class LowPass extends Filter {
	double cutoff;

	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}

	@Override
	public Waveform process(Waveform input) {
		return input; // Dummy processing
	}
}
