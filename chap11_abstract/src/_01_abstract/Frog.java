package _01_abstract;

public class Frog extends Pet {
	
	public Frog () {
		super("청개구리", "초록색", "점프뜀");
	}
	
	 public Frog(String kind, String color, String feature) {
	        super(kind, color, feature);
	    }
	 
	 @Override
	public void sound() {
		 System.out.println("개굴");
	 }
	 
}