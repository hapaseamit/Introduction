package testPackage1;

public class Student {
	
	int stu_id;
	String stu_name;
	int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu= new Student(101, "John");
		stu.display();

	}
	
	Student(int stu_id, String stu_name)           // this is a constructor
	{
		this.stu_id= stu_id;
		this.stu_name=stu_name;
	}
	
	public void display()
	{
		System.out.println(stu_id + " "+ stu_name);
		
	}

	
	
}
