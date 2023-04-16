package refe;

public class refe {
	public static void doSomething(int x, int[] ys, Student b) {
		x = 99;
		ys[0]=99;
		b.name = "99";
	}
	public static void main(String[] args) {
		int i = 0;
		int[] j = {0};
		Student k = new Student("50", true);
		doSomething(i, j, k);
		 System.out.println("i = " + i); // i = 0
		 System.out.println("j[0] = " + j[0]); // j[0] = 99
		 System.out.println("k.name = " + k.name); // k.name = 99
	}
}