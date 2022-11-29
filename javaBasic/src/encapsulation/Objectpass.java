package encapsulation;



public class Objectpass{
	int amount;
	Objectpas s;
	void deposit(int amount, Objectpas s) {
		this.s=s;
		System.out.println(s.getId()+" \n" );
		;
		
	}
	
	
	
	public static void main(String[] args) {
		Objectpas t=new Objectpas();
		t.setId(6);
		Objectpass s1=new Objectpass();
		s1.deposit(423, t);
	
	Objectpas s=new Objectpas();
	s.setId(50);
	s.setSalary(5000);
	
	
}
}