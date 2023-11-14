package D3;

import java.util.Scanner;

public class D_4406 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= t; i++) {
			String st = sc.nextLine();
			
			char[] ch = st.toCharArray();
			String result = "";
			
			for(int j = 0; j < ch.length; j++) {
				switch (ch[j]) {
				case 'a': 
					break;
				case 'e' :
					break;
				case 'i' : 
					break;
				case 'o' : 
					break;
				case 'u' :
					break;
				default:
					result += ch[j];
					break;
					
				}
			}
			
			System.out.println(result);
		}
	}
}
