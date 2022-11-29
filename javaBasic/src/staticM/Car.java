package staticM;

import java.util.Scanner;

public class Car {
 int price;String name,milage;
 static String wheel="4 wheels",engine="yes";
 Car(String name,int price,String milage){
	 this.price=price;
	 this.name=name;
	 this.milage=milage;
 }
 void display()
 {
	 System.out.println("car price is: "+ price);
	 System.out.println("car name is: "+ name);
	 System.out.println("car milage  is: "+ milage);
	 System.out.println("car wheels are: "+ Car.wheel+ "and car have engine ? : "+Car.engine);
 }
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<1;i++) {
	System.out.println("enter car name ,price and milage");
	String a=sc.next();
	int b=sc.nextInt();
	String c=sc.next();
	Car s=new Car(a,b,c);
	
	}
	System.out.println("enter car name ,price and milagge");
	String a=sc.next();
	int  b=sc.nextInt();
	String c=sc.next();
	Car s1=new Car(a,b,c);
	s1.display();
	
	System.out.println("enter car name ,price and milage");
	 a=sc.next();
	 b=sc.nextInt();
     c=sc.next();
	Car s2=new Car(a,b,c);
	s1.display();
	
	
	
	
	
}
 
 
}
