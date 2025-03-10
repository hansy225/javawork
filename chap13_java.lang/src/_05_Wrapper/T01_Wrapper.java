package _05_Wrapper;

/*
 Boxing과 UnBoxing
 Boxing : 기본 자료형을 참조 자료형으로 변환
 UnBoxing : 참조 자료형을 기본 자료형으로 변환
 */

public class T01_Wrapper {
	
	public static void main(String[] args) {
		// 권장사항
		Integer i1 = new Integer(3);  // deprecated : 앞으로 없어질 예정이니 되도록이면 쓰지 말아라
		Integer i2 = Integer.valueOf(3);
		
		// auto UnBoxing
		int num = Integer.parseInt("100");
		int num2 = Integer.valueOf("100");  // valueOf() : 값을 int형으로 바꿔줄 때
		System.out.println(num);
		System.out.println(num2);
		
		// Boxing
		int num3 = 10;
		Integer num4 = Integer.valueOf(num3);
		System.out.println(num4);
		
		String str = "10";  // 숫자로 변환할 수 있어야 함 --> 문자가 들어가면 안됨
		Integer num5 = Integer.valueOf(str);
		System.out.println(num5);
		
		double dou = 12.345;
		Double dou2 = Double.valueOf(dou);
		System.out.println(dou2);
		

	}

}
