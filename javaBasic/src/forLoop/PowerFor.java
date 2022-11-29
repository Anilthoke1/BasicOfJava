package forLoop;

import java.util.Scanner;

public class PowerFor {
	public static void main(String[] args) {
//		int power,base=3,p=1,i;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the base ");
//		base=sc.nextInt();
//		
//		for(i=1;i<=base;i++);
//		p*=p;
//		System.out.println(p);
//		
//		
		
		
		int num,r,temp=3,productt=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base ");
		num=sc.nextInt();
		temp=num;
		while(temp!=0) {
		r=temp%10;
		productt=productt*r;
		temp=temp/10;
		
		}
		System.out.println(productt);
	}

}
