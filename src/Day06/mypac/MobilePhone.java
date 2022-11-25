package Day06.mypac;
//           자식                 부모 // private는 상속 못 받음
public class MobilePhone extends Phone{

	
	// 우클릭 소스 겟셋 체크
	public String getName() {
		return name;
	}

	public void setName(String name) {
		//this.name = name; //this는 자기가신을 칭함
		super.name = name; // super는 부모를 칭함
	}

	public void call() {
		System.out.println("전화를 걸어요.");
	}
}
