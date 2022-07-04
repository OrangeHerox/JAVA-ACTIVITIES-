import java.util.Scanner;
public class Shapes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int n = 0;
		int i = 0;
	    System.out.print("Enter Number: ");
	    n = scanner.nextInt();
    	System.out.println("SHAPE DRAWING\n[ 1] Draw Line");
    	System.out.println("[ 2] Draw Striped Line");			//
		System.out.println("[ 3] Draw Square ");
		System.out.println("[ 4] Draw Parallelogram");
		System.out.println("[ 5] Draw Triangle");
		System.out.println("[ 6] Draw Reverse Triangle");
		System.out.println("[ 7] Draw Isosceles Triangle");
		System.out.println("[ 8] Draw Reverse Isosceles Triangle");
		System.out.println("[ 9] Draw Hourglass");
		System.out.println("[10] Draw Diamond");
		System.out.println("[11] Draw Zero");
		System.out.println("[12] Draw Arrow Up");
        System.out.println ("[13] Draw Arrow Down");
		System.out.println("[14] Draw X");
		System.out.println("[15] Draw Bowtie");
		System.out.print("Choose From Above: ");
	    choice = scanner.nextInt();
		
	    while(choice != 0)
	    {
	    	if (choice == 1) {
	    	for (i = 0; i < n; i++) {
							System.out.print("* ");
						}
			break;
	    	}
	    	else if (choice == 2) {	}
	    	else if (choice == 3) {	}
	    	else if (choice == 4) {	}	
	    	else if (choice == 5) {	}
	    	else if (choice == 6) {	}
	    	else if (choice == 7) {	}
	    	else if (choice == 8) {	}
	    	else if (choice == 9) {	}
	    	else if (choice == 10) {	}
	    	else if (choice == 11) {	}
	    	else if (choice == 12) {	}
	    	else if (choice == 13) {	}
	    	else if (choice == 14) {	}
	    	else if (choice == 15) {	}
	    	else {
	    		System.out.println("Invalid");
	    		return;
	    	}
	    }
	    






	}
}