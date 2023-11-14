package BINARY_SEARCH;

import java.util.Arrays;
import java.util.Scanner;

public class b_10816 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int card = 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < M; i++) {
			card = sc.nextInt();
			int cnt = 0;
			
			for(int j = 0; j < N; j++) {
				if(arr[j] == card) cnt++;
			}
			
			System.out.print(cnt + " ");
		}
	}
}
