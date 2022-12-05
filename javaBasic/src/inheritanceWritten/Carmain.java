package inheritanceWritten;

class Vehical{
	
	
void dashboard() {
	System.out.println(" dashboard available in every class");
}

void Engine()
{
	System.out.println(" engine available in car");
}
	
}

class Car extends Vehical{
	String name,color;int price;
	void setName(String name) {
		this.name=name;
	}
	void setColor(String color) {
		this.color=color;
	}
	void setPrice(int price) {
		this.price=price;
	}
	void display() {
		super.dashboard();
		super.Engine();
		System.out.println( "car name is "+name+"\n price is "+price+"\n car color is"+color);
		
	}
	
}
public class Carmain {
	public static void main(String[] args) {
		Car c=new Car();
		c.setColor("red");
		c.setName("nexon");
		c.setPrice(900000);
		c.display();
		
	}

}
