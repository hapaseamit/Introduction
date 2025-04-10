package testPackage1.inheritance;


public class Car extends Vehicle{
	
	

	public Car(int speed, int gear, int engine, char logo) {
		super(speed, gear, engine);
		this.logo=logo;
		// TODO Auto-generated constructor stub
	}

	char logo;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nLogo is "+ logo;
	}
	
	
	

}