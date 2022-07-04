import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
	 Scanner in = new Scanner (System.in);
	 String un, pw;
	 System.out.print("Email  : ");
	 un = in.nextLine();
	 System.out.print("Password : ");
	 pw = in.nextLine();
	 
	 if (un.equals("jiro") && pw.equals("orij"))
	 {
	 	System.out.println("Correct!");
	 }
	 else {
	 	System.out.println("INCorrect!");
	 }
	}
}