package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D_2056 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int test = 1; test <= T; test++) {
			String str = bf.readLine();
			int year = Integer.parseInt(str.substring(0, 4));
			int month = Integer.parseInt(str.substring(4, 6));
			int day = Integer.parseInt(str.substring(6, 8));
			
			if(year > 0000) {
				if(month < 13 && month > 0) {
					if(month == 2) {
						if(day < 29 && day > 0) System.out.println("#" + test + " " + str.substring(0, 4) +"/" + str.substring(4, 6) + "/" + str.substring(6, 8));
						else System.out.println("#" + test + " " +"-1");
					} else if(month == 9 || month == 4 || month == 11 || month == 6) {
						if(day < 31 && day > 0) System.out.println("#" + test + " " + str.substring(0, 4) +"/" + str.substring(4, 6) + "/" + str.substring(6, 8));
						else System.out.println("#" + test + " " +"-1");
					} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 8 || month == 10 || month == 12){
						if(day < 32 && day > 0) System.out.println("#" + test + " " + str.substring(0, 4) +"/" + str.substring(4, 6) + "/" + str.substring(6, 8));
						else System.out.println("#" + test + " " +"-1");
					} else {
						System.out.println("#" + test + " " +"-1");
					}
				} else {
					System.out.println("#" + test + " " +"-1");
				}
			} else {
				System.out.println("#" + test + " " +"-1");
			}
		}
	
	}
}
