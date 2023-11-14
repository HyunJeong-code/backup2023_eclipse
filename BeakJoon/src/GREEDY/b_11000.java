package GREEDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b_11000 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		
		int time[][] = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] S, int[] E) {
				if(S[0] == E[0]) {
					return S[1] - E[1];
				}
				return S[0] - S[0];
			}
		});
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(time[0][1]); //첫번째 종료시간 넣어주기
		
		for(int i = 1; i < N; i++) {
			if(pq.peek() <= time[i][0]) {
				pq.poll();
			}
			pq.add(time[i][1]);
		}
		
		System.out.println(pq.size());
	}
}
