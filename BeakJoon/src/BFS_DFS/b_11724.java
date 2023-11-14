package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_11724 {
	public static int node;
	public static int edge;
	public static ArrayList<Integer> list[];
	public static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		node = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[node+1];
		
		for(int i = 0; i <= node; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < edge; i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			list[s].add(e);
			list[e].add(s);
		}
		
		int count = 0;
		visited = new boolean[node+1];
		
		for(int i = 1; i <= node; i++) {
			if(!visited[i]) {
				DFS(i);
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static void DFS(int a) {
		if(visited[a]) return;
		
		visited[a] = true;
		
		for(int i : list[a]) {
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}
}
