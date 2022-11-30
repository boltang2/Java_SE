package Day08.exception;

import java.util.Random;

public class MainClass02 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		Random ran = null;

		try {
			result = num1 / num2;
			ran.nextInt();
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NullPointerException ne) {
			System.out.println("null 포인터 익셉션 발생함.");
		} catch (Exception e) { // Exception은 왠만한 오류를 다 포함하기 때문에 오류를 분류할 때에는 맨 마지막에 두는 것이 좋다.
			System.out.println("에러 종류 : " + e.getMessage());
		}
	}
}
