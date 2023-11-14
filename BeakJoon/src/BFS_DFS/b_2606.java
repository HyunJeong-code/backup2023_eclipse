package BFS_DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class b_2606 {
	public static boolean visited[];
	public static ArrayList<Integer> list[];
	public static int N;
	public static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		int M = sc.nextInt();
		visited = new boolean[N+1];
		
		list = new ArrayList[N+1];
		
		for(int i = 0; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			list[s].add(e);
			list[e].add(s);
		}
		
		cnt = 0;
		
		dfs(1);
		
		System.out.println(cnt);
	}

	private static void dfs(int i) {
		if(visited[i]) return;
		visited[i] = true;
		
		for(int j : list[i]) {
			if(!visited[j])
				cnt++;
				dfs(j);
		}	
	}

}
