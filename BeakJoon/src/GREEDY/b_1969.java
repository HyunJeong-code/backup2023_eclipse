package GREEDY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1969 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String str[] = new String[N];
		String tmp = "";
		
		String result = "";
		
		for(int i = 0; i < N; i++) {
			str[i] = bf.readLine();
		}
		
		
		for(int i = 0; i < M; i ++) {
			int cnt[] = new int[4]; // ACGT
			for(int j = 0; j < N; j++) {
				char ch = str[j].charAt(i);
				if(ch == 'A') {
					cnt[0]++;
				} else if(ch == 'C') {
					cnt[1]++;
				} else if(ch == 'G' ) {
					cnt[2]++;
				} else {
					cnt[3]++;
				}
			}
			
			int max = 0;
			int idx = 0;
			
			for(int k = 0; k < 4; k++) {
				if(cnt[k] > max || (cnt[k] == max && k < idx)) {
					max = cnt[k];
					idx = k;
				}
			}
			
			switch(idx) {
				case 0 :
					result += "A";
					break;
				case 1 :
					result += "C";
					break;
				case 2 : 
					result += "G";
					break;
				case 3 :
					result += "T";
					break;
			}
		}
		System.out.println(result);
	}
}
