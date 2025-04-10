/* Datatypes  : 
 * In Java, every variable and every expression have some type. 
 * Each and every datatype is clearly defined.
 * Every assignment should be checked by compiler for type compatibility.
 * Because of above reasons we can conclude Java language is strongly typed programming language.
 * 
 * Java is not considered as a pure object-oriented programming language because several oop features are not used by Java like operator overloading, multiple inheritance etc.
 * Moreover, we are depending on primitive datatypes which are non-objects.
 * 
 *                                                                    Datatypes(8)
 *                             Numeric Datatypes(6)											  Non-Numeric Datatypes (2)                                                        
 * 
 *        Integer datatypes (4)              Floating-point datatypes (2)                     char		     boolean 
 *      byte, short, int, long                     float, double      
 * 
 * Except char and boolean, remaining datatypes are considered as signed datatypes because we can represent both + and - numbers.
 * 
 * 1. byte :                                      (Most significant bit)
 * size: 1 byte= 8 bits                                   | MSB  | 1  | 1  | 1  | 1  | 1  | 1  | 1 |
 * Max. value= +127, min. value= -128                       +/-   2^6  2^5  2^4  2^3  2^2  2^1  2^0
 * Range= -2^7 to 2^7-1  i.e. -128 to +127                 sign   64   32   16    8    4    2    1        64+32+16+8+4+2+1= 127
 * The most significant bit acts as sign bit. 0 means +ve number, 1 means -ve number.
 * +ve numbers will be represented directly in memory whereas -ve numbers will be represented in 2s complement form. 
 * 'byte' is the best choice if we want to handle data in terms of streams either from the file or from the network (file supported from or network supported from is byte).
 * 
 * 2. short:
 * size: 2 bytes= 16 bits
 * Range= -2^15 to 2^15-1   i.e. -32768 to +32767
 * This is most rarely used datatype in Java.
 * 'short' datatype is best suitable for 16-bit processors like 8085 but these processors are completely outdated and hence, corresponding short datatype is also outdated datatype.
 * 
 * 3. int:
 * size:4 bytes (32-bits)
 * Range= -2^31 to 2^31-1  i.e. -2147483648 to +2147483647
 * The most commonly used datatype on Java is 'int'. 
 * 
 * 4. long:
 * size: 8 bytes (64 bits)
 * Range= -2^63 to 2^63-1 
 * Sometimes int may not enough to hold big values, then we should go for 'long' type.
 * e.g. The number of characters present in a big file may exceed int range. Hence return type of length method is long.
 * 
 * Note: All the above datatypes (byte, short, int, long) are meant for representing integral values. If we want to represent floating point values, then we should go for floating-point datatypes.
 * 
 *                          Floating-point datatype
 *          5. float                                6. double
 * 5 to 6 decimal points						14 to 15 decimal points
 * single precision							    double precision
 * 4-byte                                       8-byte
 * Range= -3.4e38 to 3.4e38                     Range= -1.7e308 to 1.7e308
 *
 * 7. boolean:
 * values: true or false
 *
 * 8. char:
 * size: 2-bytes
 * Range= 0  to 65535
 * Old languages (c, c++) are ascii code based and the number of different allowed ascii code characters are <=256. 
 * To represent these 256 characters 8-bits are enough. Hence, the size of char in old languages is 1-byte.
 * But Java is unicode based and the number of different unicode characters are >256 and <=65536.
 * To represent these many characters 8-bits are not enough and we should go for 16-bits. Hence, the size of char in Java is 2-bytes.
 * 
 * Summary of Java Primitive Datatypes:
 *    datatype      size           Range                                                   wrapper class                  default value
 *     byte         1-byte       -2^7 to 2^7-1     i.e. -128 to 127                        Byte                            0
 *     short        2-byte       -2^15 to 2^15-1   i.e. -32768 to 32767                    Short                           0
 *     int          4-byte       -2^31 to 2^31-1   i.e. -2147483648 to 2147483647          Integer                         0 
 *     long         8-byte       -2^63 to 2^63-1                                           Long                            0
 *     float        16-byte      -3.4e38 to 3.4e38                                         Float                           0.0
 *     double       31-byte      -1.7e308 to 1.7e308                                       Double                          0.0
 *     boolean      N/A          true, false                                               Boolean                         false
 *     char         2-byte       0 to 65535                                                Character                       0 (0 represents space character)
 *     
 *     
 * Note: 'null' is a default value for object reference and we cannot apply for primitives.   
 */   



package JavaIntroduction;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b= 127;
		System.out.println(b);
		
		short s=32767;
		System.out.println(s);
		
		int x=2147483647;
		System.out.println(x);
		
		long l= 798798798l;
		System.out.println(l);		
		
		float fl = 54.7894f;
		System.out.println(fl);
		
		double d= 4879.4578765d;
		System.out.println(d);
		
		boolean a= true;
		System.out.println(a);
		
		
		int ab= 'a';
		System.out.println(ab);
		
		int e=10;
		double de=e;               // widening casting from lower to higher i.e. int to double
		System.out.println(de);
		
		double j=10.05; 
		int q= (int)j;             // narrowing casting from higher to lower i.e. double to int
		System.out.println(q);
		
	}

}
