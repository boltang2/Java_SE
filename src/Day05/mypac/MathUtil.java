package Day05.mypac;

public class MathUtil {
	public double pi = 3.141592;

	/**
	 * 원의 넓이를 구하는 메소드
	 * 
	 * @param r - 반지름 값
	 * @return - 원의 넓이
	 */
	public double getArea(int r) {
		double area = pi * r * r;
		return area;
	}

	/**
	 * 두 수 합계
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	/**
	 * 셋 수 합계
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int sum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
}
