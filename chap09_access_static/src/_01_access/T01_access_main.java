package _01_access;

public class T01_access_main {

	public static void main(String[] args) {
		T01_access ac = new T01_access();
		ac.num = 10;
		
		// ac.PI = 6.7899;  --> final이 붙어있으므로 바꿀 수 없음(상수) : 값을 더는 넣을 수 없음
		System.out.println(ac.num);
		System.out.println(ac.PI);  // 출력은 가능
		
		// ac.name = "김지원";  --> private이 붙어있으므로 접근 불가
		// System.out.println(ac.name);
		ac.setName("김지원");
		String name = ac.getName();
		System.out.println(name);
		// System.out.println(ac.getName());
		// --> name에 ac.getName()값이 들어가 있으므로 어떻게 출력하든 상관없음
	}

}
