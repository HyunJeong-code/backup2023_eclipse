package DP;

import java.util.Scanner;

public class b_9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int N[] = new int[T];
		
		for(int i = 0; i < T; i++) {
			N[i] = sc.nextInt();
		}
		
		int dp[] = new int[11];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i = 4; i < 11; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		
		for(int i = 0; i < T; i++) {
			System.out.println(dp[N[i]]);
		}
	}
}
