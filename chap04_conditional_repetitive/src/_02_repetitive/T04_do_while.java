package _02_repetitive;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		/*
		do ~ while
		
		do {
			실행문
		} while (조건식); --> 조건식을 따져서 참이면 do~while문 실행
		 */
		boolean b1 = false;
		while (b1) {
			System.out.println("while 조건식");
		}
		do {
			System.out.println("do~while 조건식");
		} while (b1);
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		do {
			System.out.print("1. for문 설명, 2. while문 설명, 3. do-while문 설명, 0. 끝내려면 입력 : ");
			result = sc.nextInt();
			switch (result) {
			case 1:
				System.out.println("반복의 조건식이 정해져 있을 때 사용하면 좋음");
				break;  // 반드시 넣어야 함
			case 2:
				System.out.println("특정 조건에 도달했을 때 break를 사용하여 종료할 때 유용");
				break;
			case 3:
				System.out.println("조건을 나중에 따지므로 무조건 한번은 실행");
				break;
			}
			
		} while (result != 0);  // 0과 같지 않으면 다시 실행 --> 거짓이 되어야 반복문을 나옴
		
	}

}
