package DP;

import java.util.Scanner;

public class b_14501_WHY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int dp[] = new int[16];
		int T[] = new int[N+1];
		int P[] = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		
		dp[1] = P[1];
		
		int i = 1;
		int result = 0;
		int nDay = T[i] + i;
		
		while(nDay <= N) {
			nDay = T[i] + i;
			
			if(nDay < N) {
				dp[nDay] = dp[i] + P[nDay];
				System.out.println("nDay  = " + nDay + " , " + "dp = " + dp[nDay]);
				i += T[i];
			} else if (nDay > N) {
				result = dp[i];
				break;
			} else {
				if(T[nDay] == 1) {
					dp[nDay] = dp[i] + P[nDay];
					result = dp[nDay];
					break;
				}
			}
			
//			dp[nDay] = dp[i] + P[nDay];
//			System.out.println("nDay  = " + nDay + " , " + "dp = " + dp[nDay]);
			
			
			
//			if(nDay == N) {
//				if(T[nDay] == 1) {
//					dp[nDay] = dp[i] + P[nDay];
//					result = dp[nDay];
//					break;
//				} else {
//					result = dp[i];
//					continue;
//				}
//			} 
		}
		
		System.out.println(result);
	}

}
