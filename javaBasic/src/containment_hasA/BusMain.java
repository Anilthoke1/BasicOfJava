package containment_hasA;

public class BusMain {
	public static void main(String[] args) {
		Bus s=new Bus(1, 505040, "red", 12, 828777327, "vivek");
		System.out.println(s);
		BusDriver b=new BusDriver(1, 2, "vinod");
		System.out.println(b.toString());
		
	}

}
