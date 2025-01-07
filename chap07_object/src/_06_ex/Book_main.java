package _06_ex;

public class Book_main {

	public static void main(String[] args) {
		Book book1 = new Book();
		System.out.println("[book1의 정보]");
		book1.BookInfo();
		System.out.println("--------------------");
		
		Book book2 = new Book("이순신", 56789);
		System.out.println("[book2의 정보]");
		book2.BookInfo();
	}

}
