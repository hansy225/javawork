package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 try안에 여러개의 예외가 발생할 경우
  - 예외의 갯수만큼 catch문을 사용할 수 있다
    : 이때 catch 첫번째부터 차례대로 본인의 예외의 클래스인지 확인 후 맞으면 예외처리
      아니면 다음 catch문으로 내려간다
 */

public class T09_multiCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나누기할 정수 2개 입력 : ");
		
		try {
			int num1 = sc.nextInt();  // inputMismatch
			int num2 = sc.nextInt();
			
			int [] num = {1,2,3};
			System.out.println(num[3]);
			
			System.out.println("몫 : " +num1/num2);  // arithmetic
			System.out.println("나머지 : " +num1%num2);
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다");
			System.out.println(ae);
			ae.printStackTrace();  // 호풀 스택에 있는 메소드 정보와 예외 메시지를 화면에 출력
			System.out.println("예외 메시지 : " +ae.getMessage());  // 예외 클래스 인스턴스에 저장된 메시지 출력
		} catch (InputMismatchException ime) {
			System.out.println("정수만 입력 가능");
		} catch (Exception e) {  // 위에 작성한 catch문 2개를 제외한 예외들은 다 여기서 처리 --> 맨마지막에 넣어야 함
			// Exception은 가장 상위 부모 : 모든 예외 다 처리
			System.out.println("예외 처리");
		}
	}

}
