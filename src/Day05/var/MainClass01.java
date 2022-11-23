package Day05.var;

import Day05.mypac.Card;

/*
 * 변수란?
 * 메모리 공간에 붙여진 이름.
 * java 프로그램 사용되는 모든 값을 메모리 공간에 저장.
 * 메모리 공간에 이름을 붙여 접근 가능
 * 
 * 변수 선언 및 초기화
 * 자료형 변수명 = 값
 * 
 * 1. 타입의 따른 변수
 * 		기본형 - 예약어, 소문자로 이루어짐, 값을 가지고 있다.
 * 		8가지 boolean, byte, short, int, long, char, float, double
 * 		참조형 - 대문자로 이루어짐, 주소 값을 가지고 있다. 기본형 외 나머지
 * 
 * 2. 선언 위치에 따른 변수 
 * 		전역변수(global) - 클래스 안에 선언(멤버 변수)
 * 		지역변수(local) - 메소드 또는 생성자 안에 선언
 * 					    중괄호{} 안에 선언된 변수.
 * 						반드시 초기화 해줘야 한다.
 * 
 * 3. 정적(static) / 동적 변수
 * 		
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1.cardType);
		System.out.println(c1.number);
		System.out.println(c1.width);
		System.out.println(c1.height);
		
		Card c2 = new Card();
		c2.cardType = "heart";
		c2.number = "K";
		c2.width = 65;
		c2.height = 90;
		
		System.out.println(c2.cardType);
		System.out.println(c2.number);
		System.out.println(c2.width);
		System.out.println(c2.height);
		
		System.out.println(c1.cardType);
		System.out.println(c1.number);
		System.out.println(c1.width); // <- width, height 값이 바껴있음
		System.out.println(c1.height);
	}

}
