package javaBasic;

import java.util.Scanner;

public class Pelindrome_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,temp,r,p,sum=0;
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
			
		}
		if(temp==sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not pelindrome number ");
		
	}

}
