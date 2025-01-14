package _01_langPackage;

/* clone() : 객체 복제
   1. 반드시 clone하고자하는 클래스에 implements Cloneable 반드시 넣어줘야 한다
	   : '이 클래스는 복제할 수 있는 클래스이다'라는 것을 알려줄 목적
   2. clone()을 오버라이딩하지 않아도 된다. 
      그러나 Object 클래스의 clone()메소드는 접근 제어자가 protected라서 같은 java.lang패키지에 있어야 됨
      --> 접근 못함 오류 발생
   3. 2번과 같은 이유로 clone()을 오버라이딩 해야 함
 */

class A {
	int num = 3;
	
	int getNum() {
		return num;
	}
	void setNum (int Num) {
		this.num = num;
	}
}

class Point implements Cloneable {
	int x;
	int y;
	A a = new A();  // 참조형 변수
	
	Point () { }
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int aa(int num) {
		a.num = num;
		return a.num;
	}
	
	/*
	// return의 자료형이 Object클래스를 사용할 때는 형변환을 계속 해줘야 한다
	@Override
	public Object clone () {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	@Override
	public String toString() {
		return "x= " +x +", y= " +y;
	}
} */
	
	// 처음부터 반환형을 자신의 객체 클래스로 해주면 사용 시 형변환하지 않아도 됨
	@Override
	public Point clone () {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		new A().setNum(a.num);
		
		return (Point)obj;
	}
	@Override
	public String toString() {
		return "x= " +x +", y= " +y +", a.num= " +a.num;
	}
}

public class T04_clone {
	public static void main(String[] args) {
		Point original = new Point(3,4);
		
		Point copy = (Point)original.clone();
		System.out.println("original 객체 : " +original);
		System.out.println("복제 객체 : " +copy);
		System.out.println("-----------------------------------------");
		
		original.aa(100);
		System.out.println("original 객체 : " +original);
		System.out.println("복제 객체 : " +copy);
		System.out.println("-----------------------------------------");
		
		
	}

}
