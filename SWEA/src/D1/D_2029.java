package D1;

import java.util.Scanner;

public class D_2029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test = 1; test <= T; test++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("#" + test + " " + A/B + " " + A%B);
			
		}
	}
}
