package Day10.util;

import java.util.HashSet;
import java.util.Iterator;

/*
 * [[ HashSet Class]]
 * 		- 데이터 순서가 없다
 * 		- 중복값이 들어가지 않는다.
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("A");
		
		System.out.println(hs.size());
		
		// 반복자 객체 이용해서 출력 (Iterator)
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) { // 자료가 있다면 반복문 실행
			String value = it.next();
			System.out.println(value);
		}
		
	}
}
