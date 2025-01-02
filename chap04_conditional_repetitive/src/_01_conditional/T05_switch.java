package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		// switch ~ case문
		/*
		 switch(변수) {
		 	case 1 :
		 		변수에 들어있는 값이 1일때 실행;
		 		break;
		 	case 2 :
		 		변수에 들어있는 값이 2일때 실행;
		 		break;
		 	defalut :
		 		변수에 들어있는 값이 1,2를 제외한 나머지 숫자일 때 실행;
		 }*/
		int num =2;
		switch(num) {
		case 1:
			System.out.println("1입니다");
			break;  // break가 없으면 모든 결과가 다 나옴
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default:
			System.out.println("1,2,3을 제외한 다른 숫자");
		}
		System.out.println("switch문으 빠져 나옴");
		
		System.out.println("-----------------------------------");
		
		char ch ='K';
		switch(ch) {
		case 'K':
			System.out.println("김씨입니다");
			break;
		case 'L':
			System.out.println("이씨입니다");
			break;
		case 'P':
			System.out.println("박씨입니다");
			break;
		}
		System.out.println("성이 김,이,박 씨가 아닙니다");
		
		System.out.println("-----------------------------------");
		
		// break가 없을 때
		char ch1 ='L';
		switch(ch1) {
		case 'K':
			System.out.println("김씨입니다");
		case 'L':
			System.out.println("이씨입니다");
		case 'P':
			System.out.println("박씨입니다");
		}
		System.out.println("성이 김,이,박 씨가 아닙니다");
		
		System.out.println("-----------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 달을 입력하세요 : ");
		int mouth = sc.nextInt();
		
		switch(mouth) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울에 태어났군요");
			break;
			
		case 3: case 4: case 5:  // case문은 띄어서 써도 되고, 붙여서 써도 됨
			System.out.println("봄에 태어났군요");
			break;
		
		case 6: case 7: case 8:
			System.out.println("여름에 태어났군요");
			break;
			
		case 9: case 10: case 11:  // default로 써도 상관없지만, 사용자가 1~12사이에 숫자를 정확하게 입력했을 때만 사용 가능 --> default를 사용하고 사용자가 15를 입력을 하면 '가을에 태어났군요'가 출력이 됨
			System.out.println("가을에 태어났군요");
			break;  // --> 생략 가능, 이게 마지막 구문일 때만 가능
			default :
				System.out.println("잘못 입력");
			
		System.out.println("-----------------------------------");
		
		// 문제 : 연산할 두 숫자와 연산자를 입력받아 연산한 결과를 출력
		
		System.out.println("연산할 두 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("계산하고 싶은 연산자를 입력하세요(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);
		
		switch (op) {
			case '+':
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case '-':
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case '/':
				System.out.println(num1+"/"+num2+"="+(double)(num1/num2));
				// System.out.printf("%d/%d=%.2f", num1,num2,(double)(num1/num2));
				break;
			case '%':
				System.out.println(num1+"%"+num2+"="+(num1%num2));
				break;
			default :
				System.out.println("유효하지 않는 연산자입니다.");
				break;
			}
		}
	}

}