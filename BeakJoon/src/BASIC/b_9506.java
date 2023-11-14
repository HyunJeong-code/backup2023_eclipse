package BASIC;

import java.util.Scanner;

public class b_9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			int result  = 0;
			
			if(N == -1) break;
			
			for(int i = 1; i < N; i++) {
				if(N % i == 0) {
					result += i;
				}
			}
			
			if(result == N) {
				System.out.print(N + " = 1");
				for(int i = 2; i < N; i++) {
					if(N % i == 0) {
						System.out.print(" + " + i);
					}
				}
			} else {
				System.out.print(N + " is NOT perfect.");
			}
			System.out.println();
		}
	}
}
