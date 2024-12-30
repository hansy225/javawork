package _01_operation;

import java.util.Scanner;

public class T05_Report2 {

	public static void main(String[] args) {
		
		/* 2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		   ex.
		   첫 번째 정수 : 23
		   두 번째 정수 : 7
		
		   더하기 결과 : 30
		   빼기 결과 : 16
		   곱하기 결과 : 161
		   나누기 몫 결과 : 3 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요");
		System.out.println("두 번째 정수를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("첫 번재 정수 : " +num1);
		System.out.println("두 번째 정수 : " +num2);
		
		int result1 = num1+num2;
		int result2 = num1-num2;
		int result3 = num1*num2;
		int result4 = num1/num2;
		System.out.println("더하기 결과 : " +result1);
		System.out.println("빼기 결과 : " +result2);
		System.out.println("곱하기 결과 : " +result3);
		System.out.println("나누기 결과 : " +result4);

	}

}
