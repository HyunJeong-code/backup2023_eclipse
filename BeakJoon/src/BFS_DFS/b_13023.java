package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_13023 {
	public static int n;
	public static int m;
	public static boolean visited[];
	public static ArrayList<Integer> list[];
	public static boolean arrive;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n]; 
		list = new ArrayList[n];
		
		for(int i = 0; i < n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			list[s].add(e);
			list[e].add(s);
		}
		
		for(int i = 0; i < n; i ++) {
			DFS(i, 1);
			if(arrive) break;
		}
		
		if(arrive) System.out.println("1");
		else System.out.println("0");
	}

	private static void DFS(int num, int de) {
		if(de == 5 || arrive) { // 깊이가 5에 오거나 도착했을 때 돌아감
			arrive = true;
			return;
		}
		
		visited[num] = true;
		
		for(int i : list[num]) {
			if(!visited[i]) DFS(i, de+1);
		}
		// 관계 시작에서 깊이를 보기 때문에 다시 false로 초기화
		visited[num] = false;
		//System.out.println(num + " false 실행");
	}
}
