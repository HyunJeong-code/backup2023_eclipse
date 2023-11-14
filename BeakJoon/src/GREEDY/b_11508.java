package GREEDY;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b_11508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Integer arr[] = new Integer[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			if((i+1) % 3 == 0) continue;
			sum += arr[i];
		}
		
		System.out.println(sum);
	}
}
