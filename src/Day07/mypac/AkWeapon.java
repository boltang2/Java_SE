package Day07.mypac;

/*
 * 인터페이스 상속 받는 방법
 * 
 * implements 예약어로 선언한다.
 * extends는 부모 하나만 상속가능하지만 implements는 갯수 상관 없다.
 */

public class AkWeapon implements Weapon, Scope{
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(NAME + " attack");
	}
	
	@Override
	public void attackSky() {
		// TODO Auto-generated method stub
		System.out.println(NAME + " attack sky");
	}
	
	@Override
	public void doSnipe() {
		// TODO Auto-generated method stub
		System.out.println("Do Snipe");
		
	}
}
