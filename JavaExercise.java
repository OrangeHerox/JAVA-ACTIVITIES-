import java.util.Scanner;
public class JavaExercise {
	public static void main(String[] args) {
		//func find largest num
		int a = Math.max(8, 9);
		System.out.println(a);

		//concatenate string
		String str1 = "Hello", str2 = "Gago Kaba";
		System.out.println(str1.concat(str2));

		//upperCasing
		System.out.println(str1.toUpperCase());

		//finding square root
		System.out.println(Math.sqrt(100));

		//return random number
		System.out.println(Math.random());

		//return true or false
		int x = 10, y = 9;
		System.out.println(x > y);

		//counting elements in array
		String [] cars = {"BMW", "VOLVO", "LAMBO"};
		System.out.println(cars.length);

		//counting str length
		String str = "Hello";
		int n = str.length();
		System.out.println(n);

		//for each loop for arrays mostly
		for (String i : cars) {
			System.out.println(i);
		}

		int [] number = { 1, 2, 3, 4, 5};
		for (int i : number) {
			System.out.print(i + " ");
		}

		//try catch sample
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("FINISH");
		}
		
		}
	}