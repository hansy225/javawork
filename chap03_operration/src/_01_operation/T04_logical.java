package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리곱(and)과 논리합(or)
		/*
		 
		 0 : 거짓 / 1 : 참
		 
		 x  y   논리곱(&&)  논리합(||)
		 0  0      0         0
		 0  1      0         1
		 1  0      0         1
		 1  1      1         1
		 
		 논리곱은 두 가지 모두 참일 때만 참, 논리합은 한 가지라도 참이면 참
		 */
		
		int num1 = 10;
		int num2 = 20;
		// boolean result = num1 && num2; --> 단순히 숫자는 참과 거짓을 구분할 수 없음
		boolean result = num1==num2 && num2<num1;  // F && T
		System.out.println(result);
		
		boolean result2 = num1==num2 || num2<num1;
		System.out.println(result2);
		
		System.out.println("----------------------");
		
		// ! : not
		boolean b1 = num1>=num2;
		System.out.println(b1);
		System.out.println(!b1);
		// !! : not not (부정의 부정 = 긍정)
		System.out.println(!!b1);
		
		System.out.println("----------------------");
		
		// A~Z : 65~90, a : 97~
		char ch1 = 'K';
		System.out.println(ch1);
		/* 
		ch1 >= 'A' (참)
			   (65, 66, 67, ..., 90, 91...)
		ch1 <= 'Z' (참)
   (... 63, 64, 65    ...    89, 90)
		*/
		System.out.println("대문자인가 ? " + (ch1>='A' && ch1<='Z'));  // System.out.println("대문자인가 ? " + (ch1>=65 && ch1<=90));
		System.out.println("소문자인가 ? " + (ch1>='a' && ch1<='z'));
	}

}
