package chap02;

import java.util.Scanner;
// 두배열이 같은지를 판

public class ArrayEqual {
	// 두배열 a, b 의 모든 요소가 같은가?
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("배열 a의 요솟수: ");
		int na = stdIn.nextInt();	// 배열 a의 요솟수

		int[] a = new int[na];	// 요솟수가 na인 배열

		for (int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}

		System.out.println("배열 b의 요솟수: ");
		int nb = stdIn.nextInt();	// 배열 b의 요솟수

		int[] b = new int[nb];	// 요솟수가 nb인 배열

		for (int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "]:");
			b[i] = stdIn.nextInt();
		}

		System.out.println("배열 a와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
	}
}
