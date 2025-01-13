package _06_interfaceDefault;

public class InterClass2 implements Inter {

	@Override
	public int method1() {
		return 0;
	}

	@Override
	public int method2() {
		return 0;
	}

	@Override
	public int method() {
		return 0;
	}
	
	@Override
	public String me() {
		return "틀래스에서 오버라이딩";
	}
	
	@Override
	public String me2() {
		return "me2() : 틀래스에서 오버라이딩";
	}
	
	// static method()는 오버라이딩 안됨
//	@Override
//	public String stMe() {
//		return "오버라이딩";
//	}

}
