package forLoop;

import java.util.Scanner;

public class ArmstrongGoogle {
	public static void main(String[] args) {
		int r,n,arm=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		temp=n;
		for(;n!=0;n++) {
			r=n%10;
			arm=arm+(r*r*r);
			
		}
		if(arm==temp)
			System.out.println(temp+"is armstrong");
		else
			System.out.println(temp+"not armstrong");
		
	}

}
