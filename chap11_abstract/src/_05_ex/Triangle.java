package _05_ex;

public class Triangle implements InterArea {

	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double area() {
		return (base*height)/2;
	}

}
