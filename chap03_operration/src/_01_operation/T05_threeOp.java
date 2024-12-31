package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항 연산자
		/*
		 조건식 ? 조건이 참일 때 실행 : 조건이 거짓일 때 실행
		 */
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(result);
		
		char re1 = num1 < num2 ? '소' : '대';
		System.out.println("num2의 숫자는 num1의 숫자보다 " + re1);
		
		// num3의 값을 절대값으로 변경하기
		int num3 = -8;
		int re2 = num3 < 0 ? -num3 : num3;
		System.out.println(re2);
		
		System.out.println("----------------------");
		
		// 사용자로부터 점수를 입력 받아 80점 이상이면 합격 그렇지 않으면 불합격 출력하기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 점수는 ? >> ");
		int score = scan.nextInt();
		
		String re3 = score >= 80 ? "합격" : "불합격";
		System.out.println("당신은 시험에 " + re3 + "했습니다.");
		
		String re4 =
				score >= 90 ? "최우수" : 
				score >=80 ? "우수" : "불합격";  // 조건을 나열할 수 있음, 세미콜론 있는 곳까지 알아서 인식 보기 편함
		System.out.println("당신은 " + re4 + "입니다.");
				
		String re5 =
				score > 100 ? "잘못 입력했습니다." :
				score >= 90 ? "A학점" :
				score >= 80 ? "B학점" :
				score >= 70 ? "C학점" :
				score >= 60 ? "D학점" :
				score >= 0 ? "F학점" : "잘못 입력했습니다.";
				// score >= 60 ? "D학점" : "F학점";
		System.out.println("당신의 학점은 " +re5);
				
				
	}

}
