package GREEDY;

import java.util.Arrays;
import java.util.Scanner;

public class b_10610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int arr[] = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		Arrays.sort(arr);
		boolean check = false;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[0] == 0) check = true;
			sum += arr[i];
		}
		
		if((sum % 3) == 0 && check == true) {
			for(int i = arr.length-1; i >= 0; i--) {
				System.out.print(arr[i]);
			}
		} else {
			System.out.println("-1");
		}
	}
}
