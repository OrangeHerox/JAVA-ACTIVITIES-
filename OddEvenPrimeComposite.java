import java.util.Scanner;
public class OddEvenPrimeComposite {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0;
		System.out.println("ODD or EVEN and PRIME or COMPOSITE");
		System.out.print("Enter A Number : ");
		number = in.nextInt();
		String display = oddEven(number) + primeComposite(number);
		System.out.println(number + display);
		in.close();
	}
	public static String oddEven(int num) {
		String output = "";
		if (num % 2 == 0) {
			output = " is an EVEN NUMBER";
		} else {
			output = " is an ODD NUMBER";
		}
		return output;
	}

	public static String primeComposite(int num) {
		String output = "";
		int oneZero = num;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			//nonprime number
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (oneZero == 1 || oneZero == 0) {
			output = " but not a PRIME NOR COMPOSITE";
		} else if (isPrime == true) {
			output = " and a PRIME NUMBER.";
		} else {
			output = " and a COMPOSITE NUMBER.";
		}
		return output;
	}
}