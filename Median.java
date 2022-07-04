public class Median {
	public static void main(String[] args) {
		int [] num = {90,91,92,93,94};
		int n = num.length;
		int median = n/2;
		if (num.length % 2 == 0) {
			median = num[median] + num[median+1];
			System.out.println((float)median/2);
		}
		else {
		System.out.println(num[median]);
		}
	}
}