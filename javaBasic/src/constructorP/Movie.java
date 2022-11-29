package constructorP;

import java.util.Scanner;

public class Movie {
	int id ,releaseYear;String name,producer,budget;
	
	Movie(int id,int releaseYear,String name,String producer,String budget){
		this.id=id;
		this.releaseYear=releaseYear;
		this.name=name;
		this.producer=producer;
		this.budget=budget;
	}
	void display() {
		System.out.println(id+" "+releaseYear+name+producer+budget);
		
	}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++) {
	System.out.println("enter id,year,name,producer,budget");
	int a=sc.nextInt();
	int b=sc.nextInt();
	String  c=sc.next();
	String  d=sc.next();
	String  e=sc.next();
	Movie s=new Movie(a,b,c,d,e);
	s.display();
	}
	
	}
	
}
