package D1;

import java.util.Scanner;

public class D_2025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = N-1; i > 0; i--) {
			N += i;
		}
		
		System.out.println(N);
	}
}
