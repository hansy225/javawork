package _02_repetitive;

public class T01_for {

	public static void main(String[] args) {
		/* 반복문
		1. for : 원하는 갯수(조건이 맞을때까지)만큼 반복하여 실행하고자 할 때
		for(초기식; 조건식; 증감식) {
			실행문
		}
		
		2. while : 조건이 맞을 때까지 반복 실행
		
		3. do ~ while
		
		 */
		System.out.println("어서오세요");  // 열 번 실행한다고 하면
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요 (생략)");
		System.out.println("-------------------------");
		
		for (int i=1; i<=10; i++) {
			System.out.println("어서오세요");
		}
		System.out.println("-------------------------");
		
		for (int i=1; i<=100; i++) {
			System.out.println(i + ". 축하합니다");
		}
		
		System.out.println("-------------------------");
		
		for (int i=100; i>=1; i--) {
			System.out.println(i + ". 감소");
		}
		
		System.out.println("-------------------------");
		
		for (int i=1; i<=100; i+=2) {  // i = i+2
			System.out.println(i +". 2씩 증가");
		}
		
		System.out.println("-------------------------");
		
		// 1~10까지의 합계 구하기
		int sum = 0;  // for문안에 넣으면 for문을 돌때마다 초기화하기 때문에 for문 밖에 작성해야 함
		for (int i=1; i<=10; i++) {
			sum += i;   // sum = sum+i;
			System.out.println("합계 : " +sum);  // 한번만 출력하고 싶다면 for문 밖에 sysout 작성
		}  // i는 for문이 종료되면 사라짐 
		System.out.println("1~10의 합계 : " +sum);
		
	}

}
