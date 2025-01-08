package _02_static;

public class T01_static_main {
	public static void main(String[] args) {
		
		/* 객체를 생성해서도 사용 가능
		T01_static ts1 = new T01_static();
		ts1.num = 10;
		ts1.numst = 100;
		System.out.println(ts1.num);
		System.out.println(ts1.numst);
		ts1.printIn();
		ts1.printSt();  // 되도록이면 클래스 이름을 쓸 것 --> 오류가 발생할 수도 있다는것을 알려줌
		
		T01_static ts2 = new T01_static();
		System.out.println(ts2.num);
		System.out.println(ts2.numst);
		ts2.printIn();
		*/
		
		// 정적 필드는 객체를 생성하지 않고도 사용 가능
		System.out.println(T01_static.numst);
		System.out.println(T01_static.nameSt);
		T01_static.printSt();
	}
}
