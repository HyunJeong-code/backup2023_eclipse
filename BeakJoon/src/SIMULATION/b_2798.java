package SIMULATION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int card[] = new int[N];
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = 0;
		
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					int tmp = card[i] + card[j] + card[k];
					if(tmp == M) {
						result = tmp;
						break;
					}
					if(tmp < M && result < tmp)
						result = tmp;
				}
			}
		}
		
		System.out.println(result);
	}
}
