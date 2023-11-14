package BASIC;

import java.util.ArrayList;
import java.util.Scanner;

public class b_10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String>[] arr = new ArrayList[201];
		
		int N = sc.nextInt();
		
		for(int i = 1; i < arr.length; i++) {
			arr[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < N; i++) {
			int age = sc.nextInt();
			String name = sc.nextLine();
			
			arr[age].add(name);
		}
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr[i].size(); j++) {
				if(!arr[i].isEmpty()) {
					System.out.println(i + arr[i].get(j));
				}
			}
		}
	}
}
