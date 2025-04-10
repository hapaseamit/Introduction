package testPackage1.inheritance;



public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Car cr=new Car(100, 15, 300, 'A');
	    
        System.out.println(cr.toString());
        
        cr.startVehicle(10);           // method from super class vehicle
        
        System.out.println("*******************");
        
        Honda h=new Honda(150, 20, 200, 'H', "Honda");
        
        System.out.println(h.toString()); 
        
        h.startVehicle(15);             // method from super class Vehicle
        
        
	}

}
