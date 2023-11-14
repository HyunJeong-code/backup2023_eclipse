package BFS_DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_1167 {
	static boolean visited[];
	static int[] dis;
	static ArrayList<Edge>[] list;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		list = new ArrayList[N+1];
		
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<Edge>();
		}
		
		for(int i = 0; i < N; i++) {
			int s = sc.nextInt();
			while(true) {
				int E = sc.nextInt();
				if(E == -1) 
					break;
				int V = sc.nextInt();
				//list[s].add(new Edge(E, V));
			}
		}
		
		dis = new int[N + 1];
		visited = new boolean[N + 1];
		
		BFS(1);
		
		int max = 1;
		
		for(int i = 2; i <= N; i++) {
			if(dis[max] < dis[i])
				max = i;
		}
		
		dis = new int[N + 1];
		visited = new boolean[N + 1];
		
		BFS(max);
		
		Arrays.sort(dis);
		System.out.println(dis[N]);
	}
	
	private static void BFS(int index) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(index);
		visited[index] = true;
		
		
		
	}

	class Edge {
		int e;
		int value;
		
		public Edge(int e, int value) {
			this.e = e;
			this.value = value;
		}
	}
}
