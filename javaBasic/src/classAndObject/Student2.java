package classAndObject;

import java.util.Scanner;

public class Student2 {
	int id,marks;String name;
	void set(int iid,int markss,String namee) {
		 id=iid;
		marks=markss;
		name=namee;
	}
	void dis() {
		System.out.println(id+" "+marks+" "+name);
	}

	public static void main(String[] args) {
		Student2 s=new Student2();
		Student2 s1=new Student2();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id,marks and name ");
		int i=sc.nextInt();
		int m=sc.nextInt();
		String n=sc.next();
		s.set(i, m, n);
		
		System.out.println("enter the id,marks and name ");
		 i=sc.nextInt();
		 m=sc.nextInt();
		 n=sc.next();
		s1.set(i, m, n);
		Student2 s2=new Student2();
		System.out.println("enter the id,marks and name ");
		i=sc.nextInt();
	    m=sc.nextInt();
		n=sc.next();
		s2.set(i, m, n);
		
		
		s.dis();
		s1.dis();
		s2.dis();
		
		
		
		
		
		
	}
}
