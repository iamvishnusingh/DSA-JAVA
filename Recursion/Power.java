package Recursion;

import java.util.Scanner;

public class Power {
	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int xb = power(x, n / 2);
		int xn = xb * xb;
		if (n % 2 == 1) {
			xn = xn * x;
		}
		return xn;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(x, n));

	}
}
