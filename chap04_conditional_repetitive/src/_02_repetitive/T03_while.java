package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/*
		while (조건식) {
			   조건식이 참인동안 계속 실행
		}
		* 반복문에서 같이 사용
		- break : 반복문을 빠져나올 때
		- continue : continue 뒤의 구문은 실행하지 않고 다시 반복문을 실행
		
		 */
		
		// 출력값 : 1 2 3 4 5
		// for문을 while문으로
		/*
		for (int i=1; i<=5; i++) { System.out.println(i); }
		 */
		int i = 1;  // 초기식을 바깥에 적어야 함
		while (i<=5) {  // 조건식
			System.out.println(i);
			i++;  // 증감식
		}
		System.out.println("------------------");
		
		// 1~10까지의 합계(while문으로 작성)
		i = 1;
		int sum = 0;
		while (i<=10) {
			sum = sum + i;  // sum+=i;
			i++;  // 연산 후 증가
			// sum += i++  --> 두 줄을 한줄로 작성 가능
		}
		System.out.println("1~10까지의 합계 : "+sum);
		
		System.out.println("------------------");
		
		i = 1;
		sum = 0;
		while (i<=10) {
			sum += ++i;
		}
		System.out.println("1~11까지의 합계 : "+sum);
		
		System.out.println("------------------");
		
		// break
		int count = 0;
		while (true) {
			System.out.println(++count);
			if (count==5) {
				break;
			}
		}
		
		System.out.println("------------------");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("문자1개 입력(멈추려면 'q') : ");
			char ch = sc.next().charAt(0);
			if (ch=='q') {
				break;  // 반복문 종료
			}
			System.out.println(ch);
		}
		System.out.println("프로그램 종료");
		System.out.println("------------------");
		
		sum=0;
		int j=1;
		for (j=1; j<=10; j++) {
			sum += j;
			
			if (sum>=30)
				break;
		}
		System.out.println(j+"까지의 합 : "+sum);
		
		System.out.println("====================");
		
		//continue
		// 1~100까지의 합계 중 3의 배수를 제외한 합계 구하기
		sum=0;
		for (int k=1; k<=100; k++) {
			if (k%3 == 0) {
				continue;
			}
			sum += k;
			
		}
		System.out.println("1~100까지의 3의 배수를 제외한 합 : "+sum);
		
		
	}

}
