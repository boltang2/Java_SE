package Day03.operator;

/*
 * [[연산자]]
 * 1. 산술연산자
 * +, -, *, /, %
 */

public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int sum = num1 + num2;
		System.out.println(num1+"+"+num2+"="+sum);
		
		int mul = num1 * num2;
		System.out.println(num1+"*"+num2+"="+mul);
		
		int result = 10/3;
		System.out.println("10/3="+result);
		
		double dresult = 10/3.0;
		System.out.println("10/3.0="+dresult);
		
		int result2 = 9%5;
		System.out.println("9%5="+result2);
		
}
}
