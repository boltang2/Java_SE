package Day05.oop;

/*
 * [[ 객체 ]]
 * 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서
 * 자신과 다르거나 식별 가능한 것
 * 
 * 예) 실제 존재하는 - 자동차, 휴대폰, 컴퓨터, 학생, 클라이언트
 * 	   추상적인 것 - 주문, 배송, 생간
 * 모두 객체가 될 수 있다.
 * 
 * 최소한의 프로그램 단위
 * 
 * 객체를 만들기 위해서 주형 또는 설계도가 필요 -> class
 * 
 * class에 작성된 코드를 읽어 객체화 한다 -> 메모리에 적재
 * 
 * 클래스 구조
 * 
 * class 클래스명 {
 * 		생성자
 * 		변수
 * 		메소드
 * }
 * 
 * 객체화 
 * 클래스명 변수명 = new 클래스명();
 * 
 * 객체 구성요소
 * 		생성자 -> 초기화 new로 정의 되었을때 딱 한번 실행
 * 		변수(멤버 변수, 멤버 필드) -> 속성값
 * 		메소드 -> 기능
 */

// 실행 하는 메인 클래스
public class MainClass01 {
	public static void main(String[] args) {
		Car car1 = new Car();

		System.out.println("car1 model : " + car1.model);
		System.out.println("car1 color : " + car1.color);
		car1.drive();
		car1.autopilot();

		Car car2 = new Car();
		car2.model = "페라리";
		car2.color = "blue";

		System.out.println("car1 model : " + car2.model);
		System.out.println("car1 color : " + car2.color);
		car2.drive();
		car2.autopilot();
	}
}

// Car 클래스 생성
class Car {
	String model = "포르쉐";
	String color = "red";

	// 드라이브 함수
	public void drive() {
		System.out.println(model + " 드라이브 on");
	}

	// 자율주행
	public void autopilot() {
		System.out.println("자율주행 on");
	}

}
