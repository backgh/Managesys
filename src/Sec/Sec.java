package Sec;

import java.util.Scanner;

public class Sec {
	public static void main(String[]args) {
		int day, hour, min, sec;
		// ��, ��, ��, �ʿ� ���� ���� ���� ����
		Scanner s = new Scanner(System.in); //�Է��� �ޱ� ���� scanner ��ü ����
		System.out.println("�ʸ� �Է��Ͻÿ�: ");
		//��ü �ð��� �� ������ �Է�
		sec = s.nextInt();
		
		if (sec == 31536000){
		System.out.println("�� 1���̴�.");
		} //1�� ���� if ������ ����
		else {
			min = sec / 60;
			hour = min / 60;
			day = hour / 24;
			sec = sec %60;
			min = min %60;
			hour = hour %24;
			day = day %60;
			System.out.printf("%d�� %d�� %d�� %d��", day, hour, min, sec);
			//�ð� ������ �´� ���� �Է�
			if (day > 365) {
				System.out.println("�� 1�⺸�� ũ��");
			}
			else {
				System.out.println("�� 1�⺸�� �۴�");
			}
		}
	}
}
