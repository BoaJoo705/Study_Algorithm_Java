package chap01;

import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		do {
			System.out.println("몇 단 삼각형입니까?:");
			n = stdIn.nextInt();
		} while (n <= 0);


		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (j + i <= n) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = n; j <= 1; j--) {
//				if (j + i <= n) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//
//			System.out.println();
//		}

//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j > i; j++) {
//				System.out.print("");
//			}
//			System.out.println("*");
//		}
	}
}
