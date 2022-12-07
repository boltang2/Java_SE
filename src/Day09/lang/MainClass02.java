package Day09.lang;

/*
 * [[ 래퍼 클래스 (Wrapper Class) ]]
 * 		
 * 		8개의 기본타입에 해당하는 데이터를 객체로 표현.
 * 		boolean, byte, short, int, long, float, double, char
 */
public class MainClass02 {
	public static void main(String[] args) {
		// 기본형 변수
		boolean b = true;
		
		// 구닥다리
		Boolean wb1 = new Boolean(true);
		Boolean wb2 = new Boolean(false);
		
		// 새로운
		Boolean wb3 = Boolean.valueOf(true);
		
		Integer num1 = Integer.valueOf(10);
		Integer num2 = new Integer(10);
		int num3 = 10;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("num1 == num3 : " + (num1 == num3));
		System.out.println("num1 == num2 : " + (num1 == num2));
	}
}
