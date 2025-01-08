package _03_ex;

public class SmartPhone_me extends Phone_me {

	/*
	SmartPhone() {
		this("Galaxy", "Black");  // 나의 다른 생성자를 호출
	} */
	
	SmartPhone_me() {
		super("Galaxy", "Black");  // 부모 생성자에 직접 값을 넣어주기
	}
	
	/*
	SmartPhone(String model, String color) {
		super(model, color);
	} */
	
	String search;
	
	void search () {
		System.out.println("검색을 한다");
	}

}
