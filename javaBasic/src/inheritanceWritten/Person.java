package inheritanceWritten;

public class Person {


	int id,contact;String name,address;  
	 String  addressproof;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAddressproof(String addressproof) {
		this.addressproof = addressproof;
	}
	void display() {
		System.out.println("person name"+name+"contact"+contact
				+" "+address+"and "+addressproof);
	}
	
	
}


