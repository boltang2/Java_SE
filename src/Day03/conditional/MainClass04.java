package Day03.conditional;

public class MainClass04 {
	public static void main(String[] args) {
		char ch = 'w';
		
		switch (ch) {
		case 'w':
			System.out.println("앞 이동");
			break;
		case 'a':
			System.out.println("좌측 이동");
			break;
		case 's':
			System.out.println("뒤 이동");
			break;
		case 'd':
			System.out.println("우측 이동");
			break;
		default:
			System.out.println("공격!");
			break;
		}
	}
}
