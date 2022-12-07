package Day10.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * [[ HashMap Class]]
 * 
 * 		- Map 인터페이스를 구현한 클래스이다.
 * 		- key값, value 값을 쌍으로 저장한다. (사전 형태)
 * 		- key값은 중복 불가
 */
public class MainClass05 {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		
		// 데이터 저장하기
		map1.put("Hello", "안녕하세요");
		map1.put("Car", "자동차");
		map1.put("Tiger", "호랑이");
		
		// 데이터 얻어오기
		String value = map1.get("Hello");
		System.out.println(value);
		
		// Map에 있는 키값 불러오기 (Set으로 반환)
		Set<String> set = map1.keySet();
		
		// Set -> 반복자 개체
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String keyValue = it.next(); // 키값 하나씩 얻어온다.
			String mapValue = map1.get(keyValue);
			System.out.println(mapValue);
		}
	}
}
