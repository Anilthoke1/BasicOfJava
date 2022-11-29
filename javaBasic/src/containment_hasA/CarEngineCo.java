package containment_hasA;

public class CarEngineCo {
	public static void main(String[] args) {
		EngineCo s=new EngineCo("43","zest", 35, 5);
		CarCo s1=new CarCo(1, 543543, "Tata", "red",s);
		System.out.println(s1.toString());
		
		
	}

}
