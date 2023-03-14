package code.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysofMonth(int month) {
		return MAX_DAYS[month - 1];
	}

//	public void printSampleCalendar() {
//		System.out.println(" 일 월 화 수 목 금 토 일");
//		System.out.println("--------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
//	}

	public static void main(String[] args) {
		//원하는 반복 횟수를 입력하고, 원하는 월수를 입력하여 해당 월의 마지막 일수 출력하기.
		Scanner scn = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		System.out.println("반복횟수를 입력하세요.");
		int loopnum = scn.nextInt();
		for (int i=0; i<loopnum; i++) {
			System.out.println("원하는 달을 입력하세요.");
			int month = scn.nextInt();
			System.out.printf("%d월의 마지막 일수는 %d일 입니다.\n", month, cal.getMaxDaysofMonth(month));
		}

		scn.close();
	}

}
