import java.util.Scanner;
public class BasicOperations {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum = 0, secondNum = 0, result = 0, operation;
		String DisplayOper = "";
		
		System.out.println("BASIC OPERATION");
		System.out.print("First Number : ");
		firstNum = in.nextInt();
		System.out.print("Second Number : ");
		secondNum = in.nextInt();
		
		System.out.println("[1] Addition");
		System.out.println("[2] Subtraction");
		System.out.println("[3] Multiplication");
		System.out.println("[4] Division");
		System.out.println("[5] Remainder Division");
		System.out.print("Choose Operation : ");
		operation = in.nextInt();
		
		if (operation == 1) {
		result = firstNum + secondNum;
		DisplayOper = "+";
		}
		else if (operation == 2) {
		result = firstNum - secondNum;
		DisplayOper = "-";
		}
		else if (operation == 3) {
		result = firstNum * secondNum;
		DisplayOper = "×";
		}
		else if (operation == 4) {
		result =  firstNum / secondNum;
		DisplayOper = "÷";
		}
		else if (operation == 5) {
		result = firstNum % secondNum;
		DisplayOper = "%";
		}
		else {
		System.out.println("Invalid Choice of Operation...");
		return;
		}
		System.out.println(firstNum+"	"+DisplayOper+"	"+secondNum+"	=	"+result);
	
	}
}