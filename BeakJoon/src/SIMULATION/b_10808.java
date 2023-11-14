package SIMULATION;

import java.util.Scanner;

public class b_10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int visited[] = new int[26];
		
		for(char ch : s.toCharArray()) {
			visited[(int)ch-97]++;
		}
		
		for(int i = 0; i < visited.length; i++) {
			System.out.print(visited[i] + " ");
		}
	}
}
