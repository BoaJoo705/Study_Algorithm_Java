package chap01;

import java.util.Scanner;

public class Min3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최솟값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.print("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("최솟값은 " + min3(a, b, c) + "입니다.");
	}
	
	static int min3(int a, int b, int c) {
		int min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		
		return min;
	}
}

