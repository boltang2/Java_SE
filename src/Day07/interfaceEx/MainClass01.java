package Day07.interfaceEx;

import Day07.mypac.AkWeapon;

/*
 * [[ 인터페이스 (interface) ]]
 * 		추상 메소드만 존재.
 * 		변수 선언을 해도 변수가 아닌 상수가 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		AkWeapon ak = new AkWeapon();
		ak.attack();
		ak.attackSky();
		
	}
}
