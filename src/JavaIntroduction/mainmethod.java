/* main() method: 
 * Whether class contains main() method or not and whether main() method is declared according to requirement or not, these things won't be checked by compiler. 
 * Yet, runtime JVM is responsible to check these things. If JVM unable to find main() method, then we will get runtime exception saying NotSuchmethodError: main 
 * e.g. class Test {
 *         }           --> no main method in class.
 *         
 * At runtime, JVM always searches for the main method with the following prototypes.
 * public static void main(String[] args)
 * 
 * public: To call by JVM from anywhere
 * static: without existing objects also JVM has to call this method
 * void: return type. main method won't return anything to JVM.
 * main: This is the name configured inside JVM so it always searches for main() method.
 * String[] args: command line arguments
 * 
 * The above syntax is very strict and if we perform any change, then we will get runtime exception saying noSuchmethodError: main.
 * 
 * Even though above syntax is very strict, the following changes are acceptable.
 * 1. Instead of public static, we can take static public i.e. the order of modifiers is not important.
 * 2. We can declare String[] in any acceptable form.
 * e.g. main(String[] args) or main(String []args) or main(String args[])
 * 3. Instead of args, we can take any valid Java Identifier.
 * e.h. main(String[] durga)
 * 4. We can replace String[] with vararg parameter.
 * e.g. main(String... args)
 * 5. We can declare main method with the following madifiers. 
 * final 
 * synchrinized
 * strictfp
 * e.g. static final synchronized strictfp public void main(String... durga)
 * 
 * Which of the following main() method declarations are valid?
 * public static void main(String args)                             --> invalid 
 * public static void Main(String[] args)                           --> invalid
 * public void main(String[] args)                                  --> invalid
 * public static int main(String[] args)                              --> invalid
 * final synchronized strictfp public void main(String[] args)        --> invalid
 * final synchronized strictfp public static void main(String[] args) --> valid
 * public static void main(String... args)                            --> valid
 *
 * We will get runtime for invalid methods.
 * 
 * Case 1: Overloading of the main() method is possible but JVM will always call String[] arguments main() method only. The other overloaded method, we have to call explicitly like a normal method call.
 * e.g. class Test{
 * public static void main(String[] args){
 *   System.out.println("String[]");
 * }
 * 
 * public static void main(int[] args){
 *   System.out.println("int[]");
 * }
 * }                                          --> Output of program: String[]
 * 
 * Case 2: Inheritance concept is applicable for main() method. Hence, while executing child class, if child class does not contain main() method, then parent class main() method will be executed.
 * e.g. class parent {
 *    public static void main(String[] args){
 *        System.out.println("Parent main method");
 * 				}
 * 			}
 * class child {
 *		 }
 * If we run class Parent-> output: Parent main method
 * If we run class child -> output: Parent main method
 * 
 * Case 3: It seems overriding concept is applicable for main() method but it is not overriding, it is method hiding.
 * e.g. class parent {
 *    public static void main(String[] args){
 *        System.out.println("Parent main method");
 * 				}
 * 			}
 * class child {
 * public static void main(String[] args){
 *        System.out.println("Child main method");         --> It is a method of method hiding not overriding.
 * 				}
 *		 }
 * If we run class Parent-> output: Parent main method
 * If we run class child -> output: Child main method
 * 
 * Note: For main() method, Overloading and Inheritance concepts are applicable but overriding concept is not applicable. Instead of overriding, method hiding is applicable.
 * 
 * main() method is mandatory to start program execution. Hence, even though class contains static block, it won't be executed if the class doesn't contain main() method.
 * 
 * 
 * 
 * Command Line Arguments:
 * The arguments which are passing from command prompt are called command line arguments.
 * With this command line arguments, JVM will create an array and by passing that array as argument, JVM will call main() method.
 * e.g. Java Test A B C
 *      A=> args[0], B=>args[1], C=> args[2], args of length=> 3
 *      public static void main(String[] args)    --> This String Array is created by JVM.
 * The main objective of command line arguments is, we can customize behaviour of the main() method.
 * String[] args is used as String is most commonly used datatype in Java program. The conversion from String to other types can be done easily. 
 * So, SUN people decided to keep String[] type argument in main() method.
 * 
 * Case 1: If we replace <= by < below, then we won't get any runtime exception.
 * e.g. class Test{
 * public static void main(String[] args){
 * for (i=0;i<=args.length;i++)                  // Test Java A B C - command line arguments
 * {
 *   System.outprintln(args[i]);                // runtime exception: Array index out of bound as arga.length= 3 and index max length is 0 to 2 here.
 * }
 * }
 * }
 * 
 * Case 2: The assignment changes the args reference array.
 * e.g. class Test{
 * public static void main(String[] args){
 *   String[] argh= {"X", "Y", "Z"};
 *   args=argh;                        --> args is pointing to argh array now.
 * 		for (String s: args)                  
 * 			{
 *   		System.out.println(s);                
 * 			}
 * }
 * }
 * Output:
 * For Java Test A B C ==> X Y Z
 * For Java Test A B ==> X Y Z
 * For Java Test ==> X Y Z
 * 
 * Case 3: Within main() method command line arguments are available in String form.
 * e.g.  class Test{
 *          public static void main(String[] args){
 *   		      System.outprintln(args[0]+args[1]);             // if we give input 10 & 20, then output would be 1020 not 30 as args is String.         
 * 			  }
 *       } 
 * 
 * Case 4: Usually space itself is the separator between command line arguments. If our command line arguments itself contains space, then we have to enclose that command line argument within " ".
 * e.g. class Test{
 * public static void main(String[] args){
 *   
 *   		System.outprintln(args[0]);                // If input is "Note   book" , then output is Note Book.
 * }
 * }
 * 
 * 
 * Java coding Standards:
 * Whenever we are writing Java code, it is highly recommended to follow coding standards.
 * Whenever we are writing any component, its name should reflect the purpose of the component (functionality).
 * The main advantage of this approach is improved readability and maintainability of the code.
 * e.g. package com.durgasoft.scjp;
 *      public class calculator{
 *        public static int add(int number1, int number2)
 *        {
 *          return number1 + number2;
 *        }
 *       
 *       }
 * 
 * Coding Standards for Classes:
 * Usually class names are nouns. It should start with Upper case character and if it contains multiple words, every inner world should start with upper case character.
 * e.g. String
 *      StringBuffer
 *      
 * 
 * Coding Standards for Interfaces:
 * Usually Interface names are adjectives. It should start with upper case character and if it contains multiple words, every inner world should start with upper case character.
 * e.g. Runnable
 *      Serializable
 *      Comparable
 *      
 * Coding Standards for Methods:
 * Usually method names are either verbs or verb-noun combination. It should start with lower case character and it it contains multiple words, every inner word should start with upper case character (camel case convention).
 * e.g. print(), sleep(), run(), eat(), start()
 *      getName(), setSalary()
 *      
 * Coding Standards for Variables:
 * Usually variable names are nouns. It should start with lower case character and if it contains multiple words, every inner word should start with upper case character (camel name convention).
 * e.g. name, age, salary, mobileNumber
 * 
 * Coding Standards for Constants:
 * Usually constant names are nouns. It should contain only upper case characters and if it contains multiple words, these words are separated with _ symbol.
 * e.g. MAX_VALUE, MAX_PRIORITY, MIN_PRIORITY, NORM_PRIORITY, PI
 * Note: Usually we can declare constants with 'public static final' modifiers.
 * 
 * 
 * JavaBean Coding Standards:
 * A Javabean is simple Java class with private properties and public getter and setter methods.
 * e.g. public class StudentBean {           --> class name ends with 'Bean' is not an official convention from SUN people. 
 *   private String name;                    --> private variable
 *   public void setName(String name){      --> public setter method
 *   this.name=name;
 *   }
 *   public String getName()              --> public getter method
 *   {
 *   return name;
 *   }
 * }
 * 
 * Syntax for setter method:
 * 1. It should be public method.
 * 2. The return type should be void.
 * 3. Method name should be prefixed with set.
 * 4. It should take some argument i.e. it should not be no argument method.
 * e.g. public void setName(String name){
 * }
 * 
 * Syntax for getter method:
 * 1. It should be public method.
 * 2. The return type should not be void.
 * 3. Method name should prefixed with get.
 * 4. It should not take any argument.
 * e.g. public String getName() {
 * }
 * 
 * Note: For boolean properties getter method name can be prefixed with either 'get' or 'is' but recommended to use 'is'.
 * e.g. private boolean empty;
 *      public boolean getEmpty()         --> also valid
 *      {
 *         return empty;
 *      }
 *  OR  public boolean isEmpty()           --> recommended
 *      {
 *        return empty;
 *      }
 *      
 * 
 * Coding Standards for Listeners:
 * Case 1: To register a Listener:
 * Method name should be prefixed with 'add'.
 * e.g. public void addMyActionListener(MyActionListener l)
 * 
 * Case 2: To unregister a Listener:
 * Method name should be prefixed with 'remove'.
 * e.g. public void removeMyActionListener(MyActionListener l)
 * 
 * 
 */






package JavaIntroduction;

public class mainmethod {
	
	static {
		
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Hello World!");
         }

}

class Test9{
	
	static {
		System.out.println("Static main block");             // no main() method. So this class will not be executed.
	}
	
}

