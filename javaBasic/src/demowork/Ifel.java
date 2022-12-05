package demowork;

import java.util.Scanner;

public class Ifel {
	 String  a,name;
	
	
		void dis(String a,String name) {
			this.a=a;
			this.name=name;
		
			if(a==name) {
				System.out.println("yes done");
				
			}
		}
		public static void main(String[] args) {
			Ifel i=new Ifel();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name ");
			
			  String b=sc.next();
			  System.out.println("enter name ");
			String bname =sc.next();
			  i.dis(b, bname);
			
		}
}