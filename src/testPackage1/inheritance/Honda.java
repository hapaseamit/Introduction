package testPackage1.inheritance;


public class Honda extends Car {
	
	String brand;
	
	public Honda(int speed, int gear, int engine, char logo, String brand)
	{
		super(speed, gear, engine, logo);
		this.brand=brand;
	}
	
	
	public String toString()
	{
		return super.toString() + "\nBrand is "+ brand;
	}
}
