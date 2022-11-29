package encapsulation;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		if(a%3==0&&a!=0) {
			System.out.println("prime");
		}
		else
			System.out.println("not prime");

	}
}
