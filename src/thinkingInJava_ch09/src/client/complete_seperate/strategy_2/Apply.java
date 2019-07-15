package client.complete_seperate.strategy_2;

import server.complete_seperate.strategy_2.existing.Processor;
import server.util.Print;

/*
 * server.strategy_2.existing.StringProcessor
 */
public class Apply {
	public static void process(Processor p, Object s) {
		Print.print("Using Processor " + p.name());
		Print.print(p.process(s));
	}

}
