import java.util.*;
public class AscendingArr {
	static void arrangeAsc(int[][] grades) {
		int[] simpleArray = new int[(grades[0].length) * (grades.length)];
			for (int r = 0; r < grades.length; r++) {
			for (int c = 0; c < grades[0].length; c++) { 

				simpleArray[grades[0].length * r + c] = grades[r][c]; 
			}
		}
		Arrays.sort(simpleArray); 
		int i = 0, j = 0;
		for (int r = 0; r < grades.length; r++,i++) { 
			for (int c = 0; c < grades[0].length; c++,j++) { 
			grades[r][c] = (simpleArray[(r * grades[0].length) + c ]);
			System.out.println(grades[r][c]);
			}
		}
		convertToOneD(grades);
	}
	
	static void median(int [] num) {
	    int size = 0;
	    for (int i = 0; i < num.length; i++) {
	    	if (num[i] != 0) {
	    		size++;
	    	}
	    }
	    int n = size-1;
	    
    	int median = n/2;
    	
		if (num.length % 2 == 0) {
			median = num[median] + num[median+1];
			System.out.println((float)median/2);
		}
		else {
		System.out.println(num[median]);
		}
	}
	
	static void convertToOneD(int[][] grades) { //METHOD TO PRINT A 2D ARRAY AS A TABLE
		int size = 10;
		int i = 0;
		int [] holder = new int[size];
		for (int a = 0; a < grades.length; a++) { 
			for (int b = 0; b < grades[0].length; b++) {
				//System.out.print(arrayName[c][r] + " ");  
				holder[i] = grades[a][b];
				i++;
			}
		}
			median(holder);
	}

	public static void main(String[] args) {
		int [] [] arr = new int[2][3];
		arr[0][0] = 90;
		arr[0][1] = 92;
		arr[1][0] = 97;
		arr[1][1] = 94;
		arr[1][2] = 100;
		arrangeAsc(arr);
	}
}