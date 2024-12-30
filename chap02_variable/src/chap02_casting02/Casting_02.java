package chap02_casting02;

public class Casting_02 {

	public static void main(String[] args) {
		// 강제 형변환
		int num1 = 1234567;
		byte b1 = (byte) num1;
		System.out.println(b1);
		
		// 자바에서 정수의 기본 자료형 = double
		float float1 = (float)5.345;
		// float = double
		
		// 자바에서 정수의 기본 자료형 = int
		long long1 = 111345671111111L;  // 기본 자료형이 int이기 때문에(int로 인식) 오류 발생 --> 뒤에 L을 붙여볼 것(소문자 써도 되지만, 1과 l이 헷갈려서 대문자 사용을 권장)
		// long = int
		float flo2 = long1;
		
		// 65535
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println(ch1);
		
	}

}
