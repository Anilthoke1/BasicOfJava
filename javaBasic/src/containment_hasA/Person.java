package containment_hasA;

public class Person {
	int id,contact;String name,email;
	Address a;
	
	Person(int id,int contact,String name,String email,Address a){
	      this.id=id;
	      this.contact=contact;
	      this.name=name;
	      this.email=email;
	      this.a=a;
	}
	public String toString() {
		return id+" "+contact+name+" "+email+"added"+"\n"+a;
	}

}
