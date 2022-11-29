package forLoop;

public class Trianglepattern {
	public static void main(String[] args) {
		 int r=6;
		 for(int i=0;i<=r;i++) {
			 for(int j=5;j>=i;j--) {
				 
				 System.out.print(" ");
			 }
			 for(int k=0;k<=i;k++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}

} 
