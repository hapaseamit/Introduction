package testPackage1.ploymorhism;

public class CallingMethodOverload {

	int x, y;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyOverload a= new PolyOverload();
		
		a.sum();
		a.sum(10.5,8.45);
		a.sum(10.5, 9);
		a.sum(80, 10.5);
		a.sum(40, 30);
		
		System.out.println("*********************");
		
		Student s= new Student(102, "Alice");         // Here I have created object of another class Student in the same package 
		                                              // and passed values as the user-defined constructor in Student class needs parameters. 
		
		s.display();                      // Then I have called public method in the class Student here providing above values in it.
		
		System.out.println("*********************");
		
		//printing values of variables and string 
		CallingMethodOverload m1= new CallingMethodOverload();
		m1.main(10, 200);
		m1.main("Alice", "Mother");

		
		System.out.println("*********************");
		
		//this keyword - represents class. Use this keyword only when class variables and local variables are of same name.
		
		m1.setData(30, 40);
				
		
		
	}

	
	
	public void main(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(a + " " +b);
	}
	
	
	public void main(String name, String role)
	{
		System.out.println(name + " " + role);
	}
	
	public void setData(int x, int y)
	{
		this.x= x;
		this.y=y;
		System.out.println(x + " "+ y);
				
	}
	
}
