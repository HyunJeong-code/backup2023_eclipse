package GREEDY;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b_20115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Integer arr[] = new Integer[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		double result = 0.0;
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		result = (double) arr[0];
		
		for(int i = 1; i < N; i++) {
			result += (double) arr[i] / 2; //형변환이 어디에 붙느냐에 따라 결과값이 달라짐
		} 
		
		// (double) (arr[i] / 2);
		
		System.out.println(result);
	}
}
