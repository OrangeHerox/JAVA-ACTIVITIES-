import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int numInput = in.nextInt();

		if (numInput % 2 == 0) {
			System.out.println(numInput + " is an EVEN NUMBER");
		} else {
			System.out.println(numInput + " is an ODD NUMBER");
		}

	}
}