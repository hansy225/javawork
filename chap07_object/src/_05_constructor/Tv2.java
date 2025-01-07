package _05_constructor;
// 생성자
//  - 객체가 만들어질 때 딱 한번만 호출


public class Tv2 {
	String company;
	String model;
	int inch;
	
	Tv2 (String company1, String model1, int inch1) {
		company = company1;
		model = model1;
		inch = inch1;
		// 생성자가 없으면 컴파일러가 빈 생성자를 하나 생성함. --> 기본생성자
		// 생성자가 있기 때문에 생성자를 생성하지 않음
	}
	
	/*
	Tv2 (int inch) {
		inch = inch;
		// 매개변수와 자료형의 갯수가 일치해야 실행이 가능함
	} */
	
	
}
