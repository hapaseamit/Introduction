package testPackage1.inheritance;

/* Inheritance: Acquiring all properties (variables) and behaviour (methods) from one class to another class is called Inheritance.
 * 
 * Types of Inheritance:
 * 1. Single      : One parent to one child
 * 2. Multi-level : One parent to one child, this child will be parent to another child
 * 3. Hierarchy   : One parent to multiple children
 * 4. Multiple    : Multiple parent to one child
 * 
 * - Multiple Inheritance is not possible in Java as Object class is root class in Java or Parent class of all classes in Java and all classes uses its methods automatically.
 * - So in multiple Inheritance, it is not possible to identify or implement method from only one parent as method names are same. Child class object could be confused as to which method it should follow.
 * 
 * 
 *  
 * 
 */


// Single Inheritance: One parent to one child

class A {                                  // Parent class
	
	int a;
	void display()
	{
		System.out.println(a);
	}
	
}


class B extends A {                                  // child class
	
	int b;
	void show()
	{
		System.out.println(b);
	}

	
}


// Multi-level Inheritance

class P{                               //Parent class
	
	int p;
	void print()
	{
		System.out.println(p);
	}
}


class Q extends P{                                 //child class of P
	
	int q;
	void create()
	{
		System.out.println(q);
	}
}



class R extends Q{                                // child class of Q, automatically it will inherit Class P's properties also
	
	int r;
	void convert()
	{
		System.out.println(r);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Single Inheritance
		B bobj= new B();
		
		bobj.a=100;           // variables from class A and B
		bobj.b=200;
		
		bobj.show();           // method of Class B
		bobj.display();        // method of Class A
		
		
	System.out.println("*******************************");
	
		//Multi-level Inheritance
		Q obj= new Q();
		obj.p=100;             //variables from Class P, Q, R
		obj.q=200;
		
		R obj1=new R();
		
		obj1.p=400;             //variables from Class P, Q, R
		obj1.q=500;
		obj1.r=300;
		
		obj.create();
		obj.print();
		
	System.out.println("*******************************");
		
		obj1.convert();
		obj1.create();        // child Class Object of R is able to use method of Class P and R
		obj1.print();
		

	}

}
