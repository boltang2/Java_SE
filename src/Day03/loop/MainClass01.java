package Day03.loop;
/*
 * [[반복문]]
 * 
 * 특정 부분의 코드가 반복적으로 수행하도록 하는 제어문
 * 1. while
 * while(조건문) {
 * 		반복 수행할 코드
 * }
 */
public class MainClass01 {
	public static void main(String[] args) {
		int count = 0;
		while(true) {
			System.out.println(count);
			count++;
			if(count == 100)break;
		}
		
		int count2 = 0;
		while(count2 < 100) {
			System.out.println(count2);
			count2++;
		}
		
		int count3 = 0;
		boolean isRun = true;
		while(isRun) {
			System.out.println(count3);
			count3++;
			if(count3 == 100)isRun = false;
		}
	}
}
