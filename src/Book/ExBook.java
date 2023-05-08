package Book;

import java.util.Scanner;

public class ExBook extends Book{
	
	public ExBook(BookKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Book Number: ");
		int number = input.nextInt();
		this.setNumber(number);
		
		System.out.print("Book Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer ='x';
		while(answer !='y' && answer != 'Y' && answer != 'n' && answer != 'N' ) 
		{
			System.out.print("Is there only one Author? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Book Author: ");
				String author = input.next();
				this.setAuthor(author);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setAuthor("");
				break;
			}
			else {	
			}
		}
		
		System.out.print("Book Author: ");
		String author = input.next();
		this.setAuthor(author);
		
		System.out.print("Book Publisher: ");
		String publish = input.next();
		this.setPublish(publish);
	}
}
