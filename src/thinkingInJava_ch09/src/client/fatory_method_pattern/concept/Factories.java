package client.fatory_method_pattern.concept;

import server.factory_method_pattern.concept.Implementation1Factory;
import server.factory_method_pattern.concept.Implementation2Factory;
import server.factory_method_pattern.concept.Service;
import server.factory_method_pattern.concept.ServiceFactory;

/*
 * - 팩토리 패턴이란
 *   An interface is intended to be a gateway to multiple implementations,
 *   and a typical way to produce objects that fit the interface is the Factory Method design pattern.
 * 
 * - 이점
 *   Instead of calling a constructor directly,
 *   you call a creation method on a factory object which produces an implementation of the interface
 *   -this way, in theory, your code is completely isolated from the implementation of the interface,
 *    thus making it possible to transparently swap one implementation for another.
 */
public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		// Implementations are completely interchangeable:
		serviceConsumer(new Implementation2Factory());
	}
}
