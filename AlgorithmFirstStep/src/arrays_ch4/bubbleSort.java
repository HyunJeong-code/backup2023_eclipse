package arrays_ch4;

public class bubbleSort {

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
		
		for(ins = 0; ins < a.length - 1; ins++) {
			for(cmp = 0; cmp < a.length - ins - 1; cmp++) {
				if(a[cmp] > a[cmp + 1]) {
					tmp = a[cmp];
					a[cmp] = a[cmp + 1];
					a[cmp + 1] = tmp;
				}
			}
		}
		
		printArray(a);
		
	}

}
