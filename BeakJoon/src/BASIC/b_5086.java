package BASIC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A == 0 && B == 0) break;
			
			if(A % B == 0) {
				System.out.println("multiple");
			}else if (B % A == 0) {
				System.out.println("factor");
			}else {
				System.out.println("neither");
			}
		}      
	}
}
