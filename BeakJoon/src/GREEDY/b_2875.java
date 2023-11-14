package GREEDY;

import java.util.Scanner;

public class b_2875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int W = sc.nextInt();
		int M = sc.nextInt();
		int intern = sc.nextInt();
		int result = 0;
		
		while(W >= 2 && M >= 1 && (W + M - 3) >= intern) {
			W -= 2;
			M--;
			result++;
		}
		
		System.out.println(result);
	}
}
