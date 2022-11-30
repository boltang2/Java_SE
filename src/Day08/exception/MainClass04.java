package Day08.exception;

/*
 * [[ Exception의 종류 ]]
 * 
 * 		1. checked Exception
 * 			컴파일시에 반드시 try-catch로 처리해야 한다.
 * 
 * 		2. unchecked Exception
 * 			try-catch로 처리하지 않아도 컴파일시에 에러가 발생하지 않는다.
 * 			선택적 처리
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(2000); // 단위 ms,  일시정지 반드시 예외처리를 해줘야함.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
