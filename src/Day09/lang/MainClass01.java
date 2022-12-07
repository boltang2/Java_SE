package Day09.lang;

/*
 * [[ java.lang 패키지 ]]
 * 		기본 제공해주는 패키지
 * 		import도 필요없음
 * 
 * [[ Object 클래스 ]]
 * 		모든 클래스의 최상위 부모이다.
 * 		즉 모든클래스는 Object 클래스를 상속받는다.
 * 		extends 생략!
 * 		
 * 		equals() 메소드 : 두 객체가 동일한 객체 true
 * 						다르면 false
 */
public class MainClass01 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1 = new Car();
		Car car2 = new Car();

		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));

		if (car1.equals(car2)) {
			System.out.println("car1 과 car2는 같습니다.");
		} else {
			System.out.println("car1 과 car2는 다릅니다.");
		}

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

		// clone 메소드로 객체 깊은복사
		Car car3 = (Car) car1.clone();
		// 주소값 복사 얕은복사
		Car car4 = car1;
		System.out.println(car1);
		System.out.println(car3);
		System.out.println(car4);
	}
}

class Car implements Cloneable {
	String model;
	String color;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
