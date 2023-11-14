package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_2178 {
	public static int[] dx = {0, 1, 0, -1}; //상, 우, 하, 좌
	public static int[] dy = {1, 0, -1, 0};
	public static boolean[][] visited;
	public static int[][] arr;
	public static int n, m;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(bf.readLine());
			String line = st.nextToken();
			for(int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		
		BFS(0, 0);
		
		System.out.println(arr[n-1][m-1]);
	}

	private static void BFS(int nowN, int nowM) {
		Queue<int[]> queue = new LinkedList<>();
		
		queue.offer(new int[] {nowN, nowM}); // 큐에 넣기
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll(); // 큐에서 빼기
			visited[nowN][nowM] = true;
			
			for(int i = 0; i < 4; i++) {
				int x = now[0] + dx[i]; // 상하좌우 각자 탐색
				int y = now[1] + dy[i];
				
				if(x >= 0 && y >= 0 && x < n && y < m) { // 배열 범위 내에서 탐색조건
					if(arr[x][y] != 0 && !visited[x][y]) { // 방문x, 해당 자리가 방문 가능한지
						visited[x][y] = true; // 방문 가능한 자리 방문표시
						arr[x][y] = arr[now[0]][now[1]] + 1; // 누적
						queue.add(new int[] { x, y });
					}
				}
			}
		}
	}
}
