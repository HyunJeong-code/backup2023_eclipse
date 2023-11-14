package arrays_ch4;

public class selectionArray {

	public static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("[" + a[i] + "]");
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		int[] a = { 90, 34, 38, 12, 56 };
		
		printArray(a);
		
		int tmp, cmp, ins, min;
		
		for(ins = 0; ins < a.length - 1; ins++) {
			min = ins;
			for(cmp = ins + 1; cmp < a.length; cmp++) {
				if(a[cmp] < a[ins]) {
					min = cmp;
					tmp = a[ins];
					a[ins] = a[min];
					a[min] = tmp;
				}
			}
		}
		printArray(a);
	}
}
