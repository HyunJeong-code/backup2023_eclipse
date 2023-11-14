package GREEDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		long dis[] = new long[N-1];
		long oil[] = new long[N];
		
		for(int i = 0; i < N-1; i++) {
			dis[i] = Long.parseLong(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			oil[i] = Long.parseLong(st.nextToken());
		}
		
		long oilMin = 1000000001;
		
		long sum = 0;
		
//		for(int i = 0; i < N-1; i++) {
//			System.out.println(dis[i]);
//		}
//		for(int i = 0; i < N; i++) {
//			System.out.println(oil[i]);
//		}
		
		for(int i = 0; i < N-1; i++) {
			if(oil[i] < oilMin) {
				oilMin = oil[i];
				sum += (dis[i] * oilMin);
				//System.out.println(sum);
				} else {
				sum += (dis[i] * oilMin);
				//System.out.println(sum);
			}
		}
		
		System.out.println(sum);
	}
}
