import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
	    
     Scanner scanner = new Scanner (System.in);
	System.out.println("Enter String To Reverse: ");
	String text = scanner.nextLine();
	char[] array = text.toCharArray();
	
	for (int i = array.length-1; i >= 0; i--)
	{
		System.out.print(array[i]);
	}
	
	}
}