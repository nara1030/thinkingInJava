package server.complete_seperate.strategy_2.expansion;

import client.complete_seperate.strategy_2.Apply;
import server.complete_seperate.strategy_1.expansion.BandPass;
import server.complete_seperate.strategy_1.expansion.HighPass;
import server.complete_seperate.strategy_1.expansion.LowPass;
import server.complete_seperate.strategy_1.expansion.Waveform;

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}
