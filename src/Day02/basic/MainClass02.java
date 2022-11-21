package Day02.basic;
/*
 * [[기본자료형]]
 * 1. 논리형
 * 
 * 
 */
public class MainClass02 {
	boolean isGrobal = true; // 전역변수
	public static void main(String[] args) {
		// 논리형 지역변수 선언하기
		boolean isWait;
		// 선언한 변수에 값 대입하기
		isWait = true;
		// 저장된 값을 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값 : "+isWait);
		
		// 지역변수는 	일반적으로 선언과 동시에 값을 넣어주어야 한다.
		boolean canRun = false; // 변수 선언과 동시에 값 대입
		
		// 변수에 저장된 값을 실행도중에 바꿀 수 있다.
		
		isWait = false;
		canRun = true;
		
		System.out.println("iswait : "+isWait);
		System.out.println("canRun : "+canRun);
		
		boolean isArea = true; // 초기화
		
		System.out.println(isArea);
		
	}
}
