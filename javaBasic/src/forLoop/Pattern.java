package forLoop;

public class Pattern {
	public static void main(String[] args) {
		int r=6;
		for(int i=1;i<=r;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
				
			}
				for(int j=r;j>=i;j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
