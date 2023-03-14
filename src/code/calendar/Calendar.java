package code.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println(" 일 월 화 수 목 금 토 일");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
		System.out.println("원하는 달을 입력하세요.");

		int[] maxdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner scn = new Scanner(System.in);
		
		int month = scn.nextInt();
		
		int mon2 = maxdays[month-1];
		
		System.out.printf("%d월의 마지막 일수는 %d일 입니다.\n", month, maxdays[month-1]);
		
		scn.close();
	}
		
}
