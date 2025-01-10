package _05_ex;

public class Cat extends Pet {
	
	public Cat () {
		super("숏헤어", "흰색", "앙칼짐");
	}
	
	public Cat(String kind, String color, String feature) {
        super(kind, color, feature);
    }
	 
	 @Override
	 public void sound() {
		 System.out.println("야옹");
	 }
	 
}
