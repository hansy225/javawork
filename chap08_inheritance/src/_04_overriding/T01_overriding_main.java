package _04_overriding;
/*
오버라이딩
 - 상속 관계의 메소드에서만 가능
 - 선언부가 같아야 한다
   * 자식 클래스에서 내용만 다르게 프로그램
 */

class Over {
	void show (String str) {
		System.out.println("부모 클래스 메소드 : " +str);
	}
	void print (String str) {  // 오버라이딩 X
		System.out.println("부모 클래스 print메소드 : " +str);
	}
}

class OverChild extends Over {
	void show (String child) {
		System.out.println("자식 클래스 메소드 : " +child);
	}
}

public class T01_overriding_main {
	public static void main(String[] args) {
		OverChild oc = new OverChild();  // 자식으로 객체를 생성했기 때문에
		// 무조건 나 자신에게 메소드가 있나 먼저 확인하고 있으면 수행
		// 		나 자신에게 없으면 부모에게 가서 찾아서 있으면 실행
		oc.show("자바 프로그래밍");
		oc.print("나나나");  // 1. 자신한테 있나 확인 2. 없으면 부모 확인
		
		Over ov = new Over();  // 부모 객체 생성
		ov.show("오라클");
	}

}
