package testPackage1.encapsulation;

public class EncapsulMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation en= new Encapsulation();
		
		en.setAccno(101020103);                // accessing methods and not variables directly
		en.setName("Alice");
		en.setAmount(60000.02);
		
		System.out.println(en.getAccno());
		System.out.println(en.getName());
		System.out.println(en.getAmount());
		

	}

}
