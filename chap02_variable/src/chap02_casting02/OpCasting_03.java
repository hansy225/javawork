package chap02_casting02;

public class OpCasting_03 {

	public static void main(String[] args) {
		// 윗부분 안적은거 적어야함
		
		// 리터럴일때는 연산이 아니라 다음 글자를 의미
		char c1 = 'A'+1;
		System.out.println(c1);
		
		int ch = c1+1;  //연산
		char ch2 = (char)(c1+1);
		System.out.println(ch);
		System.out.println(ch2);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1/num2;
		System.out.println(result3);
		
		double result4 = num1/num2;  // double = int (33.0 = 33)
		System.out.println(result4);
		
		double result5 = (double)num1/num2;  // --> double/int
		System.out.println(result5);
		// num1/(double)num2; --> int/double
		// (double)num1/(double)num2; --> double/double
		// 한개 이상이 double이라면 double로 가능
		
	}

}
