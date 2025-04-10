package testPackage1.ploymorhism;


/* Polymorphism means one thing can have many forms like water can be ice or vapour. A person can be mother, wife, daughter or employee.
 * Polymorphism is a theortical concept.
 * 
 * To achieve polymorphism, we need overloading. Overloading is technical concept.
 * Overloading can be done on methods and constructors.
 * Method overloading in Java allows multiple methods within the same class to share the same name, provided they have distinct parameter lists.
 * Overloading means having same name's of methods or constructors, but how we are passing parameters in each will differentiate them even if the names are same. 
 * The parameters we passed in method or constructor in main() method, will decide which method/constructor to select for execution. 
 * 
 * 4 rules for method Overloading:
 * 1. Method name can be same.
 * 2. Number of parameters should be different.
 * 3. Datatype of parameters should be different.
 * 4. Order of parameters should be different. 
 * 
 * The return type of the method does not play a role in method overloading, meaning methods with the same name and parameter list but different return types will result in a compilation error.
 * 
 * 
 * Constructors:
 * - Constructors are used to initialize the object of the class. It is also called as special method. 
 * - Constructor is called automatically when object of the class is created.
 * - It can be used to set initial values for object attributes.
 * - Constructor is block of code similar to method. It is called when an instance of the class is created.
 * - At the time of calling the constructor, memory for the object is allocated in the memory.
 * - It is not mandatory to create user-defined constructor for a class as java compiler creates a default constructor(with no arguments) if class doesn't have any.
 * - Constructors must have same name as Class name.
 * - Constructors does not have any return type as it does not return anything. It is just to initialize the object of that class.
 * - Constructors are called only once at the time of object creation. Methods can be called as many times as you want.
 * 
 * e.g. class Box{          // class Box
 *      
 *      Box{               // constructor box
 *      
 *      }
 * 
 * }
 * 
 * 
 * 4 rules for constructor Overloading:
 * 1. Constructor name should be same as Class name and all overloaded constructors will be of same name. 
 * 2. Number of parameters should be different.
 * 3. Datatype of parameters should be different.
 * 4. Order of parameters should be different.
 * 
 * 
 * Overloading of main() method:
 * - main() method can also be overloaded.
 * - We can pass parameters to overloaded main() method.
 * - The execution will always start from original main() method having keywords 'public static void main(String[] args)'. JVM will always have this main() method as entry point for execution.
 * 
 * 
 * 
 */


public class PolyOverload {
	
	
	int a=10, b=20;
	
	void sum()                                   //Method with no parameter , by default it will pass int a=10, b=20
	{
		System.out.println(a+b);
	}
	
	
	void sum(int x, int y)                  // method with 2 parameters
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y)            // method with different datatype than before - at least datatype of one variable should be different than original one
	{
		System.out.println(x+y);
		
	}
	
	void sum(double x, double y)        // parametrized method with different dataypes
	{
		System.out.println(x+y);
	}
	
	
	void sum(int y, double x)          // oder of parameter is different
	{
		
		System.out.println(x+y);
		
	}
	
	
	

}
