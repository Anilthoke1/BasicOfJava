package inheritance;

public class Time extends Date{

	int hh,min,sec;

	public int getHh() {
		return hh;
	}

	public void setHh(int hh) {
		this.hh = hh;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	
	public String toString() {
		return hh+" "+min+" "+sec+""+mm+" "+yy+" "+dd;
	}
	
}
