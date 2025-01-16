package _03_ex;

import java.util.ArrayList;

public class LibraryController {
	private Member member;
	ArrayList<Book> aList = new ArrayList<>();
	
	public LibraryController(Member member) {
		this.member = member;
		insertBook();
	}
	
	void info() {
		System.out.println(member);
	}
	
	public void insertBook() {
		aList.add(new Book("HTML","김웹앱","대한"));
		aList.add(new Book("JSP","이제이","민국"));
		aList.add(new Book("AWS","박클라","만세"));
	}
	public ArrayList<Book> selectAll() {
        return aList;
    }
	
	Book searchBook(String title) {
		Book book = null;
		for(Book b : aList) {
			if (b.setTitle().equals(title)) {
				return b;
			}
		}
		return book;
	}

	
	
}
