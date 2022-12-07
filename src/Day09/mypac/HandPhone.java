package Day09.mypac;

public class HandPhone {
	public String model; 
	
	static {
		System.out.println("static 초기화 블럭");
	}
	
	{
		System.out.println("초기화 블럭");
	}
	
	// 생성자 - 클래스명과 동일하다.
	public HandPhone() {
		this.model = "갤럭시";
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	
	public HandPhone(String model) {
		this.model = model;
		System.out.println("생성자로 " + model + "(이)가 전달되었습니다.");
	}
}
