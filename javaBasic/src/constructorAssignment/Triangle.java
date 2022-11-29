package constructorAssignment;

public class Triangle {
			public static void main(String[] args) {
			int r=9;
			 for(int i=r;i>=1;i--) {
				for(int l=1;l<=i;l++) {
					System.out.print(" ");
					
				}
				for(int y=i;y<=r-1;y++) {
					System.out.print(y);
					}
				for(int x=r;x>=i;x--) {
					System.out.print(x);
					
				}
				System.out.println();
				
			}
			
			
			
		

	}

}
