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
		
		// 풀이
		/* 
		// 1~6정수 
		int ran1 = (int)(Math.random()*6)+1;
		int user2;
		
		do {
			System.out.println("주사위 숫자를 맞춰보세요 : ");
			user2 = sc.nextInt();
			
			if (ran1==user2)
				System.out.println("축하합니다. 맞췄습니다.");
			else
				System.out.println("틀렸습니다. 다시 입력하세요.");
		} while (ran1!=user2) */
		System.out.println("------------------");
		
		/* 2. 구구단 옆으로 출력하기
	   ex)
	   2*1= 2   3*1= 3   4*1= 4   5*1= 5  6*1= 6   7*1= 7   8*1= 8   9*1= 9
	   2*2= 4   3*2= 6   4*2= 8   5*2=10  6*2=12   7*2=14   8*2=16   9*2=18 
	   ....
	   2*9=18   3*9=27  4*9=36   5*9=45  6*9=54   7*9=63   8*9=72   9*9=81  */
		for (int i=1; i<=9; i++) {
			for (int dan=2; dan<=9; dan++) {
				System.out.printf("%d*%d=%2d\t",dan,i,dan,i);
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		// 연습문제 01 : 1~100까지의 정수 중 5의 배수의 합계
		int sum = 0;
		//for문을 이용하여 반복 합계 연산
		for (int i=0; i<=100; i++) {
			if (i%5 == 0) {
				sum += i;
			}
		}
		System.out.println("[실행 결과]");
		System.out.println("5의 배수 합계는 " +sum);
		System.out.println("------------------");
		
		// 연습문제 02 : 1~100까지의 수 중 짝수와 홀수의 합계
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
					System.out.println("(" +x +"," +y +")");
				}
			}
		}
		System.out.println("------------------");
		
		// 연습문제 4
		System.out.println("[실행 결과]");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		// 연습문제 5
		System.out.println("[실행 결과]");
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		// 연습문제 6
		System.out.println("[실행 결과]");
		for (int i=0; i<5; i++) {
			for (int j=0; j<(4-i); j++) {
				System.out.print(" ");
			} 
			for (int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		// 연습문제 7
		System.out.println("[실행 결과]");
		int count = 1;
		while (true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println("(" +num +")");
			if (num==6) {
				break;
			}
			count++;
		}
		System.out.println("총 주사위를 굴린 횟수는 : " +count);
		
		
	}

}
