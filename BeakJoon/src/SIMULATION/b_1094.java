package SIMULATION;

import java.util.Scanner;

public class b_1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int cnt = 0;
		int stick = 64;
		
		while(X > 0) {
			if(stick > X) {
				stick /= 2;
			} else {
				X -= stick;
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
