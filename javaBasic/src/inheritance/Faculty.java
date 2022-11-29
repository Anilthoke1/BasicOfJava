package inheritance;

public class Faculty extends Person {
	int subject,salary;

	public float getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	public int  getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	void pfCalculator(){
		 double pf=0.5*salary;
		 System.out.println("pf is : "+pf);
		
	}
	

}
