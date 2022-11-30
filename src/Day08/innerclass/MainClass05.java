package Day08.innerclass;

import Day08.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		Car car = new Car();
		
		System.out.println(car.navi);
		
		car.option(); // car.navi = new Navi();
		System.out.println(car.navi);
		car.navi.find(); 
	}
}
