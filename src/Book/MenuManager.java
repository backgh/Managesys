package Book;
import java.util.Scanner;
public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookManager = new BookManager(input);

		int num = -1;
		while (num !=5) { // num이 6이 아닌 동안 반복되도록 while문 선언
			System.out.println("***Book Management System Menu ***");
			System.out.println("1. Add Book");
			System.out.println("2. Delete Book");
			System.out.println("3. Edit Book");
			System.out.println("4. View Book");
			System.out.println("5. Exit ");
			System.out.println("Select one number between 1 ~ 6:");
			num = input.nextInt();
			if(num == 1) {//입력한 숫자가 1일 때
				bookManager.addBook();
			}
			else if (num == 2) {//입력한 숫자가 2일 때
				bookManager.deleteBook();
			}
			else if (num == 3) {//입력한 숫자가 3일 때
				bookManager.editBook();
			}
			else if (num == 4) {//입력한 숫자가 4일 때
				bookManager.viewBooks();
			}
			else {
				continue;
			}
		}
	}
}