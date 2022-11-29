package constructorP;
import java.util.Scanner;

public class Employee1 {
	int id,salary;
	String name,dept;
	

	void display() {
		System.out.println(id+" "+name+" "+salary+" "+" "+dept);
	}
	public String tostring() {
		return id+" "+name+" "+salary+" "+dept;
	}
	Employee1(int i,int s,String n,String d){
		id=i;
		salary=s;
		name=n;
		dept=d;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id,salary,name and depatnment");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String  c=sc.next();
		String d=sc.next();
		 Employee1 s=new Employee1(a,b,c,d);
		 s.display();
		 System.out.println(s.hashCode());
		 
		  a=sc.nextInt();
			 b=sc.nextInt();
			  c=sc.next();
			 d=sc.next();
			 Employee1 s1=new Employee1(a,b,c,d);
			 s1.display();
			 
			 
		 
	}
	

}
