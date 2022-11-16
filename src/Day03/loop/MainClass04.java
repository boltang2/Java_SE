package Day03.loop;
/*
 * for 반복문 연습
 * 주말 숙제 코드 분석하기 이중 for문
 *
 */
public class MainClass04 {
	public static void main(String[] args) {
		// 1번숙제 분석!
		System.out.println("1번");
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * 2번숙제 
		 * 1번 뒤집어서
		 *       *
		 *      **
		 *     ***
		 *    ****
		 *   *****
		 *  ******
		 * *******
		 * 3번숙제
		 *    *
		 *   ***
		 *  *****
		 * *******
		 * 4번숙제
		 *    *
		 *   ***
		 *  *****
		 * *******
		 *  *****
		 *   ***
		 *    *
		 */
		// 2번
		System.out.println("2번");
		for(int i = 0; i < 7; i++) {
			for(int j = 6; j > 0; j--) {
				if(j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 3번
		System.out.println("3번");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 7; j++) {
				if(j >= 3-i && j <= 3 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		// 4번
		System.out.println("4번");
		int num = 0;
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(j >= 3 - num && j <= 3 + num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			if(i < 3) num++;
			else num--;
			
			System.out.println();
		}
		
	}
}
