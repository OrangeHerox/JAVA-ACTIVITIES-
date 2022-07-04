import java.util.Scanner;
public class GradeEquivalent  {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String equivalent = ""; 
		int enteredGrade = 0;
		
	    System.out.print("Enter Student's Name: ");
	    String sName = in.nextLine();
	    System.out.print("Enter Student's Year And Section: ");
		String sYearSec = in.nextLine();
		
		System.out.print("Enter Student's Grade:  ");
		enteredGrade = in.nextInt();
		
		if (enteredGrade <= 100 && enteredGrade >= 99)
		{
			equivalent = "1.00 A+ Excellent+";
		}
		else if (enteredGrade <= 98 && enteredGrade >= 96 )
		{
			equivalent = "1.25 A Excellent-";
		}
		else if (enteredGrade <= 95 && enteredGrade >= 93 )
		{
			equivalent = "1.50 A- Very Good+ ";
		}
		else if (enteredGrade <= 92 && enteredGrade >= 90 )
		{
			equivalent = "1.75 B+ Very Good -";
		}
		else if (enteredGrade <= 89 && enteredGrade >= 87 )
		{
			equivalent = "2.00 B Good+";
		}
		else if (enteredGrade <= 86 && enteredGrade >= 84 )
		{
			equivalent = "2.25 B- Good-";
		}
		else if (enteredGrade <= 83 && enteredGrade >= 81 )
		{
			equivalent = "2.50 C+ Fair+";
		}
		else if (enteredGrade <= 80 && enteredGrade >= 78 )
		{
			equivalent = "2.75 C Fair-";
		}
		else if (enteredGrade <= 77 && enteredGrade >= 75 )
		{
			equivalent = "3.00  C-  Passed";
		}
		else if (enteredGrade <= 74 && enteredGrade >= 72 )
		{
			equivalent = "4.00 D Conditional";
		}  else {
			equivalent= "5.00 E Failed";
		}
		System.out.println("==================\n\tStudent's Grade\n==================");
	    System.out.println("\t"+sName+"\n\t"+sYearSec+"\n\tGRADE : "+enteredGrade+"\n\n\tEQUIVALENT:\n\t"+equivalent+"\n==================");
		
	}
}