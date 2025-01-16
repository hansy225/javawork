package _03_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookRun {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController(new Member("홍길동", 25, "남성"));
		
		List<Book> aList = new ArrayList<>();
		aList.add(new Book("java", "이문열","대한"));
		
		System.out.println("책 목록 : " +lc.selectAll());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목 입력 : ");
		String title = sc.nextLine();
		
		
		
		
		
	}

}
