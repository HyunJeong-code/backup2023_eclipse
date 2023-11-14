package DP;

import java.util.Scanner;

public class b_1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N+1];
		int dp[] = new int[100001];
		
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
			
			dp[A[i]]++;
			if(dp[A[i]] >= 2) dp[A[i]] = 1;
		}
		
		int M = sc.nextInt();
		int tmp;
		
		for(int i = 1; i <= N; i++) {
			tmp = sc.nextInt();
			System.out.println(dp[tmp]);
		}
	}
}
