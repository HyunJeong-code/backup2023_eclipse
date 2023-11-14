package DATA_STRUCTURE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10845 {

	public static int Queue[] = new int[10001];
	public static int front = 0;
	public static int back = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		
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
			case "front" :
				front();
				break;
			case "back" :
				back();
				break;
			}
		}
	}
	
	public static void push(int x) {
		Queue[back] = x;
		back++;
	}
	
	public static void pop() {
		if(back - front == 0) {
			System.out.println("-1");
		} else {
			System.out.println(Queue[front]);
			front++;
		}
	}
	
	public static void size() {
		System.out.println(back - front);
	}
	
	public static void empty() {
		if(back - front == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	
	public static void front() {
		if(back - front == 0) {
			System.out.println("-1");
		} else {
			System.out.println(Queue[front]);
		}
	}
	
	public static void back() {
		if(back - front == 0) {
			System.out.println("-1");
		} else {
			System.out.println(Queue[back-1]);
		}
	}
	
}
