package containment_hasA;

public class EngineCo {
	private String rpm,company;
	private int torge,cylinder;
	public EngineCo(String rpm, String company, int torge, int cylinder) {
		this.rpm = rpm;
		this.company = company;
		this.torge = torge;
		this.cylinder = cylinder;
	}
 public String toString() {
	 return rpm+torge+" "+"object";
 }
	
}
