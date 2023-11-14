package BFS_DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class b_1260_DFS {

	public static int node;
	public static int edge;
	public static ArrayList<Integer>[] dfsList;
	public static boolean visited[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		node = sc.nextInt();
		edge = sc.nextInt();
		int startNode = sc.nextInt();
		
		dfsList = new ArrayList[node+1];
		visited = new boolean[node+1];
		
		for(int i = 1; i <= node; i++) {
			dfsList[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < edge; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			// 양방향 리스트
			dfsList[s].add(e);
			dfsList[e].add(s);
		}
		
		DFS(startNode);
	}

	private static void DFS(int startNode) {
		if(visited[startNode]) return;
		
		visited[startNode] = true;
		
		System.out.print(startNode + " ");
		
		for(int i : dfsList[startNode]) {
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}
}
