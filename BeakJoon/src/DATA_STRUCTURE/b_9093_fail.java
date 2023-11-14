package DATA_STRUCTURE;

import java.util.Scanner;
import java.util.Stack;

public class b_9093_fail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		Stack<String> stack = new Stack<>();
		
		int N = sc.nextInt();
		String[] arr;
		
		for(int i = 0; i < N; i++) {
			str = sc.nextLine() + " ";
			arr = str.split(" ");
			
			for(String s : arr) {
				
				stack.push(s);
				String st = stack.peek();
				
				for(int j = st.length()-1 ; j >= 0; j-- ) {
					System.out.print(st.charAt(j));
				}
				stack.pop();
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
