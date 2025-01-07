package _03_ex;

public class SmartPhone extends Phone {

	SmartPhone(String model, String color) {
		super(model, color);
	}
	
	String search;
	
	void search () {
		System.out.println("검색을 한다");
	}

}
