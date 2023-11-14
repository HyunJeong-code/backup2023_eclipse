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
				if(S[1] == E[1]) { //����ð��� ���� ��(�ι�° ���ڰ� ���� ��)
					return S[0] - E[0]; // ù��° ���� ���� ��������
				}
				return S[1] - E[1]; //����ð��� �ٸ� ���, ����ñ��� ���� ������ ����
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
