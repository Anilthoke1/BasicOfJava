package inheritance;

public class DateTime {
	public static void main(String[] args) {
		Time t=new Time();
		t.setDd(11);
		t.setMm(05);
		t.setYy(2022);
		t.setHh(11);
		t.setMin(30);
		t.setSec(40);
		System.out.println(t.toString());
		
		
	}

}
