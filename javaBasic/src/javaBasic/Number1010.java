package javaBasic;

public class Number1010 {
	public static void main(String[] args) {
		int r = 9;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(0);
				} else
					System.out.print(1);

			}
			System.out.println();
		}
		
	}

}
