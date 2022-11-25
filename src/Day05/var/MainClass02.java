package Day05.var;

import Day05.mypac.Card;

public class MainClass02 {
	// 기본형, 전역, 정적
	public static int num = 10;
	// 기본형, 전역, 동적
	public int num2 = 20; // <- 아직 MainClass02객체 생성이 안되어 있음.	
	public static void main(String[] args) {
		// static int num3 = 30; <- 지역변수는 static이 안됨
		//							실행이 끝난순간 사라지므로 static area를
		//							지울 수 없음.
		System.out.println(num);
		MainClass02 mc2 = new MainClass02();
		System.out.println(mc2.num2);
		
		Card c1 = new Card();
		
		// 클래스 내 있는 static 변수는 클래스 생성없이 사용가능
		System.out.println(Card.width);
	}
}
