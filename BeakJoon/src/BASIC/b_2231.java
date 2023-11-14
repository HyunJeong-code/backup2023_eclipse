package BASIC;

import java.util.Scanner;

public class b_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i < N; i++) {
			int sum = 0;
			int index = i;
			while(index != 0) {
				sum += (index % 10);
				index /= 10;
			}
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
