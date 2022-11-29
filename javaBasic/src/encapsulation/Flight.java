package encapsulation;

import java.util.Scanner;

public class Flight {
	private int id,fare ;private String company,source ,destination,clas;
	
	void setId(int id) {
		this.id=id;
	}
	int getId() {
		return id;
	}
	
	
    void setFare(int fare) {
    	this.fare=fare;
    }
    int getFare() {
    	return fare ;
    }
    void setCompany(String company) {
    	this.company=company;
    }
    String getCompany() {
    	return company;
    }
    void setSource(String source) {
    	this.source=source;
    }
    String getSource() {
    	return source;
    }
    void setDestination(String destination) {
    	this.destination=destination;
    }
    String getDestination() {
    	return destination;
    }
    void setClas(String clas) {
    	this.clas=clas;
    }

   
    
    public static void main(String[] args) {
    	Flight s=new Flight();
		Scanner sc=new Scanner(System.in);
		s.setId(1);
		s.getId();
		s.setCompany("indigo");
		s.getCompany();
		s.setSource("pune");
		s.getSource();
		s.setDestination("mumbai");
		s.getDestination();
		String k=sc.next();
		s.setClas(k);
		s.getClass();
		if(k=="genral") {
			
		}
		 
		
		
		
		
		
		
		
		
	}

}
