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
			tmp = a[ins]; // ū �ε������� ���� 
			for(cmp = ins - 1; cmp >= 0; cmp--) {
				if(a[cmp] > tmp) { // ���� �ε��� ���� ū �ε����� ������ ū ���
					a[cmp + 1] = a[cmp]; // ū �ε����� ���� �ε����� ū ���� �־��ش�.
				} else {
					break; // �ݴ��� ��쿡�� ����
				}
			}
			a[cmp + 1] = tmp; // ���� �ε��� �ڸ��� ū �ε����� ����ִ� ���� ���� �ִ´�.
		}
		
		printArray(a);

	}

}
