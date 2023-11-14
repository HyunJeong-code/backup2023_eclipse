package SIMULATION;

import java.util.Scanner;

public class b_1920_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arrN[] = new int[N];
		int visited[] = new int[100001];
		
		for(int i = 0; i < arrN.length; i++) {
			arrN[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int arrM[] = new int[M];
		
		for(int i = 0; i < M; i++) {
			arrM[i] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			visited[arrN[i]] = 1;
		}
		
		for(int i = 0; i < M; i++) {
			System.out.println(visited[arrM[i]]);
		}
	}
}
