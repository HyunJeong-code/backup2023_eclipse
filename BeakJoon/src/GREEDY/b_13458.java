package GREEDY;

import java.util.Scanner;

public class b_13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int stu[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			stu[i] = sc.nextInt();
		}	
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		long cnt = 0;
		
		for(int i = 0; i < N; i++) {
			int tmp = stu[i] - first;
			cnt++;
			
			if(tmp > 0 ) {
				if(tmp % second == 0) {
					cnt += (tmp / second);
				} else {
					cnt += (tmp / second) + 1;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
