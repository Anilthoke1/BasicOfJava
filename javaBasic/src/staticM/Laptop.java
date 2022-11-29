package staticM;

import java.util.Scanner;

public class Laptop {
	int modelNo;String webcam;
    static String display="YES",keyboard="YES";
    
    static void display2() {
    	System.out.println("Display is available: "+display +" "+keyboard+" "+"keyboard is available: ");
    }
    
    void display(int modelNo,String webcam) {
    	
    	System.out.println("model number is: "+modelNo+" "+"webcam support :"+webcam);
    }
    static {
    	System.out.println("1 st block");
    }
    static {
    	System.out.println("second block");
    }
    public static void main(String[] args) {
		
	
    
    Laptop s=new Laptop();
    System.out.println("ENTER MODEL NUMBER AND WEBCAM AVAIBILITY AS Y OR N");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    String b=sc.next();
    s.display(a, b);
    display2();
    
    } 
}
