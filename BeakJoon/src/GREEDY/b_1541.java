package GREEDY;

import java.util.Scanner;

public class b_1541 {
	static int result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		String[] str = st.split("-");
		for(int i = 0; i < str.length; i++) {
			int tmp = sum(str[i]);
			if(i == 0) {
				result += tmp;
			} else {
				result -= tmp;
			}
		}
		
		System.out.println(result);
	}
	private static int sum(String str) {
		int sum = 0;
		String tmp[] = str.split("[+]");
		for(int i = 0; i < tmp.length; i++) {
			sum += Integer.parseInt(tmp[i]);
		}
		return sum;
	}
}
