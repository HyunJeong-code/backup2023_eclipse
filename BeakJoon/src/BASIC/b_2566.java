package BASIC;

import java.util.Scanner;

public class b_2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[10][10];
        int max = 0;
        int maxI = 0;
        int maxJ = 0;
        
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) { // 아니 ㅅㅂ 아무곳이나 출력해도 된다며!!!
                if(max <= arr[i][j]) {
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(maxI + " " + maxJ);
	}

}
