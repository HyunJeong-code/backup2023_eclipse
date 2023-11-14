package SIMULATION;

import java.util.Scanner;

public class b_1212_timeout {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int num;
		int arr[] = new int[3];
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			num = str.charAt(i) - '0';
			
			for(int j = 2; j >= 0; j--) {
				if(j == 0) {
					arr[j] = num / 2;
					//System.out.println("0 : " + arr[j]);
				} else if(j == 1 ){
					arr[j] = num % 2;
					//System.out.println("1 : "  + arr[j]);
				} else {
					arr[j] = num % 2;
					//System.out.println("2 : " + arr[j]);
					num /= 2;
				}
				
			}
			for(int k = 0; k < arr.length; k++) {
				result += arr[k];
			}
		}
		//System.out.println(result);
		if(result.charAt(0) == '0') {
			if(result.charAt(1) == '0') {
				System.out.println(result.substring(2, result.length()));
			} else {
				System.out.println(result.substring(1, result.length()));
			}
		} else {
			System.out.println(result);
		}
	}
}
