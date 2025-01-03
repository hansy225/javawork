package _02_2차원_Array;

import java.util.Scanner;

public class T03_ex01 {

	public static void main(String[] args) {
		/*// 사용자로부터 정수값 5개 입력받고 배열에 입력
		// 오름차순으로 정렬하기
		
		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		
		System.out.println("정수 5개 입력 : ");
		for (int i=0; i<5; i++) {
			num[i] = sc.nextInt();
		}
		for (int i=0; i<num.length; i++) {
			int tmp = num[i];
            num[i] = num[i + 1];
            num[i + 1] = tmp;
		}
		System.out.print("오름차순 정렬 결과: ");
        for (int i=0; i<5; i++) {
        	System.out.print(num[i] +", ");
        } */
		
		// 3. 사용자로 부터 입력받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력
		Scanner sc = new Scanner(System.in);
		
		
		
		// 4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후 배열 인덱스를 이용하여 귤 출력
		String ar2[] = new String [5];
		ar2[0] = "사과";
		ar2[1] = "귤";
		ar2[2] = "포도";
		ar2[3] = "복숭아";
		ar2[4] = "참외";
		
		System.out.println(ar2[1]);
		
		
 		
		
		
		

	}
}
