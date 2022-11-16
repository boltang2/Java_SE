package Day02.basic;
/*
 * [[참조형 데이터(레퍼런스)]]
 * 
 * String 형 (문자열)
 * -
 * 	String;
 * - 문자열을 저장할 수 있다.
 * 
 * 기본형 - boolean, char, byte, short, int, long, float, double
 * 참조형 - 기본형 제외 모든 것
 * 
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		// 변수 선언과 동시에 값 대입하기.
		String str = "안녕하세요";
		System.out.println("str : " + str);
		
		/*
		 *  h e l l o
		 *  0 1 2 3 4 -> 인덱스 번호
		 */
		
		String str1 = "Hello";
		System.out.println("1번 인덱스 : " + str1.charAt(1));
		
		String addr = "서울 특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		if(isContain) {
			System.out.println("addr 에는 특별시라는 문자열이 존재한다.");
		}
	}
}
