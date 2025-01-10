package _05_ex;

public class InterArea_main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(5,17);
		Triangle tri = new Triangle(6,7);
		
		System.out.println("사각형의 넓이 : " +rec.area());
		System.out.println("삼각형의 넓이 : " +tri.area());
	}

}
