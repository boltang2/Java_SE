package Day10.util;

import java.util.Calendar;

/*
 * [[ Calendar Class ]] 
 * 
 * 		- 날짜 관련 객체
 */
public class MainClass07 {
	public static void main(String[] args) {
		Calendar calNow = Calendar.getInstance();

		int year = calNow.get(Calendar.YEAR);
		System.out.println(year);

		int month = calNow.get(Calendar.MONTH) + 1;
		System.out.println(month);

		int day = calNow.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);

		int hour = calNow.get(Calendar.HOUR);
		int min = calNow.get(Calendar.MINUTE);
		int sec = calNow.get(Calendar.SECOND);

		System.out.println(hour + " " + min + " " + sec);
	}
}
