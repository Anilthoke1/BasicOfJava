package javaBasic;

import java.util.Scanner;

public class GcdAndLcm {
	public static void main(String[] args) {
		int gcd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++) {
			if(r%i==0)
				gcd=i;
			System.out.println(gcd);
		}
		//System.out.println(gcd);
	}

}
