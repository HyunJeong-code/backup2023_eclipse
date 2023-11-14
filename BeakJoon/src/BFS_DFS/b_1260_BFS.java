package BFS_DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_1260_BFS {
	
	public static int node;
	public static int edge;
	public static ArrayList<Integer>[] bfsList;
	public static boolean vistited[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		node = sc.nextInt();
		edge = sc.nextInt();
		int startNode = sc.nextInt();
		
		bfsList = new ArrayList[node+1];
		vistited = new boolean[node+1];
		
		for(int i = 1; i <= node; i++) {
			bfsList[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < edge; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			// 양방향 리스트
			bfsList[s].add(e);
			bfsList[e].add(s);
		}

		BFS(startNode);
		
	}

	private static void BFS(int startNode) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(startNode);
		vistited[startNode] = true;
		
		while(!queue.isEmpty()) {
			int nowNode = queue.poll();
			
			System.out.print(nowNode + " ");
			
			for(int i : bfsList[nowNode]) {
				if(!vistited[i]) {
					vistited[i] = true;
					queue.add(i);
				}
			}
		}
		
	}

}
