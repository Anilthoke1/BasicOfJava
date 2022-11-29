package javaBasic;

public class Prime_boolean {
	public static void main(String[] args) {
		int min=24,num,i=0;
		boolean flag=false;
		int mid=min/2;
		while(i<=mid) {
			if(min%2==0) {
				System.out.println("not prime");
				flag=false;
				break;
			}
			i++;
			
		}
		if(i>min) {
			System.out.println("Prime");
		}else 
			System.out.println("not prime");
		if(flag==false) {
			
		}
		
	}

}
