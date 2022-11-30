package Day08.innerclass;

/*
 * [[ 내부클래스 (InnerClass) ]]
 * 
 * 		클래스 안에 또 다른 클래스 정의
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		new MainClass01.InnerClass().doSomething();
		new InnerClass().doSomething();
	} // main method
	
	static class InnerClass { // 메인클래스 자체가 객체가 생성이 안되서 static으로 선언해도 new 인자를 사용해야함.
		public void doSomething() {
			System.out.println("do anything");
		}
	}
} // mainClass01
