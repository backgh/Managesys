
public class Book {
	String name;
	int number;
	String author;
	String publish;
	
	public Book() {
		
	}
	public Book(String name1, int number) {
		this.name = name1;
		this.number = number;
		
	}
	public Book(String name, int number, String author, String publish) {
		this.name = name;
		this.number = number;
		this.author = author;
		this.publish = publish;
	}
	
	public void printInfo() {
		System.out.println("name:" + name + "number:" + number + "author: " + author + "publish: " + publish);
	}
}
