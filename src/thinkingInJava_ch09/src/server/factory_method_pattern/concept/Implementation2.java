package server.factory_method_pattern.concept;

import static server.util.Print.*;

class Implementation2 implements Service {
	@Override
	public void method1() {
		print("Implementation2 method1");
	}

	@Override
	public void method2() {
		print("Implementation2 method2");
	}
}
