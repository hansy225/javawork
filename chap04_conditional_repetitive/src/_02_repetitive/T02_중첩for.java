package _02_repetitive;

public class T02_중첩for {

	public static void main(String[] args) {
		/*
		중첩 for문
		for (초기식; 조건식; 증감식) {
			for (초기식; 조건식; 증감식) {
			실행 구문;
			}
		}
		 */
		for (int i=1; i<=3; i++) {
			for (int j=5; j<=7; j++) {
				System.out.println("i = "+i+", j = "+j);
			}
			System.out.println();
		}
		
		// 구구단
		
		System.out.println("구구단 출력");
		for (int dan=2; dan<=9; dan++) {
			System.out.println(" "+dan+"단");
			for (int i=1; i<=9; i++) {
				// System.out.println(dan+"*"+i+"="+ dan*i);
				System.out.printf("%d*%d=%2d\n", dan,i,dan*i);  // 일의 자리 숫자에 위치 맞추기
			}
			System.out.println();
		}
	}

}
