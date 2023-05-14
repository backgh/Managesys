package Book;
import java.util.ArrayList;
import java.util.Scanner;

import Book.Book;
import Book.BookKind;
import Book.ExBook;
import Book.Newspaper;

public class BookManager {
	ArrayList<Bookinput> books = new ArrayList<Bookinput>();
	Scanner input;
	private Book bookprint;
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {//1을 입력하면 나오는 값
		int kind = 0;
		Bookinput bookinput;
		while(kind != 1 && kind !=2) {
			System.out.println("1 for Extra");
			System.out.println("2 for Novel");
			System.out.println("3 for Newspaper");
			System.out.print("Select num 1, 2, or 3 for Book Kind:");
			kind = input.nextInt();
			if(kind == 1) {
				bookinput = new ExBook(BookKind.Extra);
				bookinput.getUserInput(input);
				books.add(bookinput);
				break;
			}
			else if(kind == 2) {
				bookinput = new Novel(BookKind.Novel);
				bookinput.getUserInput(input);
				books.add(bookinput);
				break;
			}
			else if(kind == 3) {
				bookinput = new Newspaper(BookKind.Newspaper);
				bookinput.getUserInput(input);
				books.add(bookinput);
				break;
			}
			else {
				System.out.print("Select num for Book Kind between 1 & 2:");
			}
		}
	}
	public void deleteBook() {//2을 입력하면 나오는 값
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
		int index = -1;
		for(int i =0; i<books.size();i++) {
			if(books.get(i).getNumber() == bookNu) {
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
			Bookinput bookipnut = books.get(i);
			if(bookprint.getNumber() == bookNu) {
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
						int number = input.nextInt();
						bookipnut.setNumber(number);
					}
					else if(num == 2) {
						System.out.print("Book Name: ");
						String name = input.next();
						bookipnut.setName(name);
					}
					else if(num == 3) {
						System.out.print("Book Author: ");
						String author = input.next();
						bookipnut.setAuthor(author);
					}
					else if(num == 4) {
						System.out.print("Book Publisher: ");
						String publish = input.next();
						bookipnut.setPublish(publish);
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
