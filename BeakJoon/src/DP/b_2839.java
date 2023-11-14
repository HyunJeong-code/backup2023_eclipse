package DP;
import java.util.Scanner;

public class b_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[][] = new int[5001][5001];
		
		for(int i = 0; i <= 5000; i++) {
			for(int j = 0; j <= 5000; j++) {
				arr[i][j] = (i * 3) + (j * 5);
			}
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i <= 5000; i++) {
			for(int j = 0; j <= 5000; j++) {
				if(N == arr[i][j] && min > (i + j)) {
					min = i + j;
					//System.out.println("loop : " + min);
				} 
			}
		}
		
		if(min == Integer.MAX_VALUE) {
			System.out.println("-1");
		} else {
			System.out.println(min);
		}
	}
}
