package _04_Math;

// Math 클래스 : 수학에서 쓰는 것을 메서드로 만들어 놓음
//				클래스 안의 모든 필드와 메서든 static이 붙어있음

public class T01_Math {

	public static void main(String[] args) {
		// 절댓값 : abs
		System.out.println("-15의 절댓값 : " +Math.abs(-15));
		System.out.println("-15.6789의 절댓값 : " +Math.abs(-15.6789));
		System.out.println("--------------------------------");
		
		// 소수점 이하 무조건 큰 숫자로 올림 : ceil()
		System.out.println("13.1의 올림 : " +Math.ceil(13.1));
		System.out.println("-13.1의 올림 : " +Math.ceil(-13.1));
		
		// 소수점 이하 무조건 작은 숫자로 내림 : floor()
		System.out.println("13.7의 내림 : " +Math.floor(13.7));
		System.out.println("-13.7의 내림 : " +Math.floor(-13.7));
		System.out.println("--------------------------------");
		
		// 가장 가까운 정수로 반환 : rint()
		System.out.println("13.1의 가까운 정수 : " +Math.rint(13.1));
		System.out.println("13.7의 가까운 정수 : " +Math.rint(13.7));
		System.out.println("13.5의 가까운 정수 : " +Math.rint(13.5));
		
		System.out.println("-13.1의 가까운 정수 : " +Math.rint(-13.1));
		System.out.println("-13.7의 가까운 정수 : " +Math.rint(-13.7));
		System.out.println("-13.5의 가까운 정수 : " +Math.rint(-13.5));
		System.out.println("--------------------------------");
		
		// 소수점 이하 반올림 : round()
		System.out.println("13.1을 반올림 : " +Math.round(13.1));
		System.out.println("13.7을 반올림 : " +Math.round(13.7));
		
		System.out.println("-13.1을 반올림 : " +Math.round(-13.1));
		System.out.println("-13.7을 반올림 : " +Math.round(-13.7));
		System.out.println("-13.5을 반올림 : " +Math.round(-13.5));
		System.out.println("--------------------------------");
		
		// 소수점 둘째자리까지 얻기
		double value = 12.34567;
		double value2 = value*100;
		System.out.println("12.34567을 소수점 둘째자리까지 : " +Math.round(value2)/100.0);  
		// 두 수 중에 하나는 더블형이어야 함 아니면 강제 형변환을 해야함
		System.out.println("--------------------------------");

		// 두수 중 큰수 or 작은수 : max(), min()
		System.out.println("7과 5 중 큰 수 : " +Math.max(7, 5));
		System.out.println("7과 5 중 작은 수 : " +Math.min(7, 5));
		System.out.println((char)Math.max('a', 'z'));
		System.out.println("--------------------------------");

		// 제곱연산 : pow()
		System.out.println("5의 3승 : " +(int)Math.pow(5,3));
		System.out.println("1024의 3승 : " +(int)Math.pow(1024,3));
		
		// 제곱근 : sqrt()
		System.out.println("25의 제곱근 : " +(int)Math.sqrt(25));
		System.out.println("81의 제곱근 : " +(int)Math.sqrt(81));
		System.out.println("--------------------------------");
		
	}

}
