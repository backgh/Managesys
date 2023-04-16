package Sec;

import java.util.Scanner;

public class Sec {
	public static void main(String[]args) {
		int day, hour, min, sec;
		// 일, 시, 분, 초에 값을 담을 변수 선언
		Scanner s = new Scanner(System.in); //입력을 받기 위한 scanner 객체 선언
		System.out.println("초를 입력하시오: ");
		//전체 시간을 초 단위로 입력
		sec = s.nextInt();
		
		if (sec == 31536000){
		System.out.println("는 1년이다.");
		} //1년 값을 if 문으로 구분
		else {
			min = sec / 60;
			hour = min / 60;
			day = hour / 24;
			sec = sec %60;
			min = min %60;
			hour = hour %24;
			day = day %60;
			System.out.printf("%d일 %d시 %d분 %d초", day, hour, min, sec);
			//시간 단위에 맞는 값을 입력
			if (day > 365) {
				System.out.println("는 1년보다 크다");
			}
			else {
				System.out.println("는 1년보다 작다");
			}
		}
	}
}
