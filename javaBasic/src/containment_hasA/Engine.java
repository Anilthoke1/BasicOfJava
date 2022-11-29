package containment_hasA;

public class Engine {
	private String rpm,company;
	private int torge,cylinder;
	public String getRpm() {
		return rpm;
	}
	public void setRpm(String rpm) {
		this.rpm = rpm;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getTorge() {
		return torge;
	}
	public void setTorge(int torge) {
		this.torge = torge;
	}
	public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	
	public String toString() {
	
		return company+" "+cylinder+" "+torge+" "+rpm;
	}

}
