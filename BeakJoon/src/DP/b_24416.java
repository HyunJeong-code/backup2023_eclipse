package DP;

import java.util.Scanner;

public class b_24416 {
	public static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt1 = fib(n);
		fibonacci(n);
		
		System.out.println(cnt);
		System.out.println(cnt1);

		
	}

	public static int fibonacci(int n) {
		if (n == 2 || n == 1) {
			cnt++;
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static int fib(int n) {
		int c = 0;
		int f[] = new int[n+1];
		f[1] = f[2] = 1;
		for(int i = 3; i <= n; i++) {
			f[i] = f[i-1] + f[i-2];
			c++;
		}
		return c;
	}
}
