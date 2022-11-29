package classAndObject;

import java.util.Scanner;

public class Employee2 {
	int id;String name,dept;float salary;double contact;String email; 
	void Set(int idd,String namee,String deptt,float salaryy,double contactt,String emaill ) {
		id=idd;
		name=namee;
		dept=deptt;
		salary=salaryy;
		contact=contactt;
		email=emaill;
	}
	void display(){
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+contact+" "+email);
		
	}
	public static void main(String[] args) {
	int a=6;	
	for(int i=0;i<=a;i++) {
	Employee s=new Employee();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int j=sc.nextInt();
	System.out.println("enter the name");
	String n=sc.next();
	System.out.println("enter the departnment name ");
	String d=sc.next();
	System.out.println("enter the salary");
	float sa=sc.nextFloat();
	System.out.println("enter the contact number ");
	double c=sc.nextDouble();
	System.out.println("enter the email");
	String e=sc.next();
	s.Set(j, n, d, sa, c, e);
	s.display();
	}
	}

}
