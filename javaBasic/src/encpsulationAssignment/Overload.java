package encpsulationAssignment;

import java.util.Scanner;

public class Overload {
	
	void compare(int a,int b) {
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
		
	}
	
	void compare(char a,char b) {
		int ascii=a;
		int Casteascii=b;
		if(a>b)
			System.out.println(a+" " +ascii);
		else
			System.out.println(b+" "+Casteascii);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 integer value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Overload s=new Overload();
		s.compare(a, b);
		Overload s1=new Overload();
		char c=sc.next().charAt(0);
		char d=sc.next().charAt(0);
		s.compare(c, d);
		
	}

}
