package _06_ex;

public class Book {
	// 저자(String), ISBN(int), 가격(int) --> 생성자 4개 오버로딩
	String writer;
	int isbn;
	int price;
	
	Book () {
		this("홍길동", 12345, 27000);
	}
	
	Book (String writer) {
		this.writer = writer;
		this.isbn = 0;
		this.price = 0;
	}
	
	Book (String writer, int isbn) {
		this.writer = writer;
		this.isbn = isbn;
		this.price = 0;
	}
	
	Book (String writer, int isbn, int price) {
		this.writer = writer;
		this.isbn = isbn;
		this.price = price;
	}
	
	void BookInfo() {
		System.out.println("저자 : " +writer);
		System.out.println("ISBN : " +isbn);
		System.out.println("가격 : " +price);
	}

}
