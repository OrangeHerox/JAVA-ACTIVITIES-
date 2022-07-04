import java.util.Scanner;
public class Main {

	public static String div(int n, int m) {
		String result = "";
		int res = 0;
		for (int i = 1; i <= n;  i++) {
			res = res + m;
		}
		return result = "The multiplication of " + n + " and " + m + " is " + res;
	}

	public static int mult(int n, int m) {
		int result = 0;

		return result;
	}

	public static int remainder(int n, int m) {
		int result = 0;

		return result;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = 0,  n2 = 0;
		System.out.print("Enter 1st Number: ");
		n1 = scan.nextInt();
		System.out.print("Enter 1st Number: ");
		n2 = scan.nextInt();

		System.out.println(div(n1, n2));

	}
}