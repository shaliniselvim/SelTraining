
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		//String is an object representing sequence of characters
		//define String in 2 ways
		//declare String Lateral - if value is same, new object will not be created
		String s1="Rahul Shetty Academy";
		//String s2="Rahul Shetty Academy";
		
		//declare new memory allocate operator - if value is same, new object created
		
		String s3="welcome";
		String s4="welcome";
		
		String[] splittedString = s1.split("Shetty");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		
		System.out.println(splittedString[1].trim());
		
		//print letter by letter
		
		for(int i=0;i<s1.length();i++) {
			
			System.out.println(s1.charAt(i));
		}
		
		//print reverse order
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
		
		
		
		
	}

}
