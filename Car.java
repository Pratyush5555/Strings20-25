package String;

public class Car extends Machine{
	
	
    @Override
	public void start() {
    	System.out.println("Car start");
	}

	public void carName() {
    	System.out.println("Car name is TATA");
    }
	public void showInfo() {
		System.out.println("Car name:"+ name);
	}
}
