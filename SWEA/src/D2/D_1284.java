package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D_1284 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(bf.readLine());
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			int A = P * W;
			int B = 0;
			if(W-R > 0) {
				B = Q + (W-R) * S;
			} else {
				B = Q;
			}
			
			
			if(A > B) {
				System.out.println("#" + i + " " + B);
			} else {
				System.out.println("#" + i + " " + A);
			}
			
		}
	}
}
