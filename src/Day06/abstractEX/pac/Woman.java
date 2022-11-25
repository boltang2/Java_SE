package Day06.abstractEX.pac;

/*
 * 상속 받는 방법
 *  class 클래스명 extends 상속받을 클래스명
 */
public class Woman extends Human{

	// 오버라이딩 - 부모 메소드 재정의
	@Override
	public void useFire() {
		System.out.println("구이 요리를 해요!");
	}
	

	

}
