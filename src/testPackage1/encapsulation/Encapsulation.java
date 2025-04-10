package testPackage1.encapsulation;

public class Encapsulation {

	
/* Encapsulation: 
 * - A mechanism of wrapping variables and methods together as a single unit and accessing variables only through methods. 
 * - Providing security to variables.
 * - Class contains variables and methods.
 * - If we create an object of a class, variables of class are easily accessed through methods or actions can be performed on variables using methods.
 * - Encapsulation is a way to provide access control security to these variables through methods.
 * - This protects the data from outside access, preventing accidental modification. 
 * 
 * Requirements:
 * - All variables should be private.
 * - For every variable, there should be 2 methods(getter and setter).
 * - Variables can be operated only through methods.
 * - Such private variables cannot be accessed using objects, they can be accessed only using methods.
 * 
 * How to create Getter and setter methods automatically in Eclipse?
 * - Make private variables in Class -> select them -> Go to source -> 'Generate Getter and setter methods' 
 *    -> select variables for which you want to create getter and setter methods.
 *  
 * 
 */
	
	
	private int accno;
	private String name;
	private double amount;
	
	int a;

	
	public int getAccno() {                   // get the data of the variable
		return accno;
	}

	public void setAccno(int accno) {           // set the data to the variable
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}

