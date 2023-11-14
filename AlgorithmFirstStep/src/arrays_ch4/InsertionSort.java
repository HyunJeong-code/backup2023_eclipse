package arrays_ch4;

public class InsertionSort {

	public static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("[" + a[i] + "]");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int[] a = { 90, 34, 38, 12, 56 };
		
		printArray(a);
		
		int tmp, cmp, ins;
		
		for(ins = 1; ins < a.length; ins++) {
			tmp = a[ins]; // 큰 인덱스부터 시작 
			for(cmp = ins - 1; cmp >= 0; cmp--) {
				if(a[cmp] > tmp) { // 작은 인덱스 값이 큰 인덱스의 값보다 큰 경우
					a[cmp + 1] = a[cmp]; // 큰 인덱스에 작은 인덱스의 큰 값을 넣어준다.
				} else {
					break; // 반대의 경우에는 멈춤
				}
			}
			a[cmp + 1] = tmp; // 작은 인덱스 자리에 큰 인덱스에 들어있던 작은 값을 넣는다.
		}
		
		printArray(a);

	}

}
