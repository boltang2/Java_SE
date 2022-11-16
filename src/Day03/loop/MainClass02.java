package Day03.loop;
/*
 * 2. do ~ while()
 * 
 * do{
 * 	반복 수행할 코드
 * }while(조건문);
 */
public class MainClass02 {
	public static void main(String[] args) {
		int count = 0;
		// 최소 한번은 출력
		do {
			System.out.println(count);
			count++;
		} while(count < 100);
	}
}
