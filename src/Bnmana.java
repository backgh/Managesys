import java.util.Scanner;

public class Bnmana {
	public static void main(String[] args) {
		
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num !=6) {
			System.out.println("1. Add Book Number ");
			System.out.println("2. Delete Book Number ");
			System.out.println("3. Exit Book Number ");
			System.out.println("4. View Book Number ");
			System.out.println("5. Show a Menu ");
			System.out.println("6. Exit ");
			System.out.println("Select one number between 1 ~ 5:");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.println("Book Number: ");
				int BNu = input.nextInt();
				System.out.println("Book Name: ");
				String BNa = input.next();
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("Book Number: ");
				int Bnu2 = input.nextInt();
			case 5:
			case 6:
			}
			
			
		}

}

}
