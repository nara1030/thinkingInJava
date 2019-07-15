package server.util;

/*
 * 사용하기 쉬운 Print 메소드 작성
 */
public class Print {
	// Print with a newline
	public static void print(Object obj) {
		System.out.println(obj);
	}

	// Print a newline by itself
	public static void print() {
		System.out.println();
	}

	// Print with no line break
	public static void printnb(Object obj) {
		System.out.print(obj);
	}
}
