package _01_calendar;

import java.util.Calendar;

public class T02_set_calendar {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		// 월은 0부터 시작. 항상 1을 더해줘야 함
		date1.set(2025, 2, 15);
		System.out.println("월 : " +(date1.get(Calendar.MONTH)+1));
		
		System.out.println("이달의 몇 번째 주 : " +date1.get(Calendar.WEEK_OF_MONTH));
		System.out.println("올해의 몇 번째 주 : " +date1.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("몇 일 : " +date1.get(Calendar.DAY_OF_MONTH));
		System.out.println("365일중 몇 일 : " +date1.get(Calendar.DAY_OF_YEAR));
		System.out.println("--------------------");
		
		date1.set(2025, 4-1, 20, 11, 15, 55);  // 년, 월, 일, 시, 분, 초
		System.out.println(date1.get(Calendar.HOUR) +"시");
		
	}

}
