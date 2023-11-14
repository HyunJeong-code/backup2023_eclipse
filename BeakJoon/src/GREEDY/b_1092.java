package GREEDY;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class b_1092 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Integer cr[] = new Integer[N];
		for(int i = 0; i < N; i++) {
			cr[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		
		Integer w[] = new Integer[M];
		for(int i = 0; i < M; i++) {
			w[i] = sc.nextInt();
		}
		
		int cnt = 0;
		
		Arrays.sort(cr, Collections.reverseOrder());
		Arrays.sort(w, Collections.reverseOrder());
		
		
		
		System.out.println(cnt);
	}
}
