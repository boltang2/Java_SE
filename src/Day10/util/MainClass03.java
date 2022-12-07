package Day10.util;

import java.util.Vector;

/*
 * [[ Vector Class ]]
 * 
 * 		- ArrayList와 동일
 * 		- 스레드 동기화 지원
 *		- ArrayList 보다 무겁다
 */

public class MainClass03 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<>();
		
		vec.add("피카츄");
		vec.add("라이츄");
		
		for(String name : vec) {
			System.out.println("name : " + name);
		}
	}
}
