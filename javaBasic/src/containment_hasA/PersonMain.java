package containment_hasA;

public class PersonMain {
	public static void main(String[] args) {
		
	
 Address a=new Address(431512, "central pune", "pune", "maharashtra");
 Person p=new Person(1,74747747,"anil","anil@123",a);
 Person p2=new Person(2,55577,"sunil","sunil@123",a);
 Person p3=new Person(3,67664,"vivek","vivek@123",a);
 System.out.println(p.toString());
 System.out.println(p2.toString());
 System.out.println(p3.toString());
 

	
	}	
}
