package testPackage1;

public class ObjectTypeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		createObjectArray();
		
		
	}
	
	public static void createObjectArray()
	{
		Object[] obj= new Object[5];
		
		obj[0]=100;
		obj[1]="welcome";
		obj[2]= 'a';
		obj[3]= true;
		obj[4]= 10.5;
		
    for (Object x: obj)			 
		{
			System.out.println(x);
		}
		
	}

}
