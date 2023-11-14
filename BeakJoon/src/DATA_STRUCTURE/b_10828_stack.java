package DATA_STRUCTURE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10828_stack {
	public static int Stack[];
	public static int ptr = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		Stack = new int[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			String str = st.nextToken();
			switch (str) {
			case "push": 
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" : 
				pop();
				break;
			case "size" : 
				size();
				break;
			case "empty" : 
				empty();
				break;
			case "top" :
				top();
				break;
			}
		}
	}
	
	public static void push(int x) {
		ptr++;
		Stack[ptr] = x;
	}
	
	public static void pop() {
		if(ptr >= 0) {
			System.out.println(Stack[ptr--]);
		} else {
			System.out.println("-1");
		}
	}
	
	public static void size() {
		System.out.println(ptr+1);
	}
	
	public static void empty() {
		if(ptr >= 0) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
	}
	
	public static void top() {
		if(ptr >= 0) {
			System.out.println(Stack[ptr]);
		} else {
			System.out.println("-1");
		}
	}
}
