package Day02.basic;
/*
 * [[기본 자료형]]
 * 
 * 실수형
 * - 
 * 	float
 * 	double
 * 	float(4) < double(8)
 * 
 * 	실수계산 부동소수점 오차 예외처리 해야함
 */
public class MainClass05 {
	public static void main(String[] args) {
		// 실수형 변수 선언과 동시에 값 대입하기.
		float iFloat = 10.1f;
		double iDouble = 10.1d;
		double iDouble2 = 10.1; //  double형 d는 생략가능 default == double;
		
		System.out.println("float 형 : " + iFloat);
		System.out.println("double 형 : " + iDouble);
		System.out.println("double2 형 : " + iDouble2);
	}
}
