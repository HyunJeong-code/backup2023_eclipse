package D2;

import java.util.Scanner;

public class D_1945 {
	
	public static int arr[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		for(int i = 0; i < T; i++) {
			arr = new int[5];
			int N = sc.nextInt();
			Result(N);
			System.out.print("#" + (i+1));
			for(int j = 0; j < arr.length; j++) {
				System.out.print(" " + arr[j]);
			}
			System.out.println();
		}
		
	}
	
	private static void Result(int n) {
		while(n != 0) {
			if(n % 2 == 0) {
				n /= 2;
				arr[0]++;
			} else if(n % 3 == 0) {
				n /= 3;
				arr[1]++;
			} else if(n % 5 == 0) {
				n /= 5;
				arr[2]++;
			} else if(n % 7 == 0) {
				n /= 7;
				arr[3]++;
			} else if(n % 11 == 0){
				n /= 11;
				arr[4]++;
			} else {
				break;
			}
		}
	}
}
