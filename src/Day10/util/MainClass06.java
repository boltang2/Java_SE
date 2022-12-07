package Day10.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * [[ Date Class ]]
 * 
 * 		- 날짜 관련 객체
 */
public class MainClass06 {
	public static void main(String[] args) throws ParseException {
		// 날짜 객체 생성
		Date date = new Date();
		
		System.out.println(date);
		
		// 날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		String yesterday = "2022.10.14 21:12:56";
		Date yDate = sdf.parse(yesterday);
		
		System.out.println(yDate);
	}
}
