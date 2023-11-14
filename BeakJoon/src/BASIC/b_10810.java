package BASIC;

import java.util.Scanner;

public class b_10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
        
        int arr[] = new int[N+1];
        int a, b, c;
        
        for(int i = 0; i < M; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            for(int j = a; j <= b; j++) {
                arr[j] = c;
            }
        }
        
        for(int i = 1; i <= N; i++){
            System.out.println(arr[i]);
        }
	}

}
