package _03_ex;

public class Member {
	private String name;
	private int age;
	private String gender;
	
	public Member () { }
	
	public Member (String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String setName () {
		return name;
	}
	public int setAge () {
		return age;
	}
	public String setGender () {
		return gender;
	}
	
	public void getName (String name) {
		this.name = name;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public void setGender (String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "이름 : " +name +"나이 : " +age +"성별 : " +gender;
	}


}
