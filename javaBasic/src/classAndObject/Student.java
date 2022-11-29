package classAndObject;

import java.util.Scanner;

public class Student {
	int id;
	String name , dep;
	void set() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter id,name and department");
		id=sc.nextInt();
		name=sc.next();
		dep=sc.next();
	}
	void display() {
		System.out.println(id+" "+name+" "+dep);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.set();
		Student s1=new Student();
		s1.set();
		Student s3=new Student();
		s3.set();
		s.display();
		s1.display();
		s3.display();
		
		
	
		
	}

}
