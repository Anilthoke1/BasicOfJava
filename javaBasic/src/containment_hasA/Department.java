package containment_hasA;

public class Department {
	private int id,staff;private String name;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getStaff() {
		return staff;
	}


	public void setStaff(int staff) {
		this.staff = staff;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name+" "+id+" "+staff;
	}

}
