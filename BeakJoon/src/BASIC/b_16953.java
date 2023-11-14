package BASIC;

import java.util.Scanner;

public class b_16953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int cnt = 1;
		
		while(A != B) { //연산을 하여 0을 만드는게 아닌 두 수가 같아지면 해당 두 개의 수로 연산 횟수를 구할 수 있으므로 반복문 종료
			
			if(A > B) {
				System.out.println("-1");
				return;
			}
			
			String str = String.valueOf(B);
			if(B % 2 == 0) {
				B /= 2;
			} else if(str.charAt(str.length()-1) == '1') {
				str = str.substring(0, str.length()-1);
				B = Integer.parseInt(str);
			} else {
				System.out.println("-1");
				return;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}

}
