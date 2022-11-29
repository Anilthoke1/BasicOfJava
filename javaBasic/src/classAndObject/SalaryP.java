package classAndObject;

import java.util.Scanner;

public class SalaryP {
	void salary(int salary) {
		
		System.out.println(salary=(salary/15)*100);
	}
	public static void main(String[] args) {
		SalaryP s=new SalaryP();
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the salary");
		int c=sc.nextInt();
		s.salary(c);
		
	}
	

}
