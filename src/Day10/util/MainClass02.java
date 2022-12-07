package Day10.util;

import java.util.ArrayList;
import java.util.List;

/*
 * [[ ArrayList Class ]] 
 * 		- 가변 배열이다.
 * 		- 인덱스 값이 있다
 */
public class MainClass02 {
	// ArrayList 객체 생성
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// 데이터 저장하기
		list.add("피카츄");
		list.add("라이츄");
		list.add("파이리");

		String str = list.get(0);
		System.out.println(str);

		list.remove(2);

		System.out.println("저장된 데이터의 개수 : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list[" + i + "] " + list.get(i));
		}
		for (String name : list) {
			System.out.println("name : " + name);
		}
		
		List<String> list2 = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<String> list3 = (List<String>) list.clone();
		
		for(String name : list3) {
			System.out.println("name : " + name);
		}
	}

}
