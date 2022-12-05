package inheritanceWritten;

class Transport{
	String route,type;

	public void setRoute(String route) {
		this.route = route;
	}

	public void setType(String type) {
		this.type = type;
	}
}
class Train extends Transport{
	String name;int id,platform;
	
	
	void data(String name,int id,String route,int platform) {
		this.name=name;
		this.id=id;
		this.route=route;
		this.platform=platform;
		
	}
	void display() {
		System.out.println("transport type is"+type+"route type"+route);
		System.out.println("train name is"+name+"platform no is"+platform);
		System.out.println("paltfprm number is"+platform+"\n and id is"+id);
	}
	
}

public class TransportMain {
	public static void main(String[] args) {
		
	
 Train t=new Train();
 t.data("Marathwada",1332,"pune",4);
 t.setRoute("track");
 t.setType("Train");
 t.display();


}
}
