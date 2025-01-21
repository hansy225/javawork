package _10_ex;
import java.util.Scanner;

public class BookMenu {
	private LibraryController LibraryController;
	private Scanner sc;
	
	public BookMenu () {
		LibraryController = new LibraryController();
		sc = new Scanner(System.in);
	}
	
	public void showMenu () {
		while (true) {
			System.out.println("********* 메뉴 *********");
			System.out.println("1. 새 책 추가");
			System.out.println("2. 전체 도서 조회");
			System.out.println("3. 도서검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("0. 종료");
			System.out.print(" - 메뉴 번호 선텍 : ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				addBook();
				break;
			case 2:
				viewBook();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				sortBook();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}	
			
		}
		
	}
	
	private void addBook() {
		System.out.print("책 제목을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("저자를 입력하세요 : ");
		String author = sc.nextLine();
		System.out.print("출판사를 입력하세요 : ");
		String publisher = sc.nextLine();
		LibraryController.insertBook(new Book(title, author, publisher));
		System.out.println("책이 추가되었습니다.");
	}
	
	private String viewBook() {
		System.out.println("전체 도서 조회");
		for (Book book : LibraryController.selectAll()) {
			System.out.println(book);
		}
		return null;
	}
	
	void searchBook() {
		System.out.print("검색할 책의 제목을 입력하세요 : ");
		String keyword = sc.nextLine();
		Book book = LibraryController.searchBook(keyword);
		if (book == null) 
			System.out.println("찾는 책이 없습니다.");
		else
			System.out.println("찾는 책 - " +book);
	}

	void deleteBook() {
		System.out.print("삭제할 책의 제목을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 책의 저자를 입력하세요 : ");
		String author = sc.nextLine();
		Book book = LibraryController.deleteBook(title, author);
		if (book != null) {
			LibraryController.aList.remove(book);
			System.out.println(book +"도서가 삭제 되었습니다");
		} else {
			System.out.println("찾는 도서가 없습니다.");
		}
	}
	
	void sortBook() {
		LibraryController.aList.sort(null);
		/* sort(null) : null은 리스트 요소들이 Comparable 인터페이스를 구현하는 경우,
		 				compareTo 메소드에 기반하여 정렬을 함
		 				 - 현재 Book 객체의 title을 기반으로 오름차순 정렬해줌 */
	    System.out.println("도서명이 오름차순으로 정렬되었습니다.");
	}

}
