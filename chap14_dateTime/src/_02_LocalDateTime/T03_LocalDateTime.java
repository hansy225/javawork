package _02_LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println("------------------------------------");
		
		LocalDateTime startDay = LocalDateTime.of(2025, 12, 30, 10, 0, 0);
		LocalDateTime endDay = LocalDateTime.of(2025, 7, 21, 18, 30, 0);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a HH:mm:ss");
		System.out.println("시작일 : " +startDay.format(dtf));
		System.out.println("종료일 : " +endDay.format(dtf));
		System.out.println("------------------------------------");
		
		if(today.isBefore(endDay)) {
			System.out.println("수업중");
		} else if (today.isAfter(endDay)) {
			System.out.println("종료된 수업입니다");
		} else if (today.isEqual(endDay)) {
			System.out.println("오늘은 수업 종료날");
		}

	}

}
