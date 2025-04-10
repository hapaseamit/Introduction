package testPackage1.callByValueRef;


public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test test=new Test();
		
		test.number=90;
		
		System.out.println("Before method: "+ test.number);
		
		test.m2(test);                       // value of a variable gets modified using object
		
		System.out.println("After method: " + test.number);

	}

}
