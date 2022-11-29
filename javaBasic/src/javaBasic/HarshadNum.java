package javaBasic;

import java.util.Scanner;

public class HarshadNum {
	public static void main(String[] args) {
		int num,r=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		num=sc.nextInt();
		int temp=num;
		while(num!=0) {
			r=num%10;
			sum=r+sum;
			num=num/10;
		
		}
		if(temp%sum==0)
			System.out.println("it is Harshad number ");
		else
			System.out.println("not Harshad number ");
		sc.close();
		
		
		
		
	}

}
