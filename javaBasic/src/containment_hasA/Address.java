package containment_hasA;

public class Address {
	int pincode;String area,city,state;
	Address(int pincode,String area,String city,String state){
		this.pincode=pincode;
		this.area=area;
		this.city=city;
		this.state=state;
		
	}
	public String toString() {
		return pincode+ area+ city+state;
	}

}
