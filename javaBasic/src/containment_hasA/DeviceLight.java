package containment_hasA;

public class DeviceLight {
	public static void main(String[] args) {
		Light h=new Light();
		h.setName("Anil");
		h.setNumber(6988);
		Device j=new Device();
		j.setS(h);
		System.out.println(j.gets());
		
		//j.setS(h);
		//System.out.println(j.toString());
	}

}
