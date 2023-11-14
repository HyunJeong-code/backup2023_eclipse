package BFS_DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_11724_BFS {
	
	public static boolean visited[];
	public static ArrayList<Integer>[] conList;
	public static int node;
	public static int edge;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		node = sc.nextInt();
		edge = sc.nextInt();
		
		conList = new ArrayList[node+1];
		
		for(int i = 0; i <= node; i++) {
			conList[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < edge; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			conList[s].add(e);
			conList[e].add(s);
		}
		
		visited = new boolean[node+1];
		int cnt = 0;
		
		for(int i = 1; i <= node; i++) {
			if(!visited[i]) {
				BFS(i);
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

	private static void BFS(int n) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(n);
		visited[n] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(int i : conList[now]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
		
	}
}
