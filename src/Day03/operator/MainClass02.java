package Day03.operator;
/*
 * 2. 증감 연산자
 * ++, --
 */
public class MainClass02 {
	public static void main(String[] args) {
	int num = 0;
	num = num + 1;
	System.out.println(num);
	num++;
	System.out.println(num);
	
	for(int i = 0; i < 100; i ++) {
		System.out.println(i);
	}
	
	int num2 = 0;
	num2 = num2 -1;
	System.out.println(num2);
	num2--;
	System.out.println(num2);
	
	int num3 = 0;
	System.out.println(++num3);
	num3 = 0;
	System.out.println(num3++);
	
}
}
