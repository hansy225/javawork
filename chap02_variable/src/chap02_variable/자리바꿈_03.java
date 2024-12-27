package chap02_variable;

public class 자리바꿈_03 {  // 한글로 작성해도 되지만 웬만하면 영어로 작성할 것

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println("x = " + x);  // + : 문자열 연결
		System.out.println("y = " + y);
		
		// x에 있는 값을 y에 넣고, y에 있는 값을 x에 넣으시오. --> 임시 저장공간을 하나 만들어서 옮긴다
		System.out.println("\nx와 y를 자리바꿈");
		int tmp = x;
		x = y;
		y = tmp;
		
		/* int tmp;
		   tmp = y;
		   y = x;  // x에 있는 값을 y에 넣기
		   x = tmp;
		   주석처럼 해도 자리바꿈은 됨
		*/
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
