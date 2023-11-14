package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2501 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int index = 0;
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				index++;
			}
			if(index == K) {
				System.out.println(i);
				break;
			}
		}
		if(index < K) System.out.println(0);
	}
}
