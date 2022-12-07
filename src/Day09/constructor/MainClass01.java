package Day09.constructor;

import Day09.mypac.HandPhone;

/*
 * [[ 생성자 (Constructor) ]]
 *  객체를 생성할 때 호줄하는 반환값이 없는 메소드. 사실 메소드는 아님
 *  객체 초기화 목적에 사용.
 *  클래스명과 동일하다.
 *  오버로딩 가능
 */
public class MainClass01 {
	public static void main(String[] args) {

		HandPhone hp = new HandPhone();
		
		HandPhone hp2 = new HandPhone("아이폰");
		
		System.out.println(hp2.model);

	}
}
