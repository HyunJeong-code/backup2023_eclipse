package DP;

import java.util.Scanner;

public class b_14501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T[] = new int[N+1];
		int P[] = new int[N+1];
		int dp[] = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		
		int day = 0;
		dp[1] = P[1];
		
		for(int i = 1; i <= N; i++) {
			day = T[i] + day;
			
			dp[day] = dp[i] + P[day];
		}
	}
}
