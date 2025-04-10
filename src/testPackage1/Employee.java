package testPackage1;

public class Employee {
	
	
	int eid;
	String ename;
	String job;
	int sal;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1= new Employee();
		
		emp1.eid= 101;
		emp1.ename="John";
		emp1.job="Manager";
		emp1.sal=600000;
		
		emp1.display();
		
		Employee emp2= new Employee();
		emp2.eid= 102;
		emp2.ename="Alice";
		emp2.job="Tester";
		emp2.sal=800000;
		
		emp2.display();
		

	}
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}

}
