package _01_abstract;

public class Cat extends Pet {
	
	// 추상클래스를 상속받은 클래스는 반드시 추상메서드를 구현해야한다
	
	public Cat () {
		super("숏헤어", "흰색", "앙칼짐");
	}
	
	public Cat(String kind, String color, String feature) {
        super(kind, color, feature);
    }

//	@Override
//	void sound() {
//		// 추상메서드에 구현할 내용이 없다면 빈 껍데기라도 써야 됨
//	}
	 
	 @Override
	 public void sound() {
		 System.out.println("야옹");  // 구현해주지 않으면 오류 발생
	 }
	 
}
