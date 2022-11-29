package classAndObject;

import java.util.Scanner;

public class Calculator {
	void add() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("addion is "+c);
	}
	void Sub() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println("substraction is "+c);
	}
	void mul() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println("multipliaction is "+c);
	}
	void div() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println("Diision is "+c);
		sc.close();
	}
	

}
