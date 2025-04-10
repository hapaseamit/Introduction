package Selenium;

public class MethodDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method creation and calling them in class.

		MethodDemo1   d      = new       MethodDemo1();     //To call the method, object of that particular class is created in which method is created.
	//	Classname objectname = identifier  Classname();     This is how object is created for any class.
		d.getData();                                        //Method of the class is called using object.
		                                                 //If method is not returning anything, you can call method using object to execute code in method. Only 
		                                                  // method output will be printed here.
		System.out.println("******");
		
		d.getdata2();                          //This will only call code in method without any return type. Only method output will be printed here.
		String s=d.getdata2();                 //To store the return type from method, we need to create object of that return type and then call method. 
		System.out.println(s);                //The method output and return type both will be printed here.
		
		System.out.println("******");
		
		MethodDemo2 d1=new MethodDemo2();   //MethodDemo2 is different class created outside this class. Creating object of that class here, we can call methods of 
		d1.getData3();                      // that class here in this class MethodDemo1.
		
		System.out.println("******");
		
		getData4();                   // As getData4() method is static, no object creation needed to call the method. Directly call the method whenever needed.
		
		System.out.println("******");
		
		MethodDemo2 d3= new MethodDemo2(); //To call static method of another class, create object of that class here in this class.
		d3.getData5();              //This is static method of another class. 
	}

	//Method--> Set of lines of code which can be used repetitively in execution. It is created in outside main.
	
	public void getData()               //public means this method can be used by any class using object of that particular class.
	{                                   // void is return type here. As method is not returning anything, void is used.
		System.out.println("Hello World.");  //Set of lines of code which can be used again and again in execution.
	}
	
	public String getdata2()          //String return type is used as code says method is returning String.
	{
		System.out.println("Hello World.");
		return "It's a beautiful day.";     //Method is returning String here.
	}
	
	
	public static void getData4()   //static keyword here means method is aligned to class directly. To call this method, we do not need to create object of the class.
	{
		System.out.println("It's a Winter Wonderland.");
	}
}
