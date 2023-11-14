package D3;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			
			for(int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();
			}
			
			int cnt = 0;
			for(int j = 2; j < N-2; j++) {
				int max = Math.max(arr[j-1], Math.max(arr[j-2], Math.max(arr[j+1], arr[j+2])));
				if(arr[j] > max) {
					cnt += (arr[j] - max);
				}
			}
			System.out.println("#" + i+1 + " " + cnt);
		}
	}
}
