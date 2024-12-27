package chap02_variable;

public class Char_05 {

	public static void main(String[] args) {
		// 리터럴 : 저장 공간을 만들면서 바로 값을 넣는 것
		char ch = '0';  // 숫자가 아니라 문자열
		System.out.println(ch);
		System.out.println((int)ch);  // 유니코드에 있는 0의 숫자를 실행함
		
		char ch2 = 'a'+1;  // 유니코드 97(a)+1=98 --> 유니코드 'b'
		System.out.println(ch2);
		
		char ch3 = 'A';
		// char result = ch3+1;  // 리터럴 값이 아닌 나중에 더하면 오류가 남
		// int = char + int
		
		int result = ch3+1;
		// 형변환 시 int이라는 연산을 하면 모두 int형으로 형변환이 됨.
		System.out.println(result);
	}

}
