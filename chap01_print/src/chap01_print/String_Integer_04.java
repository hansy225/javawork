package chap01_print;

public class String_Integer_04 {

	public static void main(String[] args) {
		// +,- : 숫자일 때는 연산을 하지만 문자가 들어오면 연결해주는 역할
		// - 는 문자가 들어와도 연결해주지 않지만 문자와 숫자가 혼합되어 있으면 원하는 결과가 다를 수 있음
		// + : 숫자는 연산을 실행, 문자열은 연결시켜주는 역할을 함
		System.out.println(5+3+" : 5+3의 연산결과");
		
		// 처음에 문자열이 나오면 뒤에는 모두 다 문자로 인식
		System.out.println("5+3=" + 5+3);  // 문자열로 인식하기 때문에 8이 아니라 53이 나옴
		
		// 문자열 뒤에 숫자로 인식하게 하고 싶으면 소괄호 안에 넣어준다
		System.out.println("5+3=" + (5+3));  // 소괄호 안에 있는 숫자는 연산으로 인식
		// System.out.println("5-3=" + 5-3); --> error : +,-는 문자열로 인식.(-는 정의되어 있지 않음)
		System.out.println("5-3=" + (5-3));
		// +,-를 제외한 연산자는 그냥 연산자로 인식하여 소괄호 안에 넣지 않아도 됨
		System.out.println("5*3=" + 5*3);
		System.out.println("5/3=" + 5/3);
	}

}
