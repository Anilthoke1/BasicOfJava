package inheritance;


public class Student extends Person {
	
	 float m1,m2,m3,m4,m5,marks;String collage;
	 public String getCollage() {
			return collage;
		}

		public void setCollage(String collage) {
			this.collage = collage;
		}
	
	void percentage(float m1,float m2,float m3,float m4,float m5) {
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		 marks=m1+m2+m3+m4+m5;
		 float grade=(marks*100)/500;	 
		 System.out.println("your grade is "+grade);
		  if(grade>90) {
			  System.out.println("1st class");
		  }
		  else if(grade>60) {
			  System.out.println("second class");
		  }
		  else if(grade>35) {
			  System.out.println("3rd classs");
		  }
		  else if(grade<35) {
			  System.out.println("fail");
		  }
		
	}
	
	public String toString() {
		return  "collage name is "+ collage+" and  obtain marks: "+marks;
	}
	 
	 

}
