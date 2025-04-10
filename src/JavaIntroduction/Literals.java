/* Literals: 
 * A constant value which can be assigned to a variable is called a' Literal'.
 * e.g. int x= 10;   (int--> datatype/keyword, x--> variable name/identifier, 10--> variable value/constant/literal)
 * 
 * Integral Literals:
 * For integral datatypes (byte, short, int, long), we can specify Literal value in the following ways.
 * 
 * 1. Decimal Literals/forms: (base 10)
 * Allowed digits are 0 to 9. 
 * e.g. int x=10;
 * 
 * 2. Octal form: (base 8)
 * Allowed digits are 0 to 7.
 * Literal value should be prefixed with 0. 
 * e.g. int x = 010;
 * 
 * 3. Hexa-decimal form: (base 16)
 * Allowed digits are 0 to 9, a to f. For extra digits (a to f), we can use both lower or upper case characters. This is one of very few areas where Java is not case-sensitive.
 * The literal value should be prefixed with 0x or 0X.
 * e.g. int x = 0X10;
 * 
 * 4. Binary Literals:
 * Allowed digits are 0, 1.
 * Literal value should be prefixed with 0b or 0B.
 * e.g. int x= 0b1111;  ----> 15
 *  
 * Note: These are only possible ways to specify literal value for Integral datatypes.
 * 
 * By default, every integral literal is of int type but we can specify explicitly as long type with suffix l or L.
 * There is no way direct way to specify byte and short literals explicitly.
 * 
 * 
 * Floating-point Literals:
 * By default, every floating-point literal is of double type. 
 * Hence, we cannot assign directly to the float variable. But, we can specify floating-point literal as float type with suffix f or F.
 * e.g. float f= 123.456f;
 *      double d= 123.456;
 *      
 * We can specify explicitly floating-point literals as double type with suffix d or D. But this convention is not required.
 * e.g. double d= 123.456D;  --> valid but not required to add D
 * 
 * We can specify floating-point literals only in decimals, not in octal or hexa-decimal forms.
 * e.g. double d= 0786.0; --> valid as it is normal double type. Prefix 0 has no meaning here.
 *      double d= 0xade.0; --> invalid as there is no hexa-decimal form in floating-point literals.
 * 
 * We can assign integral literal directly to floating point variables and that integral literal can be specified either in decimal/octal/hexa-decimal forms.
 * double d= 0786; ---> invalid as it is considered as integral literal without decimal point and 0 at the start is octal --> which cannot have 8 number in it.
 * double d= 0XFace; ---> valid as it is considered as integral literal without decimal point and 0X prefix means hexa-decimal with valid value Face.
 * double d= 0786.0; --> valid as it is normal double type. Prefix 0 has no meaning here.
 * double d= 0XFace.0; --> invalid as hexa-deciaml does not exist in floating-point literals.
 * double d= 10; --> valid as it is normal integral as decimal point is not present.
 * double d= 0777; --> valid as without decimal point it is integral literal, with 0 prefix it octal and 7 number is within range of octal.
 * 
 * We cannot assign floating-point literals to integral type.
 * e.g. int x=10.0; --> invalid as datatype double is expected here.
 * 
 * We can specify floating-point literal even in exponential forms (e3 == *10^3).
 * e.g. double d=1.2e3;            --> 1.2 * 10^3 = 1.2 *1000= 1200
 *      System.out.println(d);     --> 1200
 *      
 * 
 * Usage of _ sybmol in Numeric Literals:
 * We can use _ symbol between digits of numeric literals.
 * e.g. double d=12_23_45_684.7_8_9;     --> 122345684.789
 * The main advantage of this approach is readability of code.              
 * At the time of compilation these _ symbols will be removed automatically. 
 * We can use _ symbol only between digits. If we are using anywhere else we will get compile time error.
 * 
 * 
 * Boolean Literals:
 * The only allowed values for boolean datatype are true or false.
 * boolean b= true;
 * boolean b= false;
 * 
 * 
 * char Literal:
 * We can specify char literal single character within single quotes.
 * e.g. char ch= 'a'; ---> valid
 *      char ch= a;  --> invalid as a is not in ' '.  
 *      char ch= "a";  ---> invalid as " " is a string.
 *      char ch = 'ab'; --> invalid as ' ' can have single character
 *      
 * We can specify char literal as integral literal which represents unicode value of the character and that integral literal can be specified either in decimal/octal/hexa-decimal.
 * But allowed range is 0 to 65535.
 * e.g. char ch= 0XFace;  ---> valid
 *      char ch= 0777;  -----> valid
 *      char ch=65535;  ---> valid
 *      char ch= 35536; ----> invalid
 *      
 * We can represent char literal in unicode representation which is nothing but '/uxxxx' (4-digit hexa-decimal number).
 * e.g. char ch='/uxxxx' --> value of a
 * 
 * Every escape character is a valid char literal.
 * e.g. char ch= '/n'; 
 * 
 * Escape character    Description
 * \n                   New line
 * \t                  horizontal tab
 * \r                  carriage return
 * \b                  back space
 * \f                  form feed
 * \'                  single quotes
 * \"                  double quotes
 * \\                  back slash
 * 
 * Which of the following are valid?
 * char ch=65536; -->  invalid
 * char ch=0xBeer; --> invalid
 * char ch= \uface; --> invalid
 * char ch='\ubeef'; --->valid
 * char ch='\m';  ---> invalid
 * char ch= '\iface'; --> invalid
 * 
 * String Literal:
 * Any sequence of characters within double quotes " " is treated as 'String Literal'.
 * e.g. String S="durga";
 * 
 * 
 * Datatype Conversion:
 * 8-byte long value we can assign to 4-byte float variable because both are following different memory representation internally.
 * e.g. float f=10l; --->10.0
 * 
 */

package JavaIntroduction;


public class Literals {
	
	public static void main(String[] args) {
	
	int x=10;
	int y= 010;
	int z= 0777;
	int a= 0XFace;
	int c= 0xbeef;
	
	double d= 1.2e3;
	
	char ch= 'e';
	System.out.println(ch);
	
	char cd= 97;
	System.out.println(cd);
	
	System.out.println("This is \\character.");
	
	
	double h= 41_23_45_658.7_8_9;
	System.out.println(h);
	
	
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(a);
	System.out.println(c);
	System.out.println(d);
	
	
	
	
	}
}
