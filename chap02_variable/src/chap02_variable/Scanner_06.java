package chap02_variable;

import java.util.Scanner;  // Scanner 자리에 *을 넣으면 모든 클래스를 적용하겠다는 의미

public class Scanner_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*// 사용자에게 무엇을 해야 되는지 써주는 것이 좋다
		System.out.println("정수 입력 : ");
		int num1 = scan.nextInt();  // 정수형을 받을때는 nextInt()
		System.out.println("입력받은 값 : " + num1);
		
		System.out.println("이름 입력 : ");
		// 문자열로 받을 때 next()
		String name = scan.next();  // 1개의 문자열 : 김 지원(스페이스바가 있으면 2개의 문자열로 인식 --> 스페이스바가 없는 곳까지만 인식)
		System.out.println("이름 : " + name);
		
		System.out.println("당신은 학생입니까?(true/false) : ");
		// 논리형으로 받을 때 nextBoolean()
		boolean student = scan.nextBoolean();  // 한글로 받으려면 String student = scan.nextString();
		System.out.println("당신의 답은 : " + student);
		
		// 실수형으로 받을 때 nextDouble();
		
		// 문자열의 한 문장을 얻어올 때 nextLine(); --> enter를 칠 때까지
		scan.nextLine();
		
		// 24번째 줄의 엔터가 들어옴. nextLine()을 중간에 사용할 때는 한번더 써줘서 앞의 엔터를 넣어줌
		// 혹은 맨 첫줄에 넣을 때는 상관없음
		System.out.println("주소 입력 : ");
		String address = scan.nextLine();
		System.out.println("주소는 : " + address);
		
		System.out.println("성의 이니셜 한 글자 입력 : ");
		char initial = scan.next().charAt(0);  // 문자열 : 한 글자 이상
		System.out.println("성의 이니셜은 : " + initial);*/
		
		//System.out.println("정수 3개 입력(띄여쓰기로)>> ");
		//int num1 = scan.nextInt();
		//int num2 = scan.nextInt();
		//int num3 = scan.nextInt();
		//System.out.println("첫번째 숫자 : " + num1);
		//System.out.println("두번째 숫자 : " + num2);
		//System.out.println("세번째 숫자 : " + num3);
		
		/*
		 <과?제?>
		1. 사용자로부터 두 수를 입력 받아 사칙연산 출력
		2. 사용자로부터 연산자(한 글자)를 입력받아 위 1번의 두 수를 연산하여 출력
		
		ex) 
		입력받은 수 : 7 5
			7+5=12
			7-5=2
			7*5=35
			7/5=1
		
			입력받은 사칙연산 : *
			7*5=35
		 */
		System.out.println("정수 2개 입력(띄여쓰기로)>> ");
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		System.out.println("첫 번째 숫자 : " + num4);
		System.out.println("두 번째 숫자 : " + num5);
		
		System.out.println(num4+ "+" +num5+ "=" + (num4+num5));
		System.out.println(num4+ "-" +num5+ "=" + (num4-num5));
		System.out.println(num4+ "*" +num5+ "=" + num4*num5);  // 괄호를 사용하지 않아도 곱하기 나누기는 사칙연산으로 인식
		System.out.println(num4+ "/" +num5+ "=" + num4/num5);  // 소수점 이하는 안나옴 --> 정수만(몫만) 출력
		
		System.out.print("연산자 입력(+,-,*,/) : ");
		// String op = scan.next();
		char op = scan.next().charAt(0);
		if (op == '+') {
			System.out.println(num4+ "+" +num5+ "=" + (num4+num5));
		}
		else if (op == '-') {
			System.out.println(num4+ "-" +num5+ "=" + (num4-num5));
		}
		else if (op == '*') {
			System.out.println(num4+ "*" +num5+ "=" + (num4*num5));
		}
		else if (op == '/') {
			System.out.println(num4+ "/" +num5+ "=" + (num4/num5));
		}
		
	}
}
