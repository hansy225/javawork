package _03_ex;

import java.util.Scanner;

public class T01_Ex01 {

	public static void main(String[] args) {
		// 1. 길이 10인 배열을 선언하고 1~10까지 반복문을 이용하여 순서대로 넣고 출력하기
		int num1 [] = new int [10];
		
		for (int i=0; i<num1.length; i++) {
			num1[i] = i+1;
		}
		for (int i=0; i<num1.length; i++) {
			System.out.print(num1[i]+", ");
		}
		
		System.out.println();
		System.out.println("-------------------------------");

		// 2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣고 값 출력
		int num2 [] = new int [10];
		
		for (int i=0; i<num2.length; i++) {
			num2[i] = 10-i;
		}
		for (int i=0; i<num2.length; i++) {
			System.out.print(num2[i]+", ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		
		// 3. 사용자로 부터 입력받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int user1 = sc.nextInt();
		
		int ar1 [] = new int[user1];
		for (int i=0; i<ar1.length; i++) {
			ar1[i] = i+1;
		}
		for (int i=0; i<ar1.length; i++) {
			System.out.print(ar1[i]+", ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		
		// 4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후 배열 인덱스를 이용하여 귤 출력
		String ar2[] = new String [5];
		ar2[0] = "사과";
		ar2[1] = "귤";
		ar2[2] = "포도";
		ar2[3] = "복숭아";
		ar2[4] = "참외";
		
		System.out.println(ar2[1]);
		System.out.println("-------------------------------");

		/*5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
		   ex)
		   문자열 : application
		   문자 : i
		   application에 i가 존재하는 위치(인덱스) : 4 8 
		   i 개수 : 2 */
		System.out.print("문자열을 입력하세요 : ");
		String user3 = sc.next();
		
		int length = user3.length();
		String ar3[] = new String[length];
		
		System.out.print("검색할 문자 : ");
		String search = sc.next();
		
		char searchChar = search.charAt(0);
		int count = 0;
		
		for (int i=0; i<length; i++) {
			if (user3.charAt(i) == searchChar) {
                count++; 
			}
		
		}
		System.out.println(user3+"에 "+search+"가 존재하는 위치 : ");
		System.out.println(search+"의 개수 : " +count);
		
	}

}
