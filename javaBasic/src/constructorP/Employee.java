package constructorP;


public class Employee {
	int id,salary;
	String name,dept;
	
	void display() {
		System.out.println(id+" "+name+" "+salary+" "+" "+dept);
	}
	Employee(){
		id=1;
		salary=787343;
		name="anil";
		dept="cse";
		
	}
	public static void main(String[] args) {
		Employee s=new Employee();
		s.display();
		System.out.println("------");
		Employee s1=new Employee();
		s1.display();
	}

}
