package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b_16953 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		long A = sc.nextInt();
		long B = sc.nextInt();
		
		int cnt = 1;
		
		Queue<Long> queue = new LinkedList<>();
		
		queue.add(A*2);
		queue.add(A*10+1);
		
		while(!queue.isEmpty()) {
			cnt++;
			
			int leng = queue.size();
			
			for(int i = 0; i < leng; i++) {
				long now = queue.poll();
				
				if(now == B) {
					System.out.println(cnt);
					return;
				}
				
				if(now > B) continue;
				
				queue.add(now*2);
				queue.add(now*10+1);
			}
		}
		
		System.out.println("-1");
	}
}
