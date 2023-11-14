package BASIC;

import java.util.Scanner;

public class b_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int arr[] = new int[31];
        int N = 28;
        
		while(N > 0) {
            int i = sc.nextInt();
            arr[i] = i;
            N--;
        }
        
        for(int j = 1; j < 31; j++) {
            if(arr[j] == 0) System.out.println(j);
        }
	}
}
