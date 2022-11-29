package classAndObject;
import java.util.Scanner;

public class SalaryPf {
	double bonus(float salary,char ch) {
		double newSal;
		System.out.println("origional saalary"+salary);
		if(ch=='A')
			newSal=salary+(salary*.15);
		else if(ch=='B')
			newSal=salary+(salary*.10);
		else if(ch=='C')
			newSal=salary+(salary*.5);
		else
			newSal=salary;
		System.out.println("salary after adding bonus"+newSal);
		return newSal;

	}
	void pfCalculator(float salary) {
		float pf=salary*0.10f;
		System.out.println("pf"+pf);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.println("enter the salary");
		int sal=sc.nextInt();
		char ch=sc.next().charAt(0);
		SalaryPf s=new SalaryPf();
		
		
	}

}
