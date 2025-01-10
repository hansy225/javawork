package _01_abstract;

public class Pet_main {

	public static void main(String[] args) {
		Pet pet1 = new Cat();
		pet1.info();
		System.out.println("------------------------------------");
		System.out.println(pet1);
		System.out.println("------------------------------------");
		System.out.print("울음소리 : ");
		pet1.sound();
		System.out.println("종류는 : " +pet1.getKind());
		System.out.println("색상은 : " +pet1.getColor());
		System.out.println("특징은 : " +pet1.getFeature());
		System.out.println("------------------------------------");
		
		Pet pet2 = new Dog();
		pet2.info();
		System.out.println("------------------------------------");
		System.out.println(pet2);
		System.out.print("울음소리 : ");
		pet2.sound();
		System.out.println("종류는 : " +pet2.getKind());
		System.out.println("색상은 : " +pet2.getColor());
		System.out.println("특징은 : " +pet2.getFeature());
		System.out.println("------------------------------------");
		
		Pet pet3 = new Frog();
		pet3.info();
		System.out.println("------------------------------------");
		System.out.println(pet3);
		System.out.println("------------------------------------");
		System.out.print("울음소리 : ");
		pet3.sound();
		System.out.println("종류는 : " +pet3.getKind());
		System.out.println("색상은 : " +pet3.getColor());
		System.out.println("특징은 : " +pet3.getFeature());
		
	}

}
