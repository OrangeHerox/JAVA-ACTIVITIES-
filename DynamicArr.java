import java.util.*;
import java.util.stream.*;
public class DynamicArr {

	//method for average scores per sections
	static float [] aveSec(int [] [] grade, int noSec, int [] noStud) {
		int temp = 100;
		float [] averagePerSec = new float [temp];
		int sum = 0;
		int increment = 0;

		for (int i = 0; i < noSec; i++) {
			for (int j = 0; j < noStud[i]; j++) {
				sum += grade[i][j];
				increment++;
				if (noStud[i] == noStud[i]) {
					averagePerSec[i] = (float) sum / increment;
				}
			}
			increment = 0;
			sum = 0;
		}

		return averagePerSec;
	}

	//method for average scores for all
	static float aveAllSec(int [] [] grade, int noSec, int [] noStud) {
		float averageAllSec = 0;
		int sum = 0;
		int increment = 0;

		for (int i = 0; i < noSec; i++) {
			for (int j = 0; j < noStud[i]; j++) {
				sum += grade[i][j];
				increment++;
			}
		}
		averageAllSec = (float) sum / increment;
		return averageAllSec;
	}

	//getting highscores per section
	static int [] highScore(int [] [] grade, int noSec, int [] noStud) {
		int num = 100;
		int [] highest = new int [num];
		int temp = 0;
		int k = 0;

		for (int i = 0; i < noSec; i++) {
			for (int j = 0; j < noStud[i]; j++) {

				if (grade[i][j] > grade[i][k + 1]) {
					temp = grade[i][j];
					if (temp > highest[i]) {
						highest[i] = temp;
					}
				} else {
					temp = grade[i][k + 1];
					if (temp > highest[i]) {
						highest[i] = temp;
					}
				}
				k++;
			}
		}
		return highest;
	}

	//Highest Score Overall
	static int highestOverall(int [] highest, int noSec) {
		int highestScore = 0;
		int temp = 0;
		int j = 1;

		for (int i = 0; i < noSec; i++) {
			if (highest[i] > highest[j]) {
				temp = highest[i];
				if (temp > highestScore) {
					highestScore = temp;
				}
			} else {
				temp = highest[j];
				if (temp > highestScore) {
					highestScore = temp;
				}
			}
			j++;
		}

		return highestScore;
	}

	//lowest per sec
	static int [] lowScore(int [] [] grade, int noSec, int [] noStud) {
		int num = 100;
		int [] lowest = new int [num];
		int temp = 0;
		int i = 0, j = 0, k = 0;

		for (i = 0; i < noSec; i++) {
			temp = Integer.MAX_VALUE;
			for (j = 0; j < noStud[i]; j++) {
				if (temp > grade[i][j]) {
					temp = grade[i][j];
				}
			}
			lowest[i] = temp;
		}
		return lowest;
	}

	//lowest overall
	static int lowestOverall(int [] lowest, int noSec) {
		int lowestScore = 0;
		int temp = 0;
		int i = 0;
		temp = Integer.MAX_VALUE;

		for (i = 0; i < noSec; i++) {
			if (temp > lowest[i]) {
				temp = lowest[i];
			}
			lowestScore = temp;
		}
		return lowestScore;
	}

	//for mode
	static void mode(int [][] grades, int noSec, int [] noStud) {
		String spc = " ";
		HashMap<Integer, Integer> map = new HashMap();
		for (int i = 0; i < noSec; i++) {
			for (int j = 0; j < noStud[i]; j++) {
				int temp = grades[i][j];
				if (map.get(temp) == null) {
					map.put(grades[i][j], 1);
				} else {
					int temp2 = (int) map.get(temp);
					map.put(grades[i][j], ++temp2);
				}
			}
		}
		Object[] objects = map.values().stream().sorted().toArray();
		Stream stream = map.entrySet().stream().filter(val-> val.getValue().equals(objects[objects.length - 1]));
		stream.forEach(System.out::println);
	}

	//For Median
	static void median(int [] num) {
		int size = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0) {
				size++;
			}
		}
		int n = size;

		int temp = n / 2;
		int median = 0;

		if (n % 2 == 0) {
			median = num[temp] + num[temp - 1];
			System.out.println((float)median / 2);
		} else {
			//median = temp;
			System.out.println(num[temp/*median*/]);
		}
	}

	static void ascending(int [] arr) {
		Arrays.sort(arr);
		int [] temp = new int [arr.length];
		int size = 0;
		int k = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				size++;
				temp[k] = arr[j];
				k++;
			}
		}
		median(temp);
	}

	static void convertToOneD(int[][] grades, int noSec, int [] noStud) {
		int size = 1000;
		int i = 0;
		int [] holder = new int[size];
		for (int a = 0; a < noSec; a++) {
			for (int b = 0; b < noStud[a]; b++) {
				//System.out.print(arrayName[c][r] + " ");
				holder[i] = grades[a][b];
				i++;
			}
		}
		ascending(holder);
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("::::: DYNAMIC EXAM SCORE CALCULATOR :::::");
		//declarations1
		int numSec = 0;
		int i = 0, j = 0, k = 0, l = 0, plus = 1, increStud = 1, increSec = 0;
		int temp = 1000;

		//getting sections
		System.out.print("Enter The Number Of Sections : ");
		numSec = in.nextInt();

		//declarations2
		int [] numStud = new int [numSec];
		int [] [] sectionGrade = new int [numSec] [temp];

		//get num of stud per sec
		for (i = 0; i < numSec; i++) {
			System.out.print("Enter The Number Of Students in Section " + plus + ": ");
			numStud[i] = in.nextInt();
			plus++;
		}

		//for checking and printing output
		//System.out.println();
//		for (j = 0; j < numSec; j++) {
//			System.out.print(numStud[j] + " ");
//		}
//		System.out.println();
//		System.out.println();

		//get score of stud every sec
		System.out.println();
		for (k = 0; k < numSec; k++) {
			increSec++;
			increStud = 1;
			for (l = 0; l < numStud[k]; l++) {
				System.out.print("Enter The Exam Score of Student " + increStud + " in Section  " + increSec + " : ");
				sectionGrade[k][l] = in.nextInt();
				increStud++;
			}
			System.out.println();
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");

		//OUTPUTS!!!

		//Average Per Section
		plus = 1;
		float avgPerSec [] = aveSec(sectionGrade, numSec, numStud);
		for (int x = 0; x < numSec; x++, plus++) {
			System.out.println("The Average Score in Section " + plus + " : " + avgPerSec[x]);
		}

		//Average Of All Sections
		System.out.println("The Average Score In All Sections : " + aveAllSec(sectionGrade, numSec, numStud));
		System.out.println();

		//High Score Per Section
		plus = 1;
		int highestScores [] = highScore(sectionGrade, numSec, numStud);
		for (int x = 0; x < numSec; x++, plus++) {
			System.out.println("The Highest Score in Section " + plus + " : " + highestScores[x]);
		}

		//Highest Overall
		System.out.println("The Highest Score OverAll Sections : " + highestOverall(highestScores, numSec));
		System.out.println();

		//lowest per section
		plus = 1;
		int lowestScores [] = lowScore(sectionGrade, numSec, numStud);
		for (int x = 0; x < numSec; x++, plus++) {
			System.out.println("The Lowest Score in Section " + plus + " : " + lowestScores[x]);
		}

		//lowest Overall
		System.out.println("The Lowest Score OverAll Sections : " + lowestOverall(lowestScores, numSec));
		System.out.println();

		//Mode OverAll
		System.out.println("The Mode(s) :  [Actual Number / Times Of Occurence] : ");
		mode(sectionGrade, numSec, numStud);
		System.out.println();

		//Median OverAll
		System.out.print("The Median : ");
		convertToOneD(sectionGrade, numSec, numStud);
		System.out.println();

		//for checking
		//System.out.println();
//		int a = 0, b = 0;
//		for (a = 0; a < numSec; a++) {
//			for (b = 0; b < numStud[a]; b++) {
//				System.out.print(sectionGrade[a][b] + " ");
//			}
//		}

	}
}