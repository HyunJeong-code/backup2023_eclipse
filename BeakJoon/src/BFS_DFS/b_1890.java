package BFS_DFS;

import java.util.Scanner;

public class b_1890 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int dp[][] = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int next = 0;
		dp[0][0] = 1;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				next = arr[i][j];
				if(i == N-1 && j == N-1) continue;
				if(i + next < N) dp[i+next][j] += dp[i][j];
				if(j + next < N) dp[i][j+next] += dp[i][j];
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(dp[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(dp[3][3]);
		
	}
}
