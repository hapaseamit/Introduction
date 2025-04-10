

/* A program can contain many classes but atmost only one public class. It can have no public class as well.
 * If no public class is present, then you can give any name to .java file. 
 * If public class is present, then that class name should be given to .java file name.
 
 * main menthod in any class does not define .java file name. BE it in public class or non-public class.
 * When compiled, class file names are created for each class in a program e.g. A.class, B.class, C.class, D.class.
 * IF .java file name is other than class names in a program, then .class file name is not created for that program file name.
 * If you call Java A.class file, then only main method in that class is executed and not from any other class. 
 * If any class does not have main method i.e. D.class and it is called, then error message is shown "main method not found. Please define main method." 
 * If .java file name is called as .class file name in command prompt, then error is shown. 
 */


/* Identifiers in Java: Name in java program is called Identifier which can be used for identification purpose. It can be class name, method name, variable name or label name.
 * class name i.e. JavaFileStructure or A
 * main - method name
 * String- as String is a pre-defined class in Java
 * args- Arrray
 * x - variable name
 * Above all are identifiers in Java. So total 5 identifiers in Class JavaFileStructure.
  
 * Rules for defining Java Identifiers:
 * 1. Allowed characters: Alphabets: a to z, A to Z, 
                          Numbers: 0 to 9
                          Underscore:  _ 
                          dollar sign: $
                          
 * 2. Identifiers cannot start with digit. 
   e.g. total123 --> valid
        123total --> invalid
       
 * 3. Java Identifiers are case-sensitive. Ofcourse Java language itself is treated as case-sensitive programming language.
   e.g.  class test {
            int number=10;
            int Number=20;
            int NUMBER=30;
        }                    --- All variables are considered as different here as cases of their letters is different.
  
 * 4. There is no length limit for java identifiers. But, it is not recommended to take too lengthy identifiers.
  
 * 5. We cannot use Reserved words/keywords in Java as Identifiers. 
   e.g. int x=10;   --> valid
        int if=10;  --> invalid as 'if' is a reserved word in java.
       
 * 6. All pre-defined Java class name and interface names we can use as Identifiers.
   e.g. public static void main{String[] args){
   int String = 10;
   System.out.println(String);
   }                                  ---> Even though it is not valid, it is not a good programming practice because it reduces readability and creates confusion. 
   
   
 * Which of the following are valid java Identifiers?
   total_number --> valid
   total#       --> invalid
   123total     --> invalid
   total123     --> valid
   ca$h         --> valid
   _$_$_$_$     --> valid
   all@hands    --> invalid
   Java2share   --> valid
   Integer      --> valid
   Int          --> valid
   int          --> invalid
  
 */


/* Reserved Words: In Java some words are reserved words to represent some meaning or functionality. Such type of words are called 'Reserved Words'. 
 * There are 53 reserved words in Java. 
 *                                                              Reserved words (53)
 * 
 *                                 Keywords (50)                                                Reserved Literals (3)
 *              Used keywords (48)               Unused keywords(2)                             --> true, false (for boolean datatype), null (for object reference)
 *             -->if, else, switch etc.          --> goto , const
 * 
 * Used Keywords (48):
 * Keywords for Datatypes (8)          : byte, short, int, long, float, double, char, boolean
 * Keywords for flow control (11)      : if, else, switch, case, default, while, do, for, break, continue, return 
 * Keywords for modifiers (11)         : public, private, protected, static, final, abstract, synchronized, native, strictfp, transient, volatile
 * Keywords for exception handling (6) : try, catch, finally, throw, throws, assert 
 * Class-related Keywords(6)           : class, interface, extends, implements, package, import
 * Object related keywords (4)         : new, instanceof, super, this 
 * Return-type Keyword (1)             : void
 * 
 * In Java, return type is mandatory. If a method won't return anything, we have to declare that method with 'void' return type. But in C language, return type is optional and default return type is int.
 * 
 * Unused Keywords: 'goto': Usage of 'goto' created several problems in old languages. Hence, SUN people banned this keyword in Java.
 *                  'const': Use 'final' instead of 'const'.
 *                  Note: 'goto' and 'const' are unused keywords and if we try to use, we will get compile time error.
 *                  
 * 'enum' keyword: We can use 'enum' to define if group of named constants. 
 * e.g. enum month {
 *            Jan, feb....dec  } 


* Conclusions: 
* 1. All 53 reserved words in Java contain only lower case alphabets.
* 2. In Java, we have only 'new' keyword and there is no 'delete' keyword because destruction of useless objects is the responsibility of Garbage collector in Java.
* 
* 
* 
* 
*/

package JavaIntroduction;

class JavaFileStructure {
	
	public static void main(String[] args) {
		int x=10;
		System.out.println("Java class main method " +x);
	}                        
}


class A {
	public static void main(String[] args) {
		System.out.println("A class main method");
	}
}

class B {
	public static void main(String[] args) {
		System.out.println("B class main method");
	}
}
class C {
	public static void main(String[] args) {
		System.out.println("C class main method");
	}
}
class D {
	
}

