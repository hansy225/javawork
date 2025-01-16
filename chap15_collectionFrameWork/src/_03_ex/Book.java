package _03_ex;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book () { }
	
	public Book (String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String setTitle () {
		return title;
	}
	public String setAuthor () {
		return author;
	}
	public String setPublisher () {
		return publisher;
	}
	
	public void getTitle(String title) {
		this.title = title;
	}
	public void getAuthor(String author) {
		this.author = author;
	}
	public void getPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "제목 : " +title +"저자 : " +author +"출판사 : " +publisher;
	}
	
}
