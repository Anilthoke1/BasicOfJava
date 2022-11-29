package containment_hasA;

public class CollageMain {
	public static void main(String[] args) {
		Department d=new Department();
		d.setId(545);
		d.setName("CsE");
		d.setStaff(20);
		
		Library b=new Library();
		b.setBooks(1000);
		b.setIncharge("dr.nayak");
		
		Collage c=new Collage();
		c.setAddress("pune");
		c.setCode(43343);
		c.setName("COEP");
		c.setY(b);
		c.seth(d);
		System.out.println(c.toString());
		
	}

}
