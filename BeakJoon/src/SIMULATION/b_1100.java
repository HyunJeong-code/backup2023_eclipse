package SIMULATION;

import java.util.Scanner;

public class b_1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char arr[][] = new char[8][8];
		String str;
		int cnt = 0;
		
		for(int i = 0; i < 8; i++) {
			str = sc.nextLine();
			for(int j = 0;  j < 8; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0;  j < 8; j++) {
				if(i % 2 == 0 && j % 2 == 0) {
					if(arr[i][j] == 'F') cnt++;
				}
				if(i % 2 != 0 && j % 2 != 0) {
					if(arr[i][j] == 'F') cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
