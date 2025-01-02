package _03_ex;

import java.util.Scanner;

public class T01_EX02 {

	public static void main(String[] args) {
		/* 1.  주사위의 숫자 맞추기 게임
	    랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
	    사용자로 부터 숫자 입력받아서
	    숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
	    못맞췄으면 계속 물어보기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1~6 주사위 숫자를 맞추세요 : ");
		int random1 = (int)(Math.random()*6)+1;
		int user = 0;
		
		while (random1!=user) {
			user = sc.nextInt();
			if (random1==user) {
				System.out.println("축하합니다. 맞췄습니다.");
			} else {
			System.out.println("다시 시도하세요");
			}
        }
		System.out.println("------------------");
		
		// 연습문제 01
		int sum = 0;
		//for문을 이용하여 반복 합계 연산
		for (int i=0; i<=100; i++) {
			if (i%5 == 0) {
				sum += i;
			}
		}
		System.out.println("5의 배수 합계는 " +sum);
		System.out.println("------------------");
		
		// 연습문제 02
		int evenSum = 0;
		int oddSum = 0;
		
		// for문을 이용하여 반복 합계 연산
		for (int i=1; i<=100; i++) {
			if (i%2==1) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println("짝수의 합계는 "+evenSum);
		System.out.println("홀수의 합계는 "+oddSum);
		System.out.println("------------------");
		
		// 연습문제 3
		for (int x=1; x<=6; x++) {
			for (int y=1; y<=6; y++) {
				if (x+y==6) {
					
				}
			}
		}
		
		
	}

}
