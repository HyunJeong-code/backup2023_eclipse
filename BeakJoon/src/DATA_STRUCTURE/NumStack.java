package DATA_STRUCTURE;

public class NumStack {
	private int[] arr;
	private int top = -1;
	
	public NumStack(int stackSize) {
		this.arr = new int[stackSize];
	}
	
	private void push(int x) {
		if(top < arr.length) {
			arr[++top] = x;
			System.out.println(x);
		} else {
			System.out.println("stack is full");
		}
	}
	
	private int pop() {
		if(top > 0) {
			return arr[top--];
		} else {
			System.out.println("-1");
			throw new java.util.NoSuchElementException();
		}
	}
	
	private void isEmpty() {
		if(top >= 0) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
	}
	
	private void top() {
		if(top >= 0 ) {
			System.out.println(arr[top]);
		} else {
			System.out.println("-1");
		}
	}
}
