package _10_ex;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book() {
	}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "제목 : " + title + " / 저자 : " + author + " / 출판사 : " + publisher;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (this == null || getClass()!=obj.getClass())
		return false;
		Book book = (Book) obj;
		return title.equals(book.title);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}
	
	
	
}