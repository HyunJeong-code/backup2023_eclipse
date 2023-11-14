package D2;

import java.util.Scanner;

public class D_1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			String str = sc.next();
			int index = str.length()-1;
			char ch[] = str.toCharArray();
			int result = 0;
			
			for(int j = 0; j < ch.length; j++) {
				if(ch[j] != ch[index]) {
					result = 0;
					break;
				}
				else result = 1;
				index--;
			}
			
			if(result == 0) {
				System.out.println("#" + i + " " + result);
			} else {
				System.out.println("#" + i + " " + result);
			}
		}
	}
}
