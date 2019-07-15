package client.complete_seperate.strategy_1;

import server.complete_seperate.strategy_1.existing.Downcase;
import server.complete_seperate.strategy_1.existing.Processor;
import server.complete_seperate.strategy_1.existing.Splitter;
import server.complete_seperate.strategy_1.existing.Upcase;
import server.util.Print;

/*
 * p226 -> existing
 *  - Creating a method that behaves differently depending on the argument object that you pass
 *    is called the Strategy design pattern.
 *  - Here, the Processor object is the Strategy, and in main() you can see three different Strategies
 *    applied to the String s.
 * p227 -> expansion
 *  - Filter has the same interface elements as Processor, but because it isn't inherited from Processor
 *    (because the creator of the Filter class had no clue you might want to use it as a Processor)
 *    you can't use a Filter with Apply.process() method, even though it would work fine.
 * p227 -> strategy_2
 *  - Basically, the coupling between Apply.process() and Processor is stronger that it needs to be,
 *    and this prevents the Apply.process() code from being reused when it ought to be.
 *  - If Processor is an interface, however, the constraints are loosened enough that you can reuse
 *    an Apply.process() that takes that interface.
 */
public class Apply {
	public static void process(Processor p, Object s) {
		Print.print("Using Processor " + p.name());
		Print.print(p.process(s));
	}

	public static String s = "Disagreement with beliefs is by definition incorrect";

	public static void main(String[] args) {
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
	}

}
