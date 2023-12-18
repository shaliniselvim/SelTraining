
public class CoreJavaBrushUp {

	public static void main(String[] args) {
		
		//Variables and Data types
		int num = 5;
		String website = "shalini.com";
		char letter = 'r';
		double dec = 5.99;
		boolean answer = true;
		System.out.println(num+" is assigned to num");
		
		//Arrays - variable storing multiple values
		int[] arr = new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
		System.out.println(arr[0]);
		
		//create array 2nd method
		int[] arr2 = {5,6,7,8};
		System.out.println(arr2[1]);
		
		//for loop
//		for(int i=0; i<arr.length; i++) {
//			System.err.println(arr[i]);
//		}
		
		String[] name = {"shalini","raja","tulasi"};
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		//enhanced for loop
		
		for(String s: name) {
			System.out.println("Enhanced for loop output: " + s);
		}

	}

}
