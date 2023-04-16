package Cal;

public class Cal{
	public static void main(String []args) {
		for (int i = 0; i < 5; i ++) {
			System.out.println();
			if(i == 2) {
				continue;
			}
			for (int j = 1; j <10; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}