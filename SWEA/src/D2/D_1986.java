package D2;

import java.util.Scanner;

public class D_1986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int result = 0;
			for(int j = 1; j <= N; j++) {
				if(j % 2 == 0) {
					result -= j;
					//System.out.println(j + " " + result);
				} else {
					result += j;
					//System.out.println(j + " " + result);
				}
			}
			System.out.println("#" + i + " " + result);
		}
	}
}
