package SIMULATION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class b_20291 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String st;
		HashMap<String, String> map = new HashMap<String, String>();
		
		for(int i = 0 ; i < N; i++) {
			st = sc.nextLine();
			String str[] = st.split("[.]");
			
			map.put(str[1], str[0]);
		}
	}
}
