package class_objectAssignment;

import java.util.Scanner;

class PatternDe{
	void downstair(int row) {
		for(int i =0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	void star(int row) {
	for(int i=0;i<=row;i++) {
		
		for(int j=1;j<=i;j++) {
			if(i%2==0)
			
				System.out.print("1");
				else
					System.out.print("0");
			
		}
		System.out.println();
	}
	}
	 
}





public class Pattern {
	public static void main(String[] args) {
		PatternDe s=new PatternDe();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row for star");
		int row=sc.nextInt();
		System.out.println("enter the row for downstair");
		int i=sc.nextInt();
		
		System.out.println();
		
		s.downstair(row);
		s.star(i);
		
		
		
	}

}
