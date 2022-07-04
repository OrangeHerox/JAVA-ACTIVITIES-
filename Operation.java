import java.util.Scanner;
public class Operation {
	public static void main(String[] args) {
		//instantiation
		Scanner in = new Scanner (System.in);
		
		//declarations
		int firstNum, secondNum, result = 0;
		String choiceOper = "";
		
		//user inputs
		System.out.print("Enter First Number : ");
		firstNum = in.nextInt();
		System.out.print("Enter Second Number : ");
		secondNum = in.nextInt();
		System.out.println("Operations");
		System.out.println("[ + ] Addition\n[ - ] Subtraction\n[ x ] Multiplication\n[ / ] Division\n[ % ] Modulo Division ");
		System.out.print("Enter Operation Here: ");
		choiceOper = in.next();
		
		//condition and computation
		if ( choiceOper.equals("+") ) {
		result = firstNum + secondNum;
		}
		else if ( choiceOper.equals("-") ) {
		result = firstNum - secondNum;
		}
		else if ( choiceOper.equals("x") ) {
		result = firstNum * secondNum;
		}
		else if ( choiceOper.equals("/") ) {
		result = firstNum / secondNum;
		}
		else if ( choiceOper.equals("%") ) {
		result = firstNum % secondNum;
		}
		else {
			System.out.println("Invalid Choice Of Operation...");
			return;
		}
		System.out.println(firstNum+" "+choiceOper+" "+secondNum+" = "+result);
		
	}
}