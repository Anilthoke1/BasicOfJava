package containment_hasA;

public class Collage {
	private int code;
	private String name ,address;
	Department h;
	Library y;
	
	public void setY(Library y) {
		this.y=y;
	}
	public Library gety() {
		return y;
	}
	public void seth(Department h) {
		this.h=h;
	}
	public Department geth() {
		return h;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return code+" "+name+" "+address+h+"added"+y;
	}

}
