package SIMULATION;

import java.util.Scanner;

public class b_20053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int max = -1000001;
			int min = 1000001;
			int N = sc.nextInt();
			for(int j = 0; j < N; j++) {
				int x = sc.nextInt();
				max = Math.max(max, x);
				min = Math.min(min, x);
			}
			
			System.out.println(min + " " + max);
			
		}
	}
}
