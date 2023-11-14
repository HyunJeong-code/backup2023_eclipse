package SIMULATION;

import java.util.Scanner;

public class b_18311_timeout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int cos[] = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			cos[i] = sc.nextInt();
			sum += cos[i];
		}
		
		int move[] = new int[(sum*2)];
		int d = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < cos[i]; j++) {
				move[d] = i+1;
				//System.out.println("d = " + d + " >>" + move[d]);
				d++;
			}
		}
		d = sum;
		for(int i = N-1; i >= 0; i--) {
			for(int j = 0; j < cos[i]; j++) {
				move[d] = i+1;
				//System.out.println("d = " + d + " >>" + move[d]);
				d++;
			}
		}
		
		System.out.println(move[K]);
	}
}
