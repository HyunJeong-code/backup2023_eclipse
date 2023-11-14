package GREEDY;

import java.util.Scanner;

public class b_4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = 1, P = 1, V = 1;
		int index = 1;
		
		while(true) {
			L = sc.nextInt();
			P = sc.nextInt();
			V = sc.nextInt();
			
			if(L != 0 && P != 0 && V != 0) {
				int tmp = V / P;
				int result = L * tmp;
				if((V - P * tmp) > 0) {
					result += Math.min((V - P * tmp), L);
				}
				System.out.println("Case " + index + ": " + result);
				index++;
			} else {
				break;
			}
		}
	}
}
