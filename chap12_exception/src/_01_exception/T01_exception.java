package _01_exception;

public class T01_exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {  // 예외가 발생할 수 있는 프로그램
			System.out.println(3);  // 현재 예외가 없기 때문에 catch문으로 넘어가지 않음
			System.out.println(4);
		} catch (Exception e) {  // 예외가 발생했을 때 처리구문
			System.out.println(5);
		}
		System.out.println(6);  // try~catch문과 상관없음
		
		
	}

}
