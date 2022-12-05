package inheritanceWritten;

public class Idproof extends Person{
	String name;int number ,validity;


//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public void setNumber(int number) {
//		this.number = number;
//	}
//
//
//	public void setValidity(int validity) {
//		this.validity = validity;
//	}
//	
	void set(String name,int number,int validity) {
		this.name=name;
		this.number=number;
		this.validity=validity;
	}
	
//	void data() {
//		if(addressproof==name&&address=="pune") {
//			System.out.println(name+" "+validity);
//		}
//	}
	void data() {
		if(addressproof==name&&address=="pune") {
			super.display();
			System.out.println(name+" "+validity);
		}
	}

}
