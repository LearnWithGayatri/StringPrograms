
public class RemoveDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd1234";
		String str2;
		String str3;
		str3 = str.replace("1234","");
		System.out.println(str3);
		//str2=str.replaceAll("[0-9]", str);
		//System.out.println(str2);
		
		String word = "abcd1234";
		//To remove alphabets
		String str4 = word.replaceAll("[a-z]", "");
		System.out.println(str4);
		
	}

}
