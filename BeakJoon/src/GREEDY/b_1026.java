package GREEDY;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Integer arr1[] = new Integer[N];
		int arr2[] = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++ ) {
			arr1[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++ ) {
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1, Collections.reverseOrder());
		Arrays.sort(arr2);
		
		for(int i = 0; i < N; i++) {
			sum += (arr1[i] * arr2[i]);
			System.out.println(i + ": " + sum);
		}
		
		System.out.println(sum);
	}
}
