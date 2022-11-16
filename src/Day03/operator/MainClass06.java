package Day03.operator;
/*
 * 6. 삼항연산자(조건문과 비슷)
 * 조건식 ? 참 : 거짓
 */
public class MainClass06 {
	public static void main(String[] args) {
		int num = -10;
		String result = num > 0 ? "num은 양수" : "num은 음수";
		System.out.println(result);
	}
}
