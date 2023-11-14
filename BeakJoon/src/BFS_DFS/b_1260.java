package BFS_DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_1260 {

	public static int node;
	public static int edge;
	public static ArrayList<Integer>[] List;
	public static boolean visited[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		node = sc.nextInt();
		edge = sc.nextInt();
		int StartIndex = sc.nextInt();
		
		List = new ArrayList[node+1];
		
		
		for(int i = 1; i <= node; i++) {
			List[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < edge; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			List[start].add(end);
			List[end].add(start);
		}
		
		for(int i = 1; i <= node; i++) {
			Collections.sort(List[i]);
		}
		
		visited = new boolean[node+1];
		DFS(StartIndex);
		
		System.out.println();
		
		visited = new boolean[node+1];
		BFS(StartIndex);

	}

	private static void DFS(int startIndex) {
		if(visited[startIndex]) return;
		
		visited[startIndex] = true;
		
		System.out.print(startIndex + " ");
		
		for(int i : List[startIndex]) {
			if(visited[i] == false) DFS(i);
		}
	}

	private static void BFS(int startIndex) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(startIndex);
		
		visited[startIndex] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			System.out.print(now + " ");
			
			for(int i : List[now]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}
