package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2563 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		
		int dp[][] = new int[101][101];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			for(int j = A; j < A+10; j++) {
				for(int k = B; k < B+10; k++) {
					dp[j][k] = 1;
				}
			}
		}
		
		int result = 0;
		for(int i = 0; i < dp.length; i++) {
			for(int j = 0; j < dp.length; j++) {
				result += dp[i][j];
			}
		}
		
		System.out.println(result);
	}
}
