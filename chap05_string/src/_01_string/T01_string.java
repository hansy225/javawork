package _01_string;

import java.util.Scanner;

public class T01_string {

	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println(name1==name2);  // true
		
		String name3 = name1;
		System.out.println(name1==name3);  // true
		
		String str1 = new String ("홍길동");
		String str2 = new String ("홍길동");
		System.out.println("주소가 같은가 ? " +(str1==str2));  // false --> 객체가 다르기때문에
		System.out.println("그 안의 값이 같은가 ? " +str1.equals(str2));  // str1.equals(str2) --> equals() 중요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주소 입력 (시 또는 도만) : ");
		String city = sc.next();
		
		if (city.equals("경기도")) {  
			// if (city == 경기도) 사용하면 오류발생 --> city의 저장 장소와 "경기도"가 저장된 장소가 같은가 ?
			System.out.println("경기도 사람");
		}
		System.out.println("종료");
	}

}
