package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_1697 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		boolean visited[] = new boolean[100001];
		int done[] = new int[100001];
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(N);
		visited[N] = true;
		
		while(!queue.isEmpty()) {
			int nowNode = queue.poll();
			
			int[] move = { nowNode+1, nowNode-1, nowNode*2 };
			
			for(int i : move) {
				if(i < 0 || 100001 <= i) continue;
				
				if(visited[i]) continue;
				
				visited[i] = true;
				
				done[i] = done[nowNode] + 1;
				
				if(K == i) break;
				
				queue.add(i);
				
			}
		}
		
		System.out.println(done[K]);
		
	}
}
