package sumsum00;

import java.util.Scanner;

public class ssafy {
	public static void main(String args[]) throws Exception
	 {
		Scanner sc = new Scanner(System.in);

		/*
		   ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		*/
		int T = sc.nextInt();
        
        //N, arr[]�� �ο���, �Ÿ� �Է�
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            int ans[] = new int[N];
            int cnt = 0;
            for(int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                if(j + arr[j] >= N || j + arr[j] < 0) {
                    continue;
                } else {
                    ans[j] = j + arr[j];
            }
            for(int k = 0; k < N; k++) {
                if(ans[k] >= N || ans[k] < 0) {
                    continue;
                } else {
                    if(k == ans[ans[k]]) cnt++;
                }
            }
            if(cnt != 0) {
                System.out.println("#" + (i + 1) + " " + cnt/2);
            } else {
                System.out.println("#" + (i + 1) + " " + cnt);
            }
        }
	 }
}
}
