package Day03.conditional;
/*
 * [[조건문]]
 *
 * 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
 * 
 * if
 * if(조건식) {
 * 		조건식 true -> 실행 명령문
 * } else if(조건식2){
 * 		조건식2 true -> 실행 명령문
 * } else {
 * 		모든 조건식 false -> 실행 명령문
 * }
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num = 11;
		if(num % 2 == 0) {
			System.out.println("num은 짝수.");
		} else {
			System.out.println("num은 홀수.");
		}
	}
}
