package BASIC;

import java.util.Scanner;

public class b_10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		char ch[][] = new char[5][15];
		//int len = 0;
		
		for(int i = 0; i < 5; i++) {
			str = sc.nextLine();
			
			for(int j = 0; j < str.length(); j++) {
				ch[i][j] = str.charAt(j);
				//System.out.print(ch[i][j]);
			}
		}
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(ch[j][i] == ' ' || ch[j][i] == '\0') {
					continue;
				} else {
					System.out.print(ch[j][i]);
				}
				
			}
		}
	}
}
