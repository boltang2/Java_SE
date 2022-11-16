package Day03.operator;
/*
 * 3. 비교 연산자
 * >, >=, <, <=, ==, != 
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result = 10 > 20;
		
		System.out.println("10 > 20 : " + result);
		
		if(10 == 10) {
			System.out.println("10과 10은 같다.");
		}
		
		if(10 != 20) {
			System.out.println("10과 20은 다르다.");
		}
	}
}
