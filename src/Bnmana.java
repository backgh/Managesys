import java.util.Scanner;

public class Bnmana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
				
		while (num !=6) { // num�� 6�� �ƴ� ���� �ݺ��ǵ��� while�� ����
			System.out.println("1. Add Book Number ");
			System.out.println("2. Delete Book Number ");
			System.out.println("3. Edit Book Number ");
			System.out.println("4. View Book Number ");
			System.out.println("5. Show a Menu ");
			System.out.println("6. Exit ");
			System.out.println("Select one number between 1 ~ 5:");
			num = input.nextInt();
			if(num == 1) {//�Է��� ���ڰ� 1�� ��
				addBook();
			}
			else if (num == 2) {//�Է��� ���ڰ� 2�� ��
				deleteBook();
			}
			else if ( num == 3) {//�Է��� ���ڰ� 3�� ��
				editBook();
			}
			else if (num == 4) {//�Է��� ���ڰ� 4�� ��
				viewBook();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addBook() {//1�� �Է��ϸ� ������ ��
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
	public static void deleteBook() {//2�� �Է��ϸ� ������ ��
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
	}
	public static void editBook() {//3�� �Է��ϸ� ������ ��
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
	}
	public static void viewBook() {//4�� �Է��ϸ� ������ ��
		Scanner input = new Scanner(System.in);
		System.out.print("Book Number: ");
		int bookNu = input.nextInt();
	}
}