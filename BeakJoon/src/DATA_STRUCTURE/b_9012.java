package DATA_STRUCTURE;

import java.util.Scanner;
import java.util.Stack;

public class b_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		Stack<Character> stack = new Stack<>();
		
		while(T-- > 0) {
			String str = sc.next();
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == '(') {
					stack.push(str.charAt(i));
				} else if(str.charAt(i) == ')') {
					if(!stack.empty()) {
						stack.pop();
					} else {
						stack.push('N');
						break;
					}
				}
			}
			
			if(!stack.empty()) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
