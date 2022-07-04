import java.util.Scanner; //for taking user input
public class Average {
	public static void main(String[] args) {
		//declarations
		Scanner in = new Scanner(System.in);
		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;		
		float average = 0;
		
		System.out.println("Average Of Three Numbers");
		System.out.print("Enter Any Positive Number : ");
		firstNum = in.nextInt(); //taking user input

		//condition for taking only positive number
		if (firstNum < 0)
		{
			System.out.println("Sorry, The Program Only Accepts Positive Number...");
		}
		else
		{
			//computation
			secondNum = firstNum * 3;
			thirdNum = (firstNum + secondNum) - 2;
			average = (firstNum + secondNum + thirdNum) / (float) 3;  // typecast to float or double to show the exact quotient
			 
			//output
			System.out.println("\nFirst Number : "+firstNum);
			System.out.println("Second Number : "+secondNum);
			System.out.println("Third Number : "+thirdNum);
			System.out.println("Average Of Three Numbers : "+average);
		}
		
	}
}