package Day06.abstractEX.pac;

public class Man extends Human {
	
	@Override
	public void say() {
		System.out.println("목소리가 더 굵어요.");
	}

	@Override
	public void useFire() {
		System.out.println("장작을 펴요!");

	}

}
