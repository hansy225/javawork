package _05_ex;

public class Pet {
	private String kind;
	private String color;
	private String feature;
	
	public Pet (String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	public void sound() {
		
	}
	
	public void info() {
		System.out.println("종류 : " +kind +" / 색상 : " +color);
	}
	
	 public String getKind() {
		 return kind;
		 }
	 public String getColor() {
		 return color;
		 }
	 public String getFeature() {
		 return feature;
		 }
	 
	@Override
	public String toString() {
		return "종류 : " +kind +" / 색상 : " +color +" / 특징 : " +feature;
	}
	 
}
