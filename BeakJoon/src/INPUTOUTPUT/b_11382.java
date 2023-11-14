package INPUTOUTPUT;

import java.util.Scanner;

public class b_11382 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int[] N = new int[3];
        
        for(int i = 0;i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        
        int result = 0;
        
        for(int i = 0; i < N.length; i++) {
            result += N[i];
        }
        
        System.out.println(result);
	}

}
