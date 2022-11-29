package forLoop;

import java.util.Scanner;

public class FactorDemo {
	public static void main(String[] args) {
		Factor s=new Factor();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number  ");
		int a=sc.nextInt();
		s.fact(a);
	}
	
	
	}
	class Factor{
		void fact(int j) {
			int sum=0;
			for(int i=0;i<=j;i++) {
				if(i%2==0) {
					
				 sum=sum+i;
					System.out.println(sum);
					}
			}

		}
	}
