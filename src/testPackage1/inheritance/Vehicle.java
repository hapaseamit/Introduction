package testPackage1.inheritance;

public class Vehicle {

	int speed;
	int gear;
	int engine;
	
	
	Vehicle(int speed, int gear, int engine)
	{
		this.speed=speed;
		this.gear=gear;
		this.engine=engine;
	}
	
	
	public void startVehicle(int increment)
	{
		speed= speed+ increment;
		System.out.println(speed);
	}
		
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return ("Speed of vehicle "+ speed + "\ngear is "+ gear + "\nengine power is " + engine);
    }
        
	

}
