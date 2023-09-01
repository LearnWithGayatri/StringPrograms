
public class StringCount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "@TechStudy.org 1234567";
		int letter = 0;
		int space = 0;
		int num = 0;
		int otherChar=0;
		
		char[] chArr = str.toCharArray();
		for (int i=0; i<chArr.length; i++)
		{
			if(Character.isLetter (chArr[i]))
			{
				letter++;
			}
			else if(Character.isDigit(chArr[i])) 
			{
				num++;
			}
			else if(Character.isSpace(chArr[i]))
			{
				space++;
			}
			else
			{
				otherChar++;
			}
			}
		System.out.println("Count of letters is : "+letter);
		System.out.println("Count of digits is : "+num);
		System.out.println("Count of space is : "+space);
		System.out.println("Count of other char is : "+otherChar);
		}

}
