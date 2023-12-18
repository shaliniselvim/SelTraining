
public class MethodsDemo {

	public static void main(String[] args) {
		//create object of class to use methods
		MethodsDemo d1 = new MethodsDemo();
		d1.getName();
		
		String email = d1.getEmail();
		System.out.println(email);
		
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getAddress();
		
		//no object for Static Methods
		getKidName();
		
	}
	
	//public - getName method can be used by any class, void - method returns void
	//methods need to be outside void main, not executed by java, java throw error if methods are inside void main
	//getName is in object level
	public void getName() {
		System.out.println("****  method in main class returning void  ******");
	}
	
	public String getEmail() {
		System.out.println("****  method returning String  ******");
		return "shalini.com";
	}
	//how to use method without create an object - use static keyword
	//static means method in class level
	
	public static void getKidName() {
		System.out.println("***********  static method KidName  ********");
	}
	
	
	
	

}
