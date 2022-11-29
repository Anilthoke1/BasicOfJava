package demowork;

public class MinimumNum {
	
public static void main(String[] args) {
	

	int num=9837, r=0 ;
	
	int small=num%10;
	while(num>0) {
		 r=num%10;
		if(r<small) 
			small=r;
			
	
		num=num/10;
		
	}
		

		
}
}
