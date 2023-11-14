package GREEDY;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class b_1931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[][] = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] S, int[] E) {
				if(S[1] == E[1]) { //종료시간이 같을 때(두번째 숫자가 같을 때)
					return S[0] - E[0]; // 첫번째 시작 기준 오름차순
				}
				return S[1] - E[1]; //종료시간이 다를 경우, 종료시긴이 빠른 순으로 정렬
			}
		});
		
		int cnt = 0;
		int end = -1;
		for(int i = 0; i < N; i++) {
			if(arr[i][0] >= end) {
				end = arr[i][1];
				cnt++;
				//System.out.println(cnt);
			}
		}
		
		System.out.println(cnt);
	}
}
