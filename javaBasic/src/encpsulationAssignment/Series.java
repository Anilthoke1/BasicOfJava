package encpsulationAssignment;

import java.util.Scanner;

public class Series {
	double sum,mid;
	
	void series(double a) {
		int i=1;
	 while(i<=8){
		   mid+=(a/i);
		   //sum+=mid;
		   i++;
		 
	 }
	 System.out.println(mid);
	}
	
	void series(double a,double b) {
		//int i=1;
		for(int i=1;i<b;i+=3) {
			sum=i/a+3;
		}
		System.out.println("sum is "+sum);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Series s=new Series();
		double a=sc.nextDouble();
		System.out.println("enter the starting point ");
		s.series(a);// a =1 for starting point
		Series s1=new Series();
		System.out.println("enter the a value and limit value");
        a=sc.nextDouble();
        double  b=sc.nextDouble();
		s1.series(a, b);//a=2 for a2,a5 and b=8for loop limit
	}

}
