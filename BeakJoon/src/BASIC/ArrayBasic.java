package BASIC;

public class ArrayBasic {

	public static void main(String[] args) {
		String arr[][] = new String[3][4];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("[" + i + "][" + j + "] -> ");
			}
			System.out.println();
		}
	}

}
