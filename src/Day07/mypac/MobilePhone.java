package Day07.mypac;

public class MobilePhone extends Phone{
	
	// 오버 라이딩 - 부모 메소드 재정의
	@Override
	public void call() {
		System.out.print("Mobile ");
		super.call();
	}
	
	public void sendMsg () {
		System.out.println("Message");
	}
}
