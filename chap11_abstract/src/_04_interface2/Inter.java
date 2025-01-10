package _04_interface2;

public interface Inter {
	// 상수만 사용가능
	public static final double PI = 3.14;
	int MAX = 100;  // 컴파일 시 public static final

	// 추상 메서드만 사용가능
	public abstract void print(int a);
	public abstract void inMethod();
	String inStr (String name);
	
}
