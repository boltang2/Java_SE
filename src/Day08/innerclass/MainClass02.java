package Day08.innerclass;

import Day08.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		// MyUtil 클래스 안에 있는 HelloPrinter 클래스 객체 생성

		// 1.
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();

		hp.printHello();

		// 2.
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();

		hp2.printHello();
		
		// static 내부클래스 생성 및 호출
		MyUtil.Calculator c = new MyUtil.Calculator();
		c.calc(10,20);
		
	}
}
