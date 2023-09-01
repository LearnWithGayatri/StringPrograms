
public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java", nstr="";
		char ch;
		System.out.println("Original word: ");
		System.out.println("Java");
		
		for (int i=0; i<str.length(); i++)
		{
			ch = str.charAt(i);
			nstr=ch+nstr;//adds each word in front of the existing string
		}
		System.out.println("Reversed word: "+nstr);
		}

}
