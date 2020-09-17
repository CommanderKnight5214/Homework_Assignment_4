import java.util.Scanner;

public class driver
{
	public static void main(String[] args)
	{
		//Input with scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a binary number: ");
		String BinaryInput = input.nextLine();
		//Converts Input to string
		int HexNumber= Integer.parseInt(BinaryInput);
		//Calls the BinaryTodecimal class
		System.out.println(driver.BinaryTodecimal(HexNumber));
	}	
	public static String BinaryTodecimal(int HexNumber)
	{
		//Intial variables
		Integer answer = 0;
		Integer tempanswer = 0;
		//Coverts the Integer to a string
		String NumberGen = Integer.toString(HexNumber);
		//Goes through each number to find a 1
		char[] array = NumberGen.toCharArray();
		for (int i=0; i<NumberGen.toCharArray().length; i++)
		{	
			//Error in my code, it should find the bucket and covert it to decimal.
			
			if(NumberGen[i]= 1)
			{
				//Binary to decimal coversion
				tempanswer = (int)Math.pow(2,NumberGen.charAt(i));
				answer = answer + tempanswer;
			}
		}
		//Sets the string in a new variable and rests answer for the next coversion
		Integer BinaryAnswer = answer;
		answer = 0;
		//HexTable for coversion
		String HexTable = "0123456789ABCDEF";
		//Decimal to Hex coversion
		while(BinaryAnswer != 0)
		{
			int Hex = (BinaryAnswer % 16);
			//Error in map
			answer = map.charAt(HexTable) + answer;
			BinaryAnswer = BinaryAnswer / 16;
		}
		//Turns the Answer into a string and returns the answer
		String Answer = Integer.toString(answer);
		return (Answer);
	}
}
