import java.util.Scanner;

public class Bnmana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
				
		while (num !=6) { // num이 6이 아닌 동안 반복되도록 while문 선언
			System.out.println("1. Add Book Number ");
			System.out.println("2. Delete Book Number ");
			System.out.println("3. Edit Book Number ");
			System.out.println("4. View Book Number ");
			System.out.println("5. Show a Menu ");
			System.out.println("6. Exit ");
			System.out.println("Select one number between 1 ~ 5:");
			num = input.nextInt();
			if(num == 1) {//입력한 숫자가 1일 때
				addBook();
			}
			else if (num == 2) {//입력한 숫자가 2일 때
				deleteBook();
			}
			else if ( num == 3) {//입력한 숫자가 3일 때
				editBook();
			}
			else if (num == 4) {//입력한 숫자가 4일 때
				viewBook();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addBook() {//1을 입력하면 나오는 값
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
		System.out.print("Book Name: ");
		String bookNa = input.next();
		System.out.print("Book Author: ");
		String bookau = input.next();
		System.out.println(bookau);
		System.out.print("Book Publisher: ");
		String bookpu = input.next();
	}
	public static void deleteBook() {//2을 입력하면 나오는 값
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
	}
	public static void editBook() {//3을 입력하면 나오는 값
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
	}
	public static void viewBook() {//4을 입력하면 나오는 값
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
	}
}