package server.factory_method_pattern.concept;

import static server.util.Print.*;

class Implementation1 implements Service {

	@Override
	public void method1() {
		print("Implementation1 method1");
	}

	@Override
	public void method2() {
		print("Implementation1 method2");
	}
}
