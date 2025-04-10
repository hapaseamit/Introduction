package testPackage1.callByValueRef;



public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1=new Test();
		int number=100;
		System.out.println("Before method: " + number);
		
		t1.m1(100);           // We are passing the value in method. The variable gets modified only in method and not outside the method.
		
		System.out.println("After method: "+ number);  //The value of variable remains same as original.
		
	}

}
