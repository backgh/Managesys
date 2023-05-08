package Book;
import java.util.Scanner;
public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookManager = new BookManager(input);

		int num = -1;
		while (num !=5) { // num�� 6�� �ƴ� ���� �ݺ��ǵ��� while�� ����
			System.out.println("***Book Management System Menu ***");
			System.out.println("1. Add Book");
			System.out.println("2. Delete Book");
			System.out.println("3. Edit Book");
			System.out.println("4. View Book");
			System.out.println("5. Exit ");
			System.out.println("Select one number between 1 ~ 6:");
			num = input.nextInt();
			if(num == 1) {//�Է��� ���ڰ� 1�� ��
				bookManager.addBook();
			}
			else if (num == 2) {//�Է��� ���ڰ� 2�� ��
				bookManager.deleteBook();
			}
			else if (num == 3) {//�Է��� ���ڰ� 3�� ��
				bookManager.editBook();
			}
			else if (num == 4) {//�Է��� ���ڰ� 4�� ��
				bookManager.viewBooks();
			}
			else {
				continue;
			}
		}
	}
}