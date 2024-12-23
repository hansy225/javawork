package chap02_variable;

public class Int_01 {

	public static void main(String[] args) {
		// 변수 : 저장공간
		/* int : 정수를 저장하는 공간 (4byte = 32bit)
		   double : 실수를 저장하는 공간 (8)
		   char : 문자 1개 (8)
		   String : 문자열 (4)
		 */
		
		// 컴퓨터 언어는 2진수로 되어 있음 --> 0,1로 이루어져 있음
		// 1bit : 1개(0 또는 1)
		// 1byte = 8bit
		
		/*자료형 변수명;
		  변수명 = 값; */		
		int number;
		number = 3; // 대입 연산자('같다'의 의미가 아님 --> 오른쪽에 있는걸 왼쪽에 대입)
		System.out.println(number);
		
		// 기존의 저장공간에 덮어쓰기
		number = 4;
		System.out.println(number);
		
		// 새로운 저장공간 만들기 --> 새로운 저장 공간을 만들 때는 int를 써야 됨
		int number2 = 5;
		// 저장공간을 새로 만들 때는 이름이 같아서는 안됨 --> error
		// int number2 = 10;(X) number2 = 10;(O)
		// 변수를 덮어쓰는 건 가능
		System.out.println(number); // 마지막에 변경된 변수의 값이 들어감
		System.out.println(number2);
		
		int sum = number+number2;
		System.out.println(number+ "+" +number2+ "=" + number+number2);
		System.out.println(number+ "+" +number2+ "=" +sum);
	}

}
