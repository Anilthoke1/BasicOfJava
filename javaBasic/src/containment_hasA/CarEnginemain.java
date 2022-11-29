package containment_hasA;

public class CarEnginemain {
	public static void main(String[] args) {
		Engine e1=new Engine();
		e1.setRpm("1000rpm");
		e1.setCylinder(4);
		e1.setTorge(89);
		e1.setCompany("Tata");
		
		Car c1=new Car();
		c1.setId(1010);
		c1.setName("Zest");
		c1.setColor("blue");
		c1.setPrice(850000);
		c1.setE(e1);
		
		System.out.println("information for car");
		System.out.println(c1.getName()+" "+c1.getPrice());
		System.out.println("engine");
		System.out.println(c1.getE());
		
		
		
	}

}
