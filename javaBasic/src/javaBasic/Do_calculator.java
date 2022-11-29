package javaBasic;

import java.util.Scanner;

public class Do_calculator {
	public static void main(String[] args) {
		int a,b,c,d;
		char z;
		 
		Scanner sc =new Scanner(System.in);
		System.out.println("entere the case");
		c=sc.nextInt();
		do {
		switch(c) {
		case 1:
			System.out.println("enter number");
			a=sc.nextInt();
			System.out.println("enter number");
			b=sc.nextInt();
			d=a+b;
			System.out.println(d);
			
		case 2:
			System.out.println("enter number");
			a=sc.nextInt();
			System.out.println("enter number");
			b=sc.nextInt();
			d=a*b;
			System.out.println(d);
		case3 :
			System.out.println("enter number");
			a=sc.nextInt();
			System.out.println("enter number");
			b=sc.nextInt();
			d=a-b;
			System.out.println(d);
			
		
		}
		
		System.out.println("want to cou");
		
		}
		while(c=='Y'||c=='y');
		
		
		
		
		
		
	}

}
