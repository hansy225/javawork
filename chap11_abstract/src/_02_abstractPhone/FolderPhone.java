package _02_abstractPhone;

public class FolderPhone extends Phone {
	FolderPhone () {
		super("실버폰", "검정");
	}
	
	FolderPhone(String model, String color) {
		super(model, color);
	}
	
	@Override
	void hangUp() {
		System.out.println("폰을 연다");
	}
	
	@Override
	void hangOut() {
		System.out.println("폰을 닫는다");
	}

}
