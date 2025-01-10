package _05_ex;

public class Dog extends Pet {
	
	public Dog () {
		super("비글", "갈색", "지랄견");
	}
	
	 public Dog(String kind, String color, String feature) {
	        super(kind, color, feature);
	    }
	 
	 @Override
	 public void sound() {
		 System.out.println("멍멍");
	 }
	 
}