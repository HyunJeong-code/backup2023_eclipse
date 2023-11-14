package SIMULATION;

import java.util.Arrays;
import java.util.Scanner;

public class b_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tall[] = new int[9];
		int sum = 0;
		int not1 = 0, not2 = 0;
		
		for(int i = 0; i < tall.length; i++) {
			tall[i] = sc.nextInt();
			sum += tall[i];
		}
		
		Arrays.sort(tall);
		
		for(int i = 0; i < tall.length; i++) {
			for (int j = i+1; j < tall.length ; j++) {
				if(sum - tall[i] - tall[j] == 100) {
					not1 = tall[i];
					not2 = tall[j];
				}
			}
		}
		
		for(int i = 0; i < tall.length; i++) {
			if(tall[i] == not1 || tall[i] == not2) continue;
			System.out.println(tall[i]);
		}
	}
}
