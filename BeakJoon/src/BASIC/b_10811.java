package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10811 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < M; i ++) {
			st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			while(A < B) {
				int tmp = arr[A];
				arr[A] = arr[B];
				arr[B] = tmp;
				A++;
				B--;
			}
		}
		for(int j = 1; j <= N; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
