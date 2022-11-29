package encpsulationAssignment;

public class Person {
		String name,address,gender;int age;
		Address a;


		public Person(String name, String address, String gender, int age,String city,String state,String country) {
		//	super();
			this.name = name;
			this.address = address;
			this.gender = gender;
			this.age = age;
			
			a=new Address( city, state,country);
			
		}
		public String  toString() {
			return name+" "+address+" "+gender+" "+age+" "+a;
		}
		
		
	}


