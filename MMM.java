import java.util.Scanner;
public class MMM {
	public static void main(String [] args) {
		System.out.println("::::: DYNAMIC EXAM SCORE CALCULATOR :::::");
		Scanner in = new Scanner(System.in);
		int maxSize = 100;
		int noSec = 0;
		int noStud = 0;
		int grade = 0;
		int n = 1;
		
		//getting number of sections
		System.out.print("Enter The No Of Sections : ");
		noSec = in.nextInt();

		int [][] sectionGrade = new int [noSec] [maxSize];
		
		//getting students per section
		for (int i = 0; i < noSec; i++) {
			System.out.print("Enter No Of Students in Section " + n + ": ");
			noStud = in.nextInt();
			n++;
			for (int j = 0; j < noStud; j++) {
			sectionGrade[i]= new int [noStud];
			}
		}
		
		//getting scores per section 
		int m = 1;
		int x = 0;
		for (int a = 0; a < noSec; a++) {
			x++;
			m = 1;
			for (int b = 0; b < noStud; b++) {
				System.out.print("Enter The Exam Score of Student " + m + " in Section " + x + " : ");
				grade = in.nextInt();
				m++;
				sectionGrade[a][b] = grade;
			}
		} 

		//printing
		for (int k = 0; k < noSec; k++) {
			for (int l = 0; l < noStud; l++) {
				System.out.print(sectionGrade[k][l] + " ");
			}
		}



	}
}