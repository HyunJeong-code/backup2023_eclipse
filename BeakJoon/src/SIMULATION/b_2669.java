package SIMULATION;

import java.util.Scanner;

public class b_2669 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check[][] = new boolean[101][101];
		int x1, x2, y1, y2;
		
		for(int i = 0; i < 4; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			
			for(int j = x1; j < x2; j++) {
				for(int k = y1; k < y2; k++) {
					check[j][k] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 1; i < check.length; i++) {
			for(int j = 1; j < check.length; j++) {
				if(check[i][j] == true) cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
