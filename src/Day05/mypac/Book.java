package Day05.mypac;

public class Book {
	public String subject = "JAVA Programmimg"; // 전역 변수
	public String writter = "K";

	public void read() {
		int page = 10; // 지역 변수
		System.out.println(subject + " 몇" + page + "페이지를 읽어요!");
	}

	public void pillow() {
		System.out.println("베개로 사용");
	}

}
