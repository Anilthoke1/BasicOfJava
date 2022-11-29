package constructorAssignment;

public class Char {
	public static void main(String[] args) {
		for(int  i=1;i<=6;i++) {
			for(int  k=6,p='A';k>=i;k--,p++) {
				System.out.print((char)p+" ");
			}
			System.out.println(" ");
		}
		for(int  i=2;i<=6;i++) {
			for(int  k=1,p='A';k<=i;k++,p++) {
				System.out.print((char)p+" ");
			}
			System.out.println(" ");
		}
	}

}
