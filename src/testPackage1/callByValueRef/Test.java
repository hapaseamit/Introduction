package testPackage1.callByValueRef;

public class Test {
	
	int number;
	
	public void m1(int num)                  // call by value providing direct value in method
	{
		number=num+1;
		System.out.println("Value in method is: " + number);
	}

	
	public void m2(Test t)                  // call by reference using object as a parameter
	{
		t.number=t.number+10;
		System.out.println("Value in method: "+ t.number);
	}
}