package containment_hasA;

public class CarCo {
	private int  id ,price;
	private String name,color;
	EngineCo e;
	public CarCo(int id, int price, String name, String color,EngineCo e) {
		
		this.id = id;
		this.price = price;
		this.name = name;
		this.color = color;
		this.e = e;
	}
	public String toString() {
		return id+price+name+color+e;
	}

	
	
	
}
