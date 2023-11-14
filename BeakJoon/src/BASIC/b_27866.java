package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		int index = Integer.parseInt(bf.readLine());
		
		System.out.println(str.charAt(index-1));
	}
}
