package chap02_variable;

public class Etc_02 {

	public static void main(String[] args) {
		double pi = 3.14;  // 정수를 작성하면 error --> 더블은 무조건 실수만 가능
		char ch = 'A';  // char은 한 글자만 넣을 수 있음. 반드시 외따옴표 사용
		String str = "abcdf";
		boolean bool = false;
		String str2 = "a";  //String은 한글자만 넣어도 되고 안넣어도 됨. 쌍따옴표 사용
		char ch2 = ' ';   // spacebar의 유니코드가 들어감. '' --> 아무것도 안넣으면 error
		
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(bool);
		System.out.println(str2);
		System.out.println(ch2);

	}

}
