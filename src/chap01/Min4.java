package chap01;

import java.util.Scanner;

public class Min4 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("네 정수의 최솟값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
		System.out.print("d의 값 : ");
		int d = stdIn.nextInt();

		System.out.println("최솟값은 " + min4(a, b, c, d) + "입니다.");
	}

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;

		return min;
	}
}
