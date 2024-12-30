package chap02_variable;

import java.util.Scanner;

public class Report_08 {

	public static void main(String[] args) {
		// 사용자로부터 국어, 수학, 컴퓨터의 점수를 입력 받아 총점과 평균(소수점 둘째자리까지(반올림)) 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어, 수학, 컴퓨터 점수를 입력 (띄여쓰기로 구분 >>)");
		
		int kor = scan.nextInt();
		int math = scan.nextInt();
		int com = scan.nextInt();
		
		System.out.print("국어 점수:"+ kor);
		System.out.print(" / 수학 점수:"+ math);
		System.out.println(" / 컴퓨터 점수:"+ com);
		System.out.println("-------------------------------------------");
		
		System.out.println("총점 : "+ (kor+math+com));
		
		double p = (kor+math+com)/3.0;  // float는 정수형이기 때문에 소수점이 안나옴 --> 나누기도 소수점으로 쓰기
		System.out.printf("평균 : %.2f", p);
		
		/* 설명
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("국어 점수 입력 >> ");
		 int kor = scan.nextInt();
		 System.out.print("수학 점수 입력 >> ");
		 int math = scan.nextInt();
		 System.out.print("컴퓨터 점수 입력 >> ");
		 int com = scan.nextInt();
		 
		 int sum = kor+math+com;
		 double avg = sum/3.0;
		 
		 System.out.println("총점 : "+ sum);
		 System.out.printf("평균 : ", avg);
		 */
	}

}
