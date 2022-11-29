package javaBasic;

public class SeriesPattern {
	public static void main(String[] args) {
		int a=0,b=1,c;
		for(int i=0;i<10;i++) {
			c=b+i*i;
			b=c;
			System.out.println(c);
		}
			
	}

	
}
