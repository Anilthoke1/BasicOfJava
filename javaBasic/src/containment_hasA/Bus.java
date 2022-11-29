package containment_hasA;

public class Bus {
	int id,price;String color;
 BusDriver b;

	public Bus(int id, int price, String color,int did,int contact,String dname) {
		this.id = id;
		this.price = price;
		this.color = color;
		
		b=new BusDriver( did,contact,dname);
		
		
	}
	public String toString() {
		return id+" added"+price+color+b;
	}
	

}
