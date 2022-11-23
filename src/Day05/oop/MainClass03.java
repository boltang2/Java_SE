package Day05.oop;


import Day05.mypac.MathUtil;

public class MainClass03 {
	public static void main(String[] args) {
		int r = 5;
		
		MathUtil mu = new MathUtil();
		
		double area = mu.getArea(r);
		
		System.out.println("원의 넓이는 : " + area);
		
		int sum = mu.sum(6, 4);
		
		System.out.println("6 + 4 = " + sum);
		
		System.out.println("5 + 9 + 1 = " + mu.sum(5, 9, 1));
		

	}
}
