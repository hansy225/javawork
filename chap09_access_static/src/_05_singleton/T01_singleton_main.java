package _05_singleton;

public class T01_singleton_main {

	public static void main(String[] args) {
		// 객체를 만들지 못함. 생성자가 private
		// T01_singleton s1 = new T01_singleton();
		
		// 다 같은 주소임 = 같은 객체
		T01_singleton s1 = T01_singleton.getSingleton();
		T01_singleton s2 = T01_singleton.getSingleton();
		T01_singleton s3 = T01_singleton.getSingleton();
		
		if (s1 == s2) {  // == : 주소가 같은가를 물어보는 것
			System.out.println("같은 객체를 가리킴");
		} else {
			System.out.println("다른 객체");
		}
		// @ 뒤의 숫자가 같으면 같은 주소임
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
