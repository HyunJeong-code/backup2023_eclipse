package SIMULATION;

import java.util.Scanner;

public class b_18311 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long K = sc.nextLong();
		
		int cos[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			cos[i] = sc.nextInt();
		}
		
		boolean reMove = false;
		for(int i = 0; i < N; i++) {
			K -= cos[i];
			if(K < 0) {
				System.out.println(i+1);
				reMove = true;
				break;
			}
		}
		
		if(reMove == false) {
			for(int i = N-1; i >= 0; i--) {
				K -= cos[i];
				if(K < 0) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}
