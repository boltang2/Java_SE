package Day08.innerclass;

import Day08.mypac.Soldier;
import Day08.mypac.Weapon;

public class MainClass04 {
	public static void main(String[] args) {
		
		/*
		 * 1. 익명클래스(Weapon 상속받은) 생성자 매개변수로 대입.
		 * 2. Soldier 생성자 실행
		 * 3. 매개변수로 받은 익명클래스 Soldier클래스
		 * 	  Weapon w에 대입.
		 * 4. 익명클래스 w의 attack 메소드 호출.
		 * 5. Soldier 생성자 종료
		 * 6. Soldier 객체 생성
		 */
		Soldier s = new Soldier(new Weapon() {
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("솔져 공격!");
			}
		});
		m
		s.w.attack();
	}
}
