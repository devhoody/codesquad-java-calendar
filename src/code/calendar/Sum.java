package code.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		
		int a, b;
		// 입력 : 키보드로 두 수를 입력받는다.
		Scanner scn = new Scanner(System.in);
		String s1, s2;
		
		s1 = scn.next();
		s2 = scn.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);

		int c = a + b;
		
		// 출력 : 화면에 두 수의 합을 출력한다.
//		System.out.println("두 수의 합은 " + c + " 입니다.");
		System.out.printf("%d와 %d의 합은 %d 입니다." , a, b, a+b); // %d => 정수입력
		scn.close();
			}

}
