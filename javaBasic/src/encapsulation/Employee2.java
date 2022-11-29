package encapsulation;

public class Employee2 {
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

public static void main(String[] args) {
	Employee s= new Employee();
	
	for(int i=0;i<5;i++) {
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
	}

}
}
