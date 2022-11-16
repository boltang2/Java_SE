package Day02.basic;
/*
 * [[형 변환]]
 * 업캐스팅(프로모션)
 * 	- 표현 범위가 더 큰 데이터형으로 변환하기
 * 	- 자동으로 된다.
 * 	- 데이터 손실이 없다.
 * 
 * 다운캐스팅(디모션)
 * 	- 표현 범위가 더 적은 데이터형으로 변환하기
 * 	- 명시적으로 해야한다.
 *  - 데이터 손실이 있을 수 있다.
 *  
 */
public class MainClass06 {
	public static void main(String[] args) {
		// 프로모션의 예
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형 변환이 된다.
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형 변환이 된다.
		
		// 디모션의 예
		float iFloat2 = (float)iDouble;
		System.out.println("iInt : " + iInt);
		int iInt2 = (int)iDouble;
		System.out.println("iInt2 : " + iInt2);
		
		
	}
}
