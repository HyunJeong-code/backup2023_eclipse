package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_2178 {
	public static int[] dx = {0, 1, 0, -1}; //��, ��, ��, ��
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
		
		queue.offer(new int[] {nowN, nowM}); // ť�� �ֱ�
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll(); // ť���� ����
			visited[nowN][nowM] = true;
			
			for(int i = 0; i < 4; i++) {
				int x = now[0] + dx[i]; // �����¿� ���� Ž��
				int y = now[1] + dy[i];
				
				if(x >= 0 && y >= 0 && x < n && y < m) { // �迭 ���� ������ Ž������
					if(arr[x][y] != 0 && !visited[x][y]) { // �湮x, �ش� �ڸ��� �湮 ��������
						visited[x][y] = true; // �湮 ������ �ڸ� �湮ǥ��
						arr[x][y] = arr[now[0]][now[1]] + 1; // ����
						queue.add(new int[] { x, y });
					}
				}
			}
		}
	}
}
