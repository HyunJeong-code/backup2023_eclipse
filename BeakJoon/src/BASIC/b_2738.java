package BASIC;

import java.util.Scanner;

public class b_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        int M = sc.nextInt();
		int arr1[][] = new int[N][M];
        int arr2[][] = new int[N][M];
        int result[][] = new int[N][M];
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}
}
