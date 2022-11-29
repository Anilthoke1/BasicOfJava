package javaProblem;

import java.util.Scanner;

public class Shopping {
	String laptop;
	int q,price,bil;
	
	
	void detai(String L,int quantity,int p) {
		laptop=L;
		q=quantity;
		price=p;
	
		
		
	}
	void bill() {
		int bil=(q*price);
				
		System.out.println("quantity is"+" "+q+" "+"and price is "+price);
		
		
	}
	void display() {
		if(q>1) {
	System.out.println(bil+" "+q+" "+ "price is "+price);
		}else
			System.out.println("item not enough");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	Shopping s=new Shopping();
	s.detai("Laptop", 0, 50000);
	s.bill();
	s.display();
	}
}
