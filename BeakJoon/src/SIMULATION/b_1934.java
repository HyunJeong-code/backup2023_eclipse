package SIMULATION;

import java.util.Scanner;

public class b_1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int A, B;
		int max = 0;
		int result;
		
		for(int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			max = gcd(A, B);
			result = (A * B) / max;
			
			System.out.println(result);
		}
	}

	private static int gcd(int x, int y) {
		if(y == 0) return x;
		else return gcd(y, x%y);
		
	}
}
