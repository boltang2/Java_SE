package Day03.loop;

/*
 * break 문
 * 제일 가까히 있는 반복문을 벗어나게 해줌
 * 이중 포문일시 안쪽 포문만 정지
 */
public class MainClass05 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("i : " + i);
		}
	}
}
