package SIMULATION;

public class b_4673 {
	public static void main(String[] args) {
		boolean visited[] = new boolean[10001];
		int tmp;
		
		for(int i = 1; i < visited.length; i++) {
			tmp = d(i);
			if(tmp < 10001) {
				visited[tmp] = true;
			}
		}
		
		for(int i = 1; i < visited.length; i++) {
			if(!visited[i]) {
				System.out.println(i);
			}
		}
	}

	private static int d(int n) {
		int sum = n;
		
		while(n != 0) {
			sum += (n%10);
			n /= 10;
		}
		return sum;
	}
}
