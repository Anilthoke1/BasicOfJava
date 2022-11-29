package constructorAssignment;

public class Object {
int id;String name, salary;

void Objectt(int id,String name,String salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
	
}

void display() {
	System.out.println(id+" "+name+" "+salary);
}
public static void main(String[] args) {	
Object s=new Object();
s.Objectt(1,"anil","54k");
s.display();
Object s1=new Object();
s1=s;
s1.display();


	
}	
}
