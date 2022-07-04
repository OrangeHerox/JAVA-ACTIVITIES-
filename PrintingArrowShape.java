public class PrintingArrowShape {
	public static void main(String[] args) {
		int i = 0, j = 0, k = 0, l = 0;
		int number = 17;
/*
		for (i = number / 2; i > 0; i--) {
			if ((number / 2) % 2 == 1) {
				for (l = 0; l <= number / 4; l++) {
					System.out.print("_ ");
				}
				for (j = 0; j < number / 2; j++) {
					System.out.print("* ");
				}
				for (l = 0; l <= number / 4; l++) {
					System.out.print("_ ");
				}
				System.out.println();
			} else {
				for (l = 0; l < number / 4; l++) {
					System.out.print("_ ");
				}
				for (j = 0; j <= number / 2; j++) {
					System.out.print("* ");
				}
				for (l = 0; l < number / 4; l++) {
					System.out.print("_ ");
				}
				System.out.println();
			}
		}
		for (i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				for (l = 0; l <  i / 2; l++) {
					System.out.print("_ ");
				}

				for (j = number; j >= i; j--) {
					System.out.print("* ");
				}

				for (l = 0; l < i / 2; l++) {
					System.out.print("_ ");
				}
				System.out.println();
			}
		}*/
		
		for (i = number; i > 0; i--)
		 {
			if (i % 2 == 1)
			 {
				for (k = 0; k <  i /2; k++)
				 {
					System.out.print("_ ");
				}
				for (j = number; j >= i; j--) 
				{
					System.out.print("* ");
				}
				for (k = 0; k < i / 2; k++) 
				{
					System.out.print("_ ");
				}
				System.out.println();
			}
		}
		for (i = number/2; i > 0; i--) 
		{
							if ((number/2) % 2 == 1)
							{
							for (l = 0; l <= number /4; l++) 
							{
								System.out.print("_ ");
							}
							for (j = 0; j < number/2; j++)
							 {
								System.out.print("* ");
							}
							for (l = 0; l <= number /4; l++) 
							{
								System.out.print("_ ");
							}
							System.out.println();
						}
						else 
						{
							for (l = 0; l < number /4; l++)
							 {
								System.out.print("_ ");
							}
							for (j = 0; j <= number/2; j++)
							 {
								System.out.print("* ");
							}
							for (l = 0; l < number /4; l++)
							 {
								System.out.print("_ ");
							}
							System.out.println();
						}
						}
		         	
	}
}