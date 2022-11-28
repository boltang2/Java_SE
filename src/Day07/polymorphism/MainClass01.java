package Day07.polymorphism;

import Day07.mypac.AkWeapon;
import Day07.mypac.M4A1Weapon;
import Day07.mypac.Scope;
import Day07.mypac.Weapon;

/*
 * [[ 다형성 (polymorphism) ]]
 * 		하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미.
 * 
 * instanceof 연산자
 * 	객체를 어떤 클래스를 상속받고 있는지 확인용으로 사용.
 */

								
public class MainClass01 {
	public static void main(String[] args) {
		// 일반 객체 선언 및 생성
		AkWeapon ak = new AkWeapon();
		ak.attack();
		ak.doSnipe();
		
		// 다형성을 이용한
		// 부모타입 선언 자식객체 생성
		Weapon w1 = new AkWeapon(); // new 연산자 선언시 heap area에 생김
		
		/*
		 * method area 		heap area 		stack area
		 * weapon			new akweapon	weapon w1 <- new akweapon() 참조하고 있다(주소값을 가지고 있다)
		 * 									weapon 클래스 코드를 알고있다.
		 * 결론 : weapon에 정의된 멤버만 사용가능.
		 * 		 weapon을 상속받은 객체는 모두 참조할 수 있다.
		 */	
		
		w1.attack();
		//w1.doSnipe();
		
		AkWeapon ak2 = (AkWeapon) w1; // 주소 값 복사(얕은 복사)
		Scope s1 = ak2;
		
		s1.doSnipe();
		ak2.doSnipe();
		
		System.out.println(System.identityHashCode(w1));
		System.out.println(System.identityHashCode(ak2));
		System.out.println(System.identityHashCode(s1));
		
		classifyWeapon(ak2);
		classifyWeapon(w1);
		
		M4A1Weapon m4 = new M4A1Weapon();
		classifyWeapon(m4);
	}
	
	public static void classifyWeapon (Object obj) { // Object는 최상위 부모 모든 객체는 Object를 상속받고 있음.
		//System.out.println(obj instanceof Scope);
		if(obj instanceof Scope) {
			System.out.println("Snipe Weapon");
		} else {
			System.out.println("Common Weapon");
		}
	}
}
