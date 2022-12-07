package Day09.lang;

/*
 * [[ String Class ]]
 * 		1. 불변의 객체 - 메모리에서 문자열 값이 변경되지 않는다.
 * 		2.
 */
public class MainClass03 {
	public static void main(String[] args) {
		String str1 = "abc";

		System.out.println(System.identityHashCode(str1));

		str1 = "def";

		System.out.println(System.identityHashCode(str1));

		// 문자열 길이
		String txt = "ABCDEFGHI";
		System.out.println("txt 길이 : " + txt.length());

		// 문자열 시작 문자
		String str4 = "apple";
		boolean startWith = str4.startsWith("a");
		System.out.println(startWith);

		// 문자열 마지막 문자
		String str5 = "test";
		boolean endWith = str5.endsWith("t");
		System.out.println(endWith);

		// 문자 인덱스번호 반환
		String str6 = "abcdef";
		int indexOf = str6.indexOf("d");
		System.out.println(indexOf);

		// 문자열에 지정한 문자가 마지막 인덱스에 있는지 반환
		String str7 = "AdroidApp";
		int lastIndexOf = str7.lastIndexOf("A");
		System.out.println(lastIndexOf);

		// 문자 치환
		String str8 = "A*B*C*D";
		String replace = str8.replace("*", "-");
		System.out.println(replace);

		// 문자열 나누기(배열로 변환)
		String str9 = "A:B:C:D:abcd";
		String[] split = str9.split(":");
		for (String tmp : split) {
			System.out.print(tmp + " ");
		}
		System.out.println();

		// 문자열 절삭
		String str10 = "ABCDF";
		String subString = str10.substring(0, 2);
		System.out.println(subString);

		// 소문자 변환
		String str11 = "abcDEF";
		String toLowerCase = str11.toLowerCase();
		System.out.println(toLowerCase);

		// 소문자 변환
		String str12 = "abcDEF";
		String toUpperCase = str11.toUpperCase();
		System.out.println(toUpperCase);

		// 공백제거 (앞뒤 공백만 제거함)
		String s = "           java  hi   java   ";
		String v;
		v = s.trim();
		System.out.println(v);

		// 문자비교
		String str13 = "A";
		String str14 = "B";
		int compareTo = str13.compareTo(str14);
		if (compareTo > 0) {
			System.out.println(str13 + " > " + str14);
		} else if (compareTo == 0) {
			System.out.println(str13 + " = " + str14);
		} else {
			System.out.println(str13 + " < " + str14);
		}
		
		// 문자 포함여부
		String str15 = "abcd";
		String str16 = "c";
		boolean contains = str15.contains(str16);
		System.out.println(contains);
		
		// 문자열 추가 변경할 때 주료 사용하는 자료형
		StringBuffer sb = new StringBuffer();
		
		// 문자열 추가
		sb.append("abc"); // 동기화 적용되어있음.
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(System.identityHashCode(sb));
		
		StringBuilder sbr = new StringBuilder();
		sbr.append("abc"); // 비동기
		sbr.append("def");

		

	}
}
