package containment_hasA;

public class Person1 {
	String name;
	int age,contact;
	IdProof i;
	public Person1(String name, int age, int contact, IdProof i) {
		
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.i = i;
	//	i=new IdProof( number, nam);
	}
	public String  toString() {
		return  name+" "+age+" "+contact+" "+i;
	}
	
	
	

}
