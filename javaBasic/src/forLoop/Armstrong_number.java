package forLoop;

import java.util.Scanner;

public class Armstrong_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	int num,temp,r,mul,re=0;
	System.out.println("enter the number ");
	num=sc.nextInt();
	temp=num;
	while(num!=0) {
		r=num%10;
		re=re+(r*r*r);
		num=num/10;
		
	
	}
	if(temp==re)
		System.out.println("armstrong numberr ");
	else
		System.out.println("not armstrong");
	
	
	
	}
}
