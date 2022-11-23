package Day04.method;

/*
 * [[ 메소드(method) ]]
 * 어떤 특정 작업을 수행하기 위한 명령문의 집함.
 * 접근 제어자 (정적) 반환 타입 메소드이릅(매개변수 타입 매개변수 명) // 선언부 {
 *  명령문 입력 // 구현부
 *  
 *  return 반환 값;
 * }
 */
/**
 * @author bolta
 *
 */
public class MainClass01 {
	public static String name;

	public static void main(String[] args) {
		System.out.println("method start");
		hello();
		String str = "김현준";
		int num = 28;
		printName(str);
		printName(str, num);
		setName("start");
		String strName = getName();
		System.out.println("전역변수 name : " + strName);
		System.out.println(getEvo("꼬부기"));
	}

	public static void hello() {
		System.out.println("Hello, World!");
	}

	public static void printName(String name) {
		System.out.println("이름 : " + name);
	}

	public static void printName(String name, int age) { // <- 오버로딩
		System.out.println("이름 : " + name + " 나이 : " + age);
	}

	public static void setName(String name) {
		MainClass01.name = name;
	}

	public static String getName() {
		return name;
	}
	
	/**
	 * 포켓몬 진화 메소드
	 * @param mon
	 * @return
	 */
	public static String getEvo(String mon) {
		String Emon = "";
		if (mon.equals("꼬부기")) {
			Emon = "어니부기";
		} else if (mon.equals("어니부기")) {
			Emon = "거북왕";
		}
		return Emon;
	}
}
