package GREEDY;

import java.util.Arrays;
import java.util.Scanner;

public class b_2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int tmp = N;
		
		for(int i = 0; i < N; i++) {
			if((arr[i] * tmp) > max ) max = arr[i] * tmp;
			System.out.println( i + " : " + max);
			tmp--;
		}
		
		System.out.println(max);
	}
}
