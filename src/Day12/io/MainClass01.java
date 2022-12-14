package Day12.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * [[ I/O ]]
 * 
 * 		입력/출력 패키지
 * 		예) 키보드 입력, 마우스 클릭, 터치
 * 			모니터 출력, 프린터 출력
 */
public class MainClass01 {
	public static void main(String[] args) throws IOException {
		// File 객체 - 경로정보를 받아 파일 또는 디렉토리 정보를 객체화
		File f = new File("C://");

		// c 드라이브 하위에 있는 모든 디렉토리 및 파일을 반환한다(배열로).
		String[] list = f.list();

		// Calendar 객체를 현재 시스템 날짜로 생성한다.
		Calendar c = Calendar.getInstance();

		for (String tmp : list) { // 파일목록 반복문 이용하여 하나씩 가져오기
			// c 드라이브의 하위 디렉토리 및 파일을 새로운 File 객체로 생성한다.
			File f2 = new File(f, tmp);

			// 1970년 1월 1일 부터 현재 수정한 날짜를 밀리세컨드 단위로 반환한다.
			long lastMod = f2.lastModified();

			// 현재 파일 또는 디렉토리의 마지막 수정한 날짜를 calendar 객체로 다시 설정
			c.setTimeInMillis(lastMod);

			// 날짜포맷 만들어주는 객체
			SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");

			// SimpleDateFormat 객체를 활용해 Calendar 객체를 사용자 포맷 문자열로 반환한다.
			// Calendar 객체 getTime 메소드 이용하여 Date 객체로 변환한다.
			String today1 = s.format(c.getTime());

			// isDirectory() 디렉토리이면 true, 파일이면 false
			if (f2.isDirectory()) {
				System.out.print(f2.getName() + "(디렉토리) - ");
				System.out.println(today1);
			}
		}// for end
		
		for(String tmp : list) {
			File f2 = new File(f, tmp);
			long lastmod = f2.lastModified();
			c.setTimeInMillis(lastmod);
			SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");
			String today1 = s.format(c.getTime());
			
			if(f2.isFile()) {
				String size = String.format("%,d", f2.length());
				System.out.print(f2.getName() + "(파일) " + size + "byte - ");
				System.out.println(today1);
			}
			
		}//for end
		
		// ./ = 현재경로
		File f3 = new File("./", "test.txt");
		// 파일을 생성하면 return true, 생성하지 못하면 return false
		f3.createNewFile();
		// 파일을 삭제하면 return true, 삭제하지 못하면 return false
		// f3.delete();
		
		File f4 = new File("./upload/2022/12/12");
		f4.mkdirs();
		
		File f5 = new File(f4, "test.txt");
		f5.createNewFile();
	}
}
