import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		//conditional statement
		
		int[] arr2= {1,2,4,5,6,7,8,9,10,122};
		
		//check if array has multiple of 2, use break;
		
		for(int i=0; i<arr2.length; i++) {
//			System.out.println(arr2[i]);
			if(arr2[i] % 2 == 0) {
				System.out.println("inside if ");
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println("outside if");
			}
		}
		
		//ArrayList is used for dynamically growing data from website
		//ArrayLis is the Java Class. Crate object of Class, access object.method
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("selenium");
		System.out.println(a.get(2));
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		//enhanced for loop for ArrayList
		
		for(String val: a) {
			System.out.println("Enhanced for loop " + val);
		}
		
		//how to check item is present in ArrayList
		System.out.println(a.contains("selenium"));
		
		//how to convert array to ArrayList
		String[] name = {"shalini","raja","tulasi"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("tulasi"));
		System.out.println("testing git commands");
	}

}
