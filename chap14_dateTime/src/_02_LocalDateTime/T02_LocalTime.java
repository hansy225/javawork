package _02_LocalDateTime;

import java.time.LocalTime;

public class T02_LocalTime {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.print(time.getHour() +"시 ");
		System.out.print(time.getMinute() +"분 ");
		System.out.print(time.getSecond() +"초");
		

	}

}
