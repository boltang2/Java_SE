package Day03.loop;

/*
 * continue 문
 * 해당 반복문의 아래코드를 스킵하고 기존 반복문 재생
 */
public class MainClass06 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("i : " + i);
		}
	}
}
