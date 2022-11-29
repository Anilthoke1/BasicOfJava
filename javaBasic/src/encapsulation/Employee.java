package encapsulation;

import java.util.Scanner;

public class Employee {
	private int id,salary,contact;
	private String name ,dept;
	void setId(int id) {
		this.id=id;
	}
	int getId() {
		return id;
	}
	void setSalary(int salary) {
		this.salary=salary;
	}
	int getSalary() {
		return salary;
	}
	void setContact(int contact) {
		this.contact=contact;
	}
	int getContact() {
		return contact;
	}
	void setName(String name) {
		this.name=name;
		
	}
	String getName() {
		return name ;
	}
	void setDept(String dept) {
		this.dept=dept;
	}
	String getDept() {
		return dept;
	}
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();

public static void main(String[] args) {
	Employee s= new Employee();
	
	
	s.setId(1);
	System.out.println(s.getId());
	s.setSalary(50000);
	System.out.println(s.getSalary());
	s.setContact(424352);
	System.out.println(s.getContact());
	s.setName("anil");
	System.out.println(s.getName());
	s.setDept("cse");
	System.out.println(s.getDept());
	
	Employee s2= new Employee();
	s2.setId(12);
	System.out.println(s.getId());
	s2.setSalary(50000);
	System.out.println(s.getSalary());
	s2.setContact(424352);
	System.out.println(s.getContact());
	s2.setName("anil");
	System.out.println(s.getName());
	s2.setDept("cse");
	System.out.println(s.getDept());
	
	Employee s3= new Employee();
	s3.setId(12);
	System.out.println(s.getId());
	s3.setSalary(50000);
	System.out.println(s.getSalary());
	s3.setContact(424352);
	System.out.println(s.getContact());
	s3.setName("anil");
	System.out.println(s.getName());
	s3.setDept("cse");
	System.out.println(s.getDept());
	
	Employee s4= new Employee();
	s4.setId(12);
	System.out.println(s.getId());
	s4.setSalary(50000);
	System.out.println(s.getSalary());
	s4.setContact(424352);
	System.out.println(s.getContact());
	s4.setName("anil");
	System.out.println(s.getName());
	s4.setDept("cse");
	System.out.println(s.getDept());
	
	Employee s5= new Employee();
	s5.setId(12);
	System.out.println(s.getId());
	s5.setSalary(50000);
	System.out.println(s.getSalary());
	s5.setContact(424352);
	System.out.println(s.getContact());
	s5.setName("anil");
	System.out.println(s.getName());
	s5.setDept("cse");
	System.out.println(s.getDept());
	
	
	
	
}
}
