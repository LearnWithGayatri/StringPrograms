
public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Using the StringBuffer Class
		StringBuffer sbf = new StringBuffer("MyJava");
		//System.out.println(sbf.reverse());

		// 2. Iterative method
		// Convert the given string to Char Array using charArray() method
		// And then we iterate that array in reverse order
		//String str = "MyJava";
		
		//String str ="Gayatri";
		//String str= "ayatriG";
		String str = "yatriGa";
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) 
		{
		//	System.out.print(strArray[i]);

		}
		System.out.println();
		//3. Recursive method to reverse string
		System.out.println("substring(1) returns " + str.substring(1));
		System.out.println("charAt(0) returns "+str.charAt(0));
		System.out.println( str.substring(1)+str.charAt(0));
		System.out.println();	
//		System.out.println(recursiveMethod(str));
	//	System.out.println(recursiveMethod(str));
	
		
	
	}
	//
	static String recursiveMethod(String str)
	{
		if((null==str)||(str.length()<=1))
		{
			return str;
		}
		return recursiveMethod(str.substring(1))+str.charAt(0);
	}
}
