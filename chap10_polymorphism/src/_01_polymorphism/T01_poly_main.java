package _01_polymorphism;

class A { int a = 1; }
class B extends A { int b = 2; }
class C extends A { int c = 3; }
class D extends B { int d = 4; }
class E extends C { int e = 5; }

public class T01_poly_main {
	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동형 변환 : 자식 타입을 브모 타입으로 형변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		System.out.println(b.a);
		System.out.println(b.b);
		
		System.out.println(a1.a);
		// System.out.println(a1.b); --> 부모타입을 형변환했기 때문에 객체는 있지만 사용은 할 수 없음
		System.out.println(a2.a);
		System.out.println(a3.a);
		System.out.println(a4.a);
		
		// 부모 B타입으로 형변환하면 B는 A를 상속 받았기 때문에 변수a,b 사용 가능
		B b1 = d;
		System.out.println(b1.a);
		System.out.println(b1.b);
		
	}

}
