package Day08.exception;

/*
 * [[ 예외(Exception) ]]
 * 		프로그램 실행되는 내가 원하지 않는 결과도 같이 나오는 것을 말한다.
 * 		-예외처리 : 예외가 발생되었을 때 이를 처리하는 것
 * 
 * 		처리하는 방법:
 * 		
 * 		try {
 * 			실행코드
 * 		} catch(익셉션 명 변수명) {
 * 			해당 예외가 발생했을 경우 실행할 코드
 * 		}
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 정수 값을 저장 할 지역변수 초기화
		int num1 = 10;
		int num2 = 0;
		int result = 0;

		// result = num1/num2;

		// 1. 예측할 수 있는 범위에서는 조건물을 활용하여 가능
//		if(num2 != 0) {
//			result = num1/num2;
//			System.out.println(result);
//		} else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}

		try {
			result = num1 / num2; // 예외 발생시 아래코드 실행 x -> catch 실행
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" 0으로 나눌 수 없습니다.");
			System.out.println(" 에러 종류 : " + e.getMessage());
		}
	}
}
