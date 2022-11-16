package Day02.basic;
/*
 * [[기본 자료형]]
 * 정수형
 * - 
 * 	byte;	-128~127
 * 	short; 	-32,768~32,767 
 * 	int;	-2,147,483,648~2,146,483,647
 * 	long;	매우큼
 * 	
 * - 같은 정수형이지만 표현범위가 다르다.
 * byte(1) < short(2) < int(4) < long(8) byte
 */

public class MainClass04 {
	public static void main(String[] args) {
		byte iByte = 10;
		short iShort = 100;
		int iInt = 1000;
		long iLong = 10000;
		
		System.out.println("byte 형 : " + iByte);
		System.out.println("iShort 형 : " + iShort);
		System.out.println("iInt 형 : " + iInt);
		System.out.println("iLong : " + iLong);
	}
}
