package D3;

import java.util.Arrays;
import java.util.Scanner;

public class D_1208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test = 1; test <= 10; test++) {
			int dump = sc.nextInt();
			
			int arr[] = new int[100];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < dump; i++) {
				Arrays.sort(arr);
				arr[0]++;
				arr[99]--;
			}
			
			Arrays.sort(arr);
			
			int result = arr[99] - arr[0];
			System.out.println("#" + test + " " + result);
		}
	}
}
