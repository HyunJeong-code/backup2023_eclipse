package BASIC;

import java.util.Scanner;

public class b_16953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int cnt = 1;
		
		while(A != B) { //������ �Ͽ� 0�� ����°� �ƴ� �� ���� �������� �ش� �� ���� ���� ���� Ƚ���� ���� �� �����Ƿ� �ݺ��� ����
			
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
