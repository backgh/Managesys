import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	ArrayList<Book> books = new ArrayList<Book>();
	Scanner input;
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {//1을 입력하면 나오는 값
		Book book = new Book();
		System.out.print("Book Number: ");
		book.number = input.nextInt();
		System.out.print("Book Name: ");
		book.name = input.next();
		System.out.print("Book Author: ");
		book.author = input.next();
		System.out.print("Book Publisher: ");
		book.publish = input.next();
		books.add(book);
	}
	public void deleteBook() {//2을 입력하면 나오는 값
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
		int index = -1;
		for(int i =0; i<books.size();i++) {
			if(books.get(i).number == bookNu) {
			index = i;
			break;
		}
		if(index >= 0) {
			books.remove(index);
			System.out.println("the book:" + bookNu + "is deleted");
		}
		else {
			System.out.println("the student has not been registered");
			return;
		}
		}
	}
	public void editBook() {//3을 입력하면 나오는 값
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
		for(int i =0; i<books.size();i++) {
			Book book = books.get(i);
			if(book.number == bookNu) {
				int num = -1;
				while (num != 5) {
					System.out.println("**Student Info Edit Menu");
					System.out.println("1: Edit Number");
					System.out.println("2: Edit Name");
					System.out.println("3: Edit Author");
					System.out.println("4: Edit Publisher");
					System.out.println("5: Exit");
					System.out.println("Select one number between 1 ~ 6");
					num = input.nextInt();
					if(num == 1) {
						System.out.print("Book Number: ");
						book.number = input.nextInt();
					}
					else if(num == 2) {
						System.out.print("Book Name: ");
						book.name = input.next();
					}
					else if(num == 3) {
						System.out.print("Book Author: ");
						book.author = input.next();
					}
					else if(num == 4) {
						System.out.print("Book Pubhliser: ");
						book.name = input.next();
					}
					else {
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}
	public void viewBooks() {//4을 입력하면 나오는 값
//		System.out.print("Book Number: ");
//		int bookNu = input.nextInt();
		for(int i =0; i<books.size();i++) {
			books.get(i).printInfo();
		}
	}
}
