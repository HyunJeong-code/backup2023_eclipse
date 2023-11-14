package SIMULATION;

import java.util.Scanner;

public class b_1212 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case '0' : 
				result += "000";
				break;
			case '1' :
				result += "001";
				break;
			case '2' :
				result += "010";
				break;
			case'3' : 
				result += "011";
				break;
			case '4' : 
				result += "100";
				break;
			case '5' : 
				result += "101";
				break;
			case '6' : 
				result += "110";
				break;
			case '7' : 
				result += "111";
				break;
			}
		}
		
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
