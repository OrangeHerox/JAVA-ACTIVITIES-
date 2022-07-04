import java.util.Scanner;
import java.util.Random;

public class Guessing {

	static Scanner in = new Scanner(System.in);
	
	static void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	
	static int diff(int n) {
		switch (n) {
		case 1 :
			n = 20;
			break;
		case 2 :
			n = 100;
			break;
		case 3 :
			n = 1000;
			break;
		default :
			System.out.println("Invalid Option... DIFFICULTY Set to Default\n");
			n = 20;
			break;
		}
		return n;
	}

	static void game() {
		clear();
		Random rndm = new Random();
		int counter = 1;
		int max = 0;
		System.out.println("::::::: GUESSING GAME ::::::: ");
		System.out.println("::::::: CHOOSE DIFFICULTY ::::::: ");
		System.out.println("[ 1 ] Easy\n[ 2 ] Moderate\n[ 3 ] Hard");
		System.out.print("::: > : ");
		int difficulty = in.nextInt();
		max = diff(difficulty);

		int a = rndm.nextInt(max);
		System.out.println("\nGUESSING THE NUMBER BETWEEN 0 - " + max);
		System.out.print("Enter A Number : ");
		int number = in.nextInt();

		while (number != a) {
			if (number > a) {
				System.out.println("Clue : Your Guess Is Quite High\n");
			} else {
				System.out.println("Clue : Your Guess Is Quite Low\n");
			}
			System.out.print("Enter A Number Again : ");
			number = in.nextInt();
			counter++;
		}
		clear();
		System.out.println("CONGRATULATIONS !!!\nYOU GUESSED THE NUMBER " + a + "\nAfter " + counter + " try(s).");
		playAgain();
	}

	static void playAgain() {
		char again;
		System.out.print("\n\nPLAY AGAIN? Y/N => ");
		again = in.next().charAt(0);

		if (again == 'Y' || again == 'y') {
			clear();
			game();
		} else {
			in.close();
			clear();
			System.out.println("GAME TERMINATED");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		game();
	}
}