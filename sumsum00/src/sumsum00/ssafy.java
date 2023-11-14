package sumsum00;

import java.util.Scanner;

public class ssafy {
	public static void main(String args[]) throws Exception
	 {
		Scanner sc = new Scanner(System.in);

		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
		int T = sc.nextInt();
        
        //N, arr[]로 인원수, 거리 입력
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
