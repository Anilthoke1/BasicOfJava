package javaBasic;

import java.util.Scanner;

public class Do_whilesimple {
	public static void main(String[] args) {
		int a,b;
		char q;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enter the number ");
		a=sc.nextInt();
		b=sc.nextInt();
		int  c=a+b;
		System.out.println("you want to continue type Y or y ");
		q=sc.next().charAt(0);
		
		}while(q=='y'||q=='Y' );
		sc.close();
		
	}

}
