package DATA_STRUCTURE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class b_9093 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		Stack<Character> stack = new Stack<>();
		
		while(T-- > 0) {
			String str = bf.readLine() + "\n";
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ' ' || str.charAt(i) == '\n') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(str.charAt(i));
				} else {
					stack.push(str.charAt(i));
				}
			}
			System.out.println();
		}
		bw.flush();
	}
}
