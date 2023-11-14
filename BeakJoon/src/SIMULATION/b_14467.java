package SIMULATION;

import java.util.Scanner;

public class b_14467 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int cow[] = new int[11];
		
		for(int i = 1; i < cow.length; i++) {
			cow[i] = 3;
		}
		
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			int move = sc.nextInt();
			
			if(cow[num] == 3) {
				cow[num] = move;
			} else {
				if(cow[num] == move) {
					continue;
				} else {
					cow[num] = move;
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		
	}
}
