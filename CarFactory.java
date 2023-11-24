package String;

public class CarFactory {
    public static void main(String[] args) {
    	Machine mech = new Machine();
    	mech.start();
    	mech.stop();
    	
       Car car = new Car();
       
       car.carName();
       car.showInfo();
       car.start();
       car.stop();
       
    }
}
