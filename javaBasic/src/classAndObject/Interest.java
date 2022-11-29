package classAndObject;

import java.util.Scanner;

public class Interest {
	int d;
	void total_interest(int p,int r,int t) {
		d=(p*(1+r*t));
		System.out.println(d);
	}
	public static void main(String[] args) {
		Interest s=new Interest();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the balance,rate and time");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		s.total_interest(p, r, t);
	}

}
