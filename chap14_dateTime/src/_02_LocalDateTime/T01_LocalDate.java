package _02_LocalDateTime;

import java.time.LocalDate;

public class T01_LocalDate {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear() +"년");
		System.out.println(today.getMonth());  // 영어
		System.out.print(today.getMonthValue() +"월");  // 숫자
		System.out.println(today.getDayOfMonth() +"일");  // 이 달의 날짜를 불러오는 것
		System.out.println("365일 중 " +today.getDayOfYear() +"일");  // 365일 중 몇일인지 불러오는 것
		System.out.println(today.getDayOfWeek());  // 영어
		System.out.println(today.getDayOfWeek().getValue());  // 1: 월요일
		System.out.println("------------------------");
		
		System.out.println("이달은 총 " +today.lengthOfMonth() +"일까지이다.");  // 이번 달의 마지막 날
		System.out.println("이번 년도는 총 " +today.lengthOfYear() +"일이다");
		System.out.println("------------------------");
		
		LocalDate day = LocalDate.of(2028, 5, 7);
		System.out.println("2028년은 윤년인가 ? " +today.isLeapYear());
		System.out.println("2028년도는 총 " +day.lengthOfYear() +"일이다");
		
	}

}
