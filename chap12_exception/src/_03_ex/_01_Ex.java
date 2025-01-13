package _03_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 두 수를 넣어서 더하는 메서드
 양수만 넣도록(음수가 들어오면 사용자 정의 예외클래스 호출)
 */

public class _01_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("더할 양수 2개 입력 : ");
		
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if (num1<0 || num2<0) {
				System.out.println("양수값만 넣으세요");
			} else {
				System.out.println("합계 : " + (num1+num2));
			}

		} catch (InputMismatchException ime) {
			System.out.println("숫자를 넣으세요");
		}
	}

}
