package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {
		// % : 나머지
		int result = 10%3;
		System.out.println("10을 3으로 나눈 나머지 : "+ result);  // 1
		System.out.println("-------------------------------------------");
		
		// result = result+1;  2 --> 밑의 코드와 같은 의미임
		result += 1;
		System.out.println("result+1= " + result);  // 2
		
		result *= 3;  // result = result*3;  2*3 --> 기존에 있던 result2에 3을 곱함
		System.out.println("result*3=" + result);  // 6
		
		result -= 3;  // result = result-3;  6-3
		System.out.println("result-3= " + result);  // 3
		
		result /= 2;  // result = result/2;  3/2
		System.out.println("result/2= " + result);  // 1 몫만 나옴
		
		result = 7;  // 덮어쓰기
		System.out.println("result에 7넣기 : " + result);
		result %= 5;  // result = result%5;  7%5
		System.out.println("result%5= " + result);  // 2
		
		int num2 = 300_300_300;  // 사람이 보기 편하게
		System.out.println(num2);
	}

}
