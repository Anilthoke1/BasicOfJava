package constructorP;

import java.util.Scanner;

public class Student2 {
	int id ,year; String name,branch;
	Student2(int id,int year,String name,String branch){
		this.id=id;
		this.year=year;
		this.name=name;
		this.branch=branch;
		
	}
	Student2(int id,int year,String name){
		this.id=id;
		this.year=year;
		this.name=name;
	
		
	}
	void display() {
		System.out.println(id+" "+year+" "+name+" "+branch);
	}
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id,year,name and branch");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String  c=sc.next();
		String d=sc.next();
		Student2 s=new Student2(a,b,c,d);
		
		System.out.println("enter another student id,year,name and branch");
		 a=sc.nextInt();
	     b=sc.nextInt();
	     c=sc.next();
		Student2 s1=new Student2(a,b,c);
		
		s.display();
		s1.display();
}
}
