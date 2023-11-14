package SIMULATION;

import java.util.Arrays;
import java.util.Scanner;

public class b_1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		
		for(int i = 0; i < M; i++) {
			int result = 0;
			int s = 0;
			int e = N-1;
			int num = sc.nextInt();
			
			while(s <= e) {
				int mid = (s + e) / 2;
				if(arr[mid] == num) {
					result = 1;
					break;
				}
				if(arr[mid] > num) e = mid - 1;
				else s = mid + 1;
			}
			
			System.out.println(result);
		}
	}
}
