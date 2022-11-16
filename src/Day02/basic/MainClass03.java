package Day02.basic;
/*
 * [[기본 자료형]]
 * 2. 문자형(char) <-한 글자만 가능
 * 	-char 변수명;
 * 	-전 세계에서 쓰이는 문자 형태 대부분 표현가능.
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		// char 형 변수 선언과 동시에 값 대입하기
		char ch1 = 'A';
		System.out.println("char 형 변수에 저장된 문자 : " + ch1);
		
		char ch2 = '二';
		char ch3 = '꿼';
		
		int num = ch1; //  char형을 int형으로 형변환
		System.out.println("대문자 A에 해당하는 숫자코드 : " + num);
		
		int num2 = 110;
		char ch4 = (char)num2; // int형을 char형으로 변환
		System.out.println("숫자 100에 해당하는 char : " + ch4);
	}
}
