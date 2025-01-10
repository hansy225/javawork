package _04_interface2;

public class Inter_main {

	public static void main(String[] args) {
		InterClass ic = new InterClass();
		ic.print(5);
		ic.inMethod();
		System.out.println(ic.PI);

		// Inter in = new Inter();
		// ic.PI = 4.567;  --> 상수라서 변경 못함
		// ic.Max = 586;  --> 상수라서 변경 못함
	}

}
