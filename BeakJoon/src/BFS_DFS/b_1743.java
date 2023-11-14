package BFS_DFS;

import java.util.Scanner;

public class b_1743 {
	public static boolean visited[][];
	public static int cnt;
	public static int[] dx = {0, 0, -1, 1};
	public static int[] dy = {1, -1, 0, 0}; // ╩С, го, аб, ©Л
	public static int N, M;
	public static int arr[][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		int K = sc.nextInt();
		
		arr = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		
		for(int i = 0; i < K; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			arr[s][e] = 1;
		}
		
		cnt = 0;
		int max = 0;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					dfs(i, j);
					max = Math.max(max, cnt);
					cnt = 0;
				}			
			}
		}
		
		System.out.println(max);

	}
	private static void dfs(int x, int y) {
		visited[x][y] = true;
		cnt++;
		
		for(int i = 0; i < 4; i++) {
			int moveX = x + dx[i];
			int moveY = y + dy[i];
			
			if(moveX > 0 && moveY > 0 && moveX <= N && moveY <= M) {
				if(!visited[moveX][moveY] && arr[moveX][moveY] == 1) {
					dfs(moveX, moveY);
				}
			}
		}
		
	}
}
