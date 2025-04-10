package testPackage1;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c=new Circle();
		
		area(5);                           // if you don't want to perform any further action on returned value, keep method as 'void'.
		                                   // To access static method, you call method directly without creating class object.  
		double circle= areaOfCircle(6);    // if you want to perform further actions on returned value, mention method return type.
		System.out.println(circle * 2);
		
		double area=c.circlearea(10);    //to access non-static method, you need object of the class.
		System.out.println(area);

	}
	
	
	//area of a circle with static method and void return type
	public static void area(int r)
	{
		
		double a= Math.PI *r*r;
		System.out.println(a);
	}
	
	
	//area of circle with static method and double return type
	public static double areaOfCircle(double r)
	{
		if (r < 0) {
            System.out.println("Radius cannot be negative.");
        }
		double a= Math.PI *r*r;
		return a;
	}
	
	//area of circle with non-static method and double return type
	public double circlearea(double r)
	{
		
		if (r<0)
		{
			System.out.println("Radius cannot be negative");
		}
		
		double area=Math.PI*r*r;
		return area;
	}


}
