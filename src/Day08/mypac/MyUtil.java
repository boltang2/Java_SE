package Day08.mypac;

public class MyUtil {
	
	public String name = "myUtil";
	public static String name2 = "myStaticUtil";

	// 내부 클래스
	public class HelloPrinter {

		// 메소드
		public void printHello() {
			System.out.println(name + " 내부 클래스 HelloPrinter 입니다.");
			System.out.println("hello.");
		}
	}
	
	// static 내부 클래스
	public static class Calculator {
		
		// 메소드
		public void calc(int a, int b) {
			int result = a * b;
			System.out.println(name2 + " result = " + result);
		}
	}
}
