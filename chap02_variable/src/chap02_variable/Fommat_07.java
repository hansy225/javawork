package chap02_variable;

public class Fommat_07 {

	public static void main(String[] args) {
		String url = "www.google.com";
		// 자바에서 실수형은 double이 기본 자료형 --> float형을 잘 쓰진 않음
		// 실수형 숫자를 그냥 쓰면 double형으로 인식
		float f1 = .10f;  // float f1 = 0.10; --> error
		double d1 = 1.23456789;  // 소수점 이하 6번째 자리까지 정확하게 나옴
		System.out.printf("%d, %d, %d\n", 10,5,1);
		System.out.printf("%f\n", 1.23456789); // 반올림
		System.out.printf("%f\n", f1);  // 무조건 소수점 6번째 자리까지 출력
		System.out.printf("%8f\n",d1);
		System.out.printf("%4.2f\n",d1);  // 정수와 소수점도 자리로 인식
		System.out.printf("%.2f\n", d1);  // 정수 값과 상관없이 소수점 둘째자리까지 출력 --> 외우기 중요함!! 가장 많이 사용
		System.out.println("----------------------------");
		
		System.out.printf("%s", url);  // 글씨가 나오는 것만큼만 자리 차지
		System.out.println("글씨");
		
		System.out.printf("%20s\n", url);  // 20글자의 자리를 차지 --> 오른쪽 정렬
		
		System.out.printf("%-20s", url);  // 왼쪽 정렬(20글자 자리를 차지하고 다음 글자가 나옴)
		System.out.println("글씨");
		
		System.out.printf("%.8s\n", url);  // 몇 글자만큼 자리를 차지하냐?(왼쪽에서 8글자만 출력)
		System.out.println("----------------------------");
		
		int octNum = 010;  // 8(10진수) --> 그냥 10으로 쓰면 십진수로 인식
		int hexNum = 0x10;  // 16(10진수)
		int binNum = 0b10;  // 2(10진수)
		
		// 10진수로 출력하시오
		System.out.printf("8진수=%o은 10진수=%d\n", octNum, octNum);		
		System.out.printf("16진수=%x은 10진수=%d\n", hexNum, hexNum);
		System.out.printf("%X\n", 10);  // 엑스를 대문자로 적으면 출력값도 대문자로 나옴
		System.out.printf("%x\n", 10);  // 엑스를 소문자로 적으면 출력값도 소문자로 나옴
		System.out.printf("2진수=%s은 10진수=%d\n", Integer.toBinaryString(binNum), binNum);  //2진수 출력 지시자는 없기 때문에 변환이 필요함 --> binNum을 String으로 변환
		
		int num = 77;
		String a2 = Integer.toBinaryString(num);  // 10진수 --> 2진수
		String a8 = Integer.toOctalString(num);  // 10진수 --> 8진수
		String a16 = Integer.toHexString(num);  // 10진수 --> 16진수
		
		System.out.println("10진수 77을 2진수로 변환 : "+ a2);
		System.out.println("10진수 77을 8진수로 변환 : "+ a8);
		System.out.println("10진수 77을 16진수로 변환 : "+ a16);
	}

}
