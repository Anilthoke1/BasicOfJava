package inheritanceWritten;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
	
	
	Idproof i=new Idproof();
	i.setName("anil");
	i.setAddress("pune");
	i.setAddressproof("adhar");
	i.setContact(1233456);
	i.setId(111);
//	i.setName("adhar");
//	i.setNumber(99883322);
//	i.setValidity(2023);
	i.set("adhar", 2, 2023);
	i.data();

}
}