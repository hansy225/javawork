package _05_constructor;
// 생성자
//  - 객체가 만들어질 때 딱 한번만 호출

public class Tv {
	String company;
	String model;
	int inch;
	
	// 생성자 오버로딩(overloading)
	Tv() {
		System.out.println("기본 생성자 호출");
	}
	
	// 매개변수가 1개인 생성자
	Tv(String company1) {  // 지역변수 --> 끝나면 사라짐
		System.out.println("매개변수가 1개인 생성자 호출");
		company = company1;
	}
	
	Tv(String company2, String model2, int inch2) {
		System.out.println("매개변수가 3개인 생성자 호출");
		company = company2;
		model = model2;
		inch = inch2;
		
	}
	
}
