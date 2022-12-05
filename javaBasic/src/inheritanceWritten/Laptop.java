package inheritanceWritten;

public class Laptop {
int noOfUsbPort,processorSpeed;

public int getNoOfUsbPort() {
	return noOfUsbPort;
}


public void setNoOfUsbPort(int noOfUsbPort) {
	this.noOfUsbPort = noOfUsbPort;
}

public int getProcessorSpeed() {
	return processorSpeed;
}

public void setProcessorSpeed(int processorSpeed) {
	this.processorSpeed = processorSpeed;
}


public static void main(String[] args) {
	Laptop l=new Laptop();
	l.setProcessorSpeed(12);
	l.setNoOfUsbPort(4);
	System.out.println("no of usb port is "+l.getNoOfUsbPort());
    System.out.println("processor speed of laptop is "+l.getProcessorSpeed());
}


}
