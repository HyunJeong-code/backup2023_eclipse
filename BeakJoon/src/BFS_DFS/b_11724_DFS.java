package BFS_DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class b_11724_DFS {

	public static ArrayList<Integer> conList[];
	public static int node;
	public static int edge;
	public static boolean visited[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		node = sc.nextInt();
		edge = sc.nextInt();
		
		conList = new ArrayList[node+1];
		visited = new boolean[node+1];
		
		for(int i = 0; i <= node; i++) {
			conList[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < edge; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			conList[s].add(e);
			conList[e].add(s);
		}
		
		int cnt = 0;
		
		for(int i = 1; i < node + 1; i++) {
			if(!visited[i]) {
				DFS(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

	private static void DFS(int n) {
		if(visited[n]) return;
		
		visited[n] = true;
		
		for(int i : conList[n]) {
			if(visited[i] == false) {
				DFS(i);
			}
		}	
	}
	
}
