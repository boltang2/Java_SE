package Day07.mypac;

/*
 * 인터페이스는 왜 쓰일까?
 * 
 * 쇼밍몰
 * 		결제
 * 			-> 사용자정보 -> getMemberInfo()
 * 			-> 상품정보 -> getProductInfo()
 * 			-> 가격 -> getProducetPrice()
 * 
 * 프로그램 설계 뼈대를 만드는 것.
 * 인터페이스 변수는 final이 생략되어 있음.
 */
public interface Weapon {
	final String NAME = "AK-47"; // final 없어도 상수 취급.
	
	public void attack();
	
	public void attackSky();
}
