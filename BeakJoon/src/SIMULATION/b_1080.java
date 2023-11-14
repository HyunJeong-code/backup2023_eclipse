package SIMULATION;

import java.util.Scanner;

public class b_1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int A[][] = new int[N][M];
		int B[][] = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < M; j++) {
				A[i][j] = (int)str.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < M; j++) {
				B[i][j] = (int)str.charAt(j);
			}
		}
		
		int cnt = 0;
		
	}
}
