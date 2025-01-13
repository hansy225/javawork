package _01_exception;

// ClassCastException : 다형성에서 부모타입을 자식타입으로 변환 시 변환할 수 없을 때
class Animal { }
class Dog extends Animal { }
class Cat extends Animal { }

public class T07_classCast {
	public static void main(String[] args) {
		try {
			Animal animal = new Animal();
			Dog dog = new Dog();
			Cat cat = new Cat();
			
			Animal aniDog = dog;
			Animal aniCat = cat;
			
			dog = (Dog)aniDog;  // 강제 형변환
			System.out.println("1예외");
			dog = (Dog)animal;  // 형변환X --> 예외 발생
			System.out.println("2예외");
		} catch (ClassCastException cce) {
			System.out.println("부모타입을 자식타입을 형변환 불가");
		}
		
	}

}
