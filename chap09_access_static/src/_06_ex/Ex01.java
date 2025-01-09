package _06_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 1. 다음 중 클래스의 구성 멤버가 아닌 것은 ? -- 3
		
		// 2. 객체에 대한 설명으로 올바르지 않은 것은 ? -- 4
		
		// 3. 다음 표에 나와있는 필드를 갖는 Person 클래스를 작성하시오
		/* class Person {
			String name;
			String gender;
			int age;
			int height;
			int weight;
		} */
		
		// 4. 생성자에 대한 설명으로 올바르지 않은 것은 ? -- 1
		
		// 5. 메서드에 대한 설명으로 올바르지 않은 것은 ? -- 4
		
		// 6. 메서드 오버로딩이 무엇인지 서술하시오
		//    : 기존에 없는 새로운 메서드를 정의하는 것
		
		// 7. 다음 코드에서 가장 나중에 실행이 종료되는 메서드는 ? -- getScore()
		
		// 8. 다음 예제의 실행 결과를 작성하시오 -- 출력값 : 123456
		//String number = "123";
		//System.out.println("출력값 : " +add(number));
		
		// 9.Excercise의 getInstance() 메서드를 호출하면 싱글톤으로 객체가 리천되도록 코드를 완성하시오
		/* Excercise ex1 = Excercise.getInstance();
		Excercise ex2 = Excercise.getInstance();
		
		System.out.println("ex1 == ex2 : " +(ex1 == ex2));
	}
	
	class Exercisse {
		
	}*/ 
	
	// 10. 클래스 내부에서 자신의 주소를 참조하는 예약어는 <this>이다.
	
	// 11. 다음과 같이 정의된 클래스를 작성하고, 객체를 생성해 메서드를 호출하시오
	/*
	 클래스명 : Math
	 메서드명 : max
	 기능 : 매개변수로 입력받은 배열 값 중 최대값을 리턴
	 매개변수 : 정수타입 배열
	 리턴값 : 정수
	 메서드명 : min
	 기능 : 매개변수로 입력받은 배열 값 중 최소값을 리턴
	 매개변수 : 정수타입 배열
	 리턴값 : 정수
	 */
	/*
	 * int [] arr = {9,5,24,13,3,21};
	 * 
	 * Math m = new Math(); int max = m.max(arr); int min = m.min(arr);
	 * 
	 * System.out.println("최대값 : " +max); System.out.println("최소값 : " +min);
	 */

	/* 8
		public static String add(String number) {
		return number + "456";
	} */
	}
	/*static class Math {
		public int max(int [] array) {
			for (int num : array) {
				if (num>max) {
					max=num;
				}
			}
			return max;
		}
	}*/
}
