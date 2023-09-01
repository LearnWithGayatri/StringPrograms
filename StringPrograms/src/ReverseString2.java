
public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		char[] strArr = str.toCharArray();
		
		for(int i=str.length()-1; i>=0; i-- )
		{
			System.out.print(strArr[i]);
		}
				
		System.out.print("Original string : "+str);
	}

}
