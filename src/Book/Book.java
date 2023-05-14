package Book;

import java.util.Scanner;

public abstract class Book {
	protected BookKind kind = BookKind.Extra;
	protected String name;
	protected int number;
	protected String author;
	protected String publish;
	
	public Book() {	
	}
	
	public Book(BookKind kind) {
		this.kind = kind;
	}
	
	public Book(String name, int number) {
		this.name = name;
		this.number = number;
		
	}
	public Book(String name, int number, String author, String publish) {
		this.name = name;
		this.number = number;
		this.author = author;
		this.publish = publish;
	}
	
	public Book(BookKind kind, String name, int number, String author, String publish) {
		this.kind = kind;
		this.name = name;
		this.number = number;
		this.author = author;
		this.publish = publish;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}
	public BookKind getKind() {
		return kind;
	}
	public void setKind(BookKind kind) {
		this.kind = kind;
	}
	
	public abstract void printInfo();
	
}
