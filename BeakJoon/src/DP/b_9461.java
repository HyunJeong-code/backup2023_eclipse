package DP;

import java.util.Scanner;

public class b_9461 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		long arr[] = new long[101];
		
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		
		for(int i = 4; i < 101; i++) {
			arr[i] = arr[i-3] + arr[i-2];
		}
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			System.out.println(arr[N]);
		}
	}
}
