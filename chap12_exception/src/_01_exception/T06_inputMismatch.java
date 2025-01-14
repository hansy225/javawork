package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T06_inputMismatch {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		System.out.println("<정수 3개 입력>");
		
		int sum = 0;
		for (int i=0; i<=3; i++) {
			System.out.print(i+ "번째 정수 입력 : ");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("합계 : " +sum); 
*/
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("<정수 3개 입력>");
		int sum = 0;
		
		try {
			for (int i=0; i<=3; i++) {
				System.out.print(i+ "번째 정수 입력 : ");
				int num = sc.nextInt();
				sum += num;
			}
		} catch (InputMismatchException ime) {
			System.out.println("정수만 입력 가능");
		}
		System.out.println("합계 : " +sum);
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("<정수 3개 입력>");
		int sum = 0;
		
		for (int i=1; i<=3; i++) {
			System.out.print(i+ "번째 정수 입력 : ");  // 정수가 아닌 값이 들어올 경우 초기화 시켜줘야 함 --> 무한반복
			
			try {
				int num = sc.nextInt();
				sum += num;
			} catch (InputMismatchException ime) {  // 안맞는 자료형을 넣었을 때 발생하는 오류
				System.out.println("정수만 입력 가능");
				sc.next();  // 정수가 아닌 값이 들어온걸 비워줌
				i--;
			}
		}
		System.out.println("합계 : " +sum);
		
		
	}

}
