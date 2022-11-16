package Day03.operator;
/*
 * 5. 대입연산자
 * =, +=, -=, *=, /=, %=
 */
public class MainClass05 {
	public static void main(String[] args) {
		// = 대입연산자 변수 num에 10 저장
		int num = 10;
		
		//num = num + 10;
		num += 10;
		System.out.println("num : " + num);
		
		num -= 5;
		System.out.println("num : " + num);
	}
}
