package _02_Ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		String result1 = num1 > 0 ? "양수 입니다." : "양수가 아닙니다.";
		System.out.println("당신이 입력한 숫자는 " +result1);
		
		// 2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
		System.out.print("정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		String result2 =  
				num2 > 0 ? "양수 입니다." :
				num2 < 0 ?  "음수 입니다." : "0입니다.";
		System.out.println("당신이 입력한 숫자는 " + result2);
		
		// 3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
		System.out.print("정수를 입력하세요 : ");
		int num3 = scan.nextInt();
		String result3 = num3%2==0 ? "짝수입니다." : "홀수입니다.";
		System.out.println("당신이 입력한 숫자는 " +result3);
		
		
	/* 4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
	   사용자로부터 인원수와 사탕의 갯수를 입력받아 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕 갯수를 출력하기 */
		System.out.print("인원수 : ");
		int num4 = scan.nextInt();
		System.out.print("사탕수 : ");
		int num5 = scan.nextInt();
		
		int result4 = num5/num4;
		System.out.println("나눠가진 사탕의 개수는 " +result4 +"입니다.");
		int result5 = num5%num4;
		System.out.println("남은 사탕의 개수는 " +result5 +"입니다.");
		
   
	/* 5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
			이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.
			
			ex.
			이름 : 이준기
			학년(숫자만) : 2
			반(숫자만) : 7
			번호(숫자만) : 3
			성별(M/F) : M
			성적(소수점 둘째 짜리까지) : 97.35
			
			2학년 7반 3번 이준기 남학생의 성적은 97.35이다. */
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("학년(숫자만) : ");
		int grade = scan.nextInt();
		
		System.out.print("반(숫자만) : ");
		int cl = scan.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = scan.nextInt();
		
		System.out.print("성별(M/F) : ");
		String mf = scan.next();
		String gender = mf.equals("M") ? "남" : mf.equals("F") ? "여" : "알수없음";

		
		System.out.print("성적(소수점 둘째 자리까지) : ");
		double score = scan.nextDouble();
		
		System.out.println(grade+"학년 "+cl +"반 "+number+"번 "+name+" "+gender+"학생의 "+"성적은 "+score+"이다.");
		
		

	/* 6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
		  14세~19세 이하이면 청소년, 20세 이상이면 성인으로 출력하시오 */
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		String g = 
				age<=13 ? "어린이" :
				age>19 ? "성인" : "청소년";
		System.out.println("당신은 "+g+"입니다.");
		
		
		// 7,8,9 문제 다시 풀어볼 것
	/* 7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
	   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.*/
		System.out.print("극어 점수 입력 >> ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 입력 >> ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 입력 >> ");
		int math = scan.nextInt();
		
		double avg = (kor+eng+math)/3.0;
		String re7 = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.println(re7);

	/* 8. 주민번호를 입력받아 남자인지 여자인지 출력하기
			ex.
			주민번호를 입력하세요(- 포함) : 123456-3123456 */
		System.out.print("주민번호 입력(-포함) : ");
				
		// String regidentNum = scan.next();
		// char gen = regidentNum.charAt(7);
		
		char regidentNum = scan.next().charAt(7);
		
		String gen = regidentNum == '1' || regidentNum == '3' ? "남자" : "여자";
		System.out.println(gen);
		

	/*9.  사용자로부터 두 개를 입력 받고(num1, num2에 저장)
	    또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
	    아니면 false를 출력하세요. (단, num1은 num2보다 작아야 함) */
		System.out.print("2개의 정수 입력(첫번째 정수는 두번째 정수보다 작은 숫자이여야 함) : ");	
		int num8 = scan.nextInt();
		int num9 = scan.nextInt();
		
		System.out.print("정수 입력 : ");
		int num10 = scan.nextInt();
		
		boolean re9 = num10 <= num8 || num10 > num9;
		System.out.println(re9);
		
		// 10.
		System.out.print("3개의 정수 입력 : ");
		int num11 = scan.nextInt();
		int num12 = scan.nextInt();
		int num13 = scan.nextInt();
		
		boolean re10 = num11 == num12 && num11 == num13;
		System.out.println("3개의 숫자가 모두 같은가? " + re10);
		
	}

}
