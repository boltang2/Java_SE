package Day10.util;

import java.util.Stack;

/*
 * [[ Stack Class ]]
 * 		- 배열성 클래스 (collection)
 * 		- 선입 후출
 * 
 * 		Generic
 * 		1.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		
		// <> 데이터 타입을 정할 수 있음.
		Stack<String> stack = new Stack<>();
		
		stack.push("피카츄");
		stack.push("라이츄");
		stack.push("파이리");
		
		System.out.println("데이터의 개수 : "  + stack.size());
		
//		System.out.println("1 : " + stack.pop());
//		System.out.println("2 : " + stack.pop());
//		System.out.println("3 : " + stack.pop());
		
		// 가장 위에 있는 데이터 출력
		System.out.println("가장 위에 있는 데이터 : " + stack.peek());
		
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println("pop한 데이터 : " + name);
		}
		
	}
}
