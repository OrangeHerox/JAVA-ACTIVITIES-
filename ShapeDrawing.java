import java.util.Scanner;
public class ShapeDrawing {

	public static void options() {
		System.out.println("SHAPE DRAWING\n[ 0] Exit Program\n[ 1] Draw Line\n[ 2] Draw Striped Line");			//
		System.out.println("[ 3] Draw Square \n[ 4] Draw Parallelogram\n[ 5] Draw Triangle");
		System.out.println("[ 6] Draw Reverse Triangle\n[ 7] Draw Isosceles Triangle\n[ 8] Draw Reverse Isosceles Triangle");
		System.out.println("[ 9] Draw Hourglass\n[10] Draw Diamond\n[11] Draw Zero");
		System.out.println("[12] Draw Arrow Up\n[13] Draw Arrow Down\n[14] Draw X\n[15] Draw Bowtie");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = 0, choice = 0, i = 0, j = 0, k = 0;

		do {
			System.out.print("\n");
			options();
			System.out.print("Select From Methods Above: ");
			choice = in.nextInt();
			//condition on only getting the range of 0-15 and Getting Only The Odd Number Above 4
			if (choice > 15 || choice < 0) {
				System.out.println("\nINVALID METHOD...");
			} else if (choice == 0) {
				break; //exiting loop
			} else {
				System.out.print("Enter An Odd Number :  ");
				number = in.nextInt();
				if (number < 5 || number % 2 == 0) {
					System.out.println("\nODD NUMBER 5 and Above Only Is Accepted!");
					break;
				} else {
					switch (choice) {
					case 1:
						System.out.println("\nYou Select Line");
						for (i = 1; i <= number; i++) {
							System.out.print("* ");
						}
						break;

					case 2:
						System.out.println("\nYou Select Striped Line");
						for (i = 1; i <= number; i++) {
							if (i % 2 == 1) {
								System.out.print("* ");
							} else {
								System.out.print("_ ");
							}
						}
						break;

					case 3:
						System.out.println("\nYou Select Square");
						for (i = 1; i <= number; i++) {
							for (j = 1; j <= number; j++) {
								System.out.print("*  ");
							}
							System.out.print("\n");
						}
						break;

					case 4:
						System.out.println("\nYou Select Parallelogram");
						for (i = number;  i > 0; i--) {
							for (k = 0; k <  i; k++) {
								System.out.print("_ ");
							}
							for (j = 1; j <= number; j++) {
								System.out.print("* ");
							}
							for (k = number; k > i; k--) {
								System.out.print("_ ");
							}
							System.out.println();
						}
						break;

					case 5:
						System.out.println("\nYou Select Triangle");
						for (i = number; i >= 1; i--) {
							for (j = 1; j <= i; j++) {
								System.out.print("* ");
							}
							for (k = number; k > i; k--) {
								System.out.print("_ ");
							}
							System.out.println();
						}
						break;

					case 6:
						System.out.println("\nYou Select Reverse Triangle");
						for (i = number; i > 0; i--) {
							for (j = number; j >= i; j--) {
								System.out.print("* ");
							}
							for (k = 0; k < i - 1; k++) {
								System.out.print("_ ");
							}
							System.out.println();
						}
						break;

					case 7:
						System.out.println("\nYou Select Isosceles Triangle");
						for (i = number; i > 0; i--) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}

								for (j = number; j >=  i; j--) {
									System.out.print("* ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						break;

					case 8:
						System.out.println("\nYou Select Reverse Isosceles Triangle");
						for (i = 0; i <=  number; i++) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}

								for (j = number; j >= i; j--) {
									System.out.print("* ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						break;

					case 9:
						System.out.println("\nYou Select Hourglass ");
						for (i = 0; i < number; i++) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}
								for (j = number; j >= i; j--) {
									System.out.print("* ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						for (i = number; i > 0; i--) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}

								for (j = number; j >= i; j--) {
									System.out.print("* ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						break;

					case 10:
						System.out.println("\nYou Select Diamond ");
						for (i = number; i > 0; i--) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}
								for (j = number; j >= i; j--) {
									System.out.print("* ");
								}
								for (k = 0; k < i / 2; k ++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						for (i = 2; i <= number; i++) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}
								for (j = number; j >= i; j--) {
									System.out.print("* ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						break;

					case 11:
						System.out.println("\nYou Select Zero");
						for (i = 0; i < number; i++) {
							System.out.print("* ");
							for (j = 0; j < number - 2; j++) {
								if (i == 0 || i == number - 1) {
									System.out.print("* ");
								} else {
									System.out.print("_ ");
								}
							}
							System.out.println("* ");
						}
						break;

					case 12:
						System.out.println("\nYou Select Arrow Up");
						for (i = number; i > 0; i--) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}

								for (j = number; j >= i; j--) {
									System.out.print("* ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						for (i = number / 2; i > 0; i--) {
							if ((number / 2) % 2 == 1) {
								for (k = 0; k <= number / 4; k++) {
									System.out.print("_ ");
								}
								for (j = 0; j < number / 2; j++) {
									System.out.print("* ");
								}
								for (k = 0; k <= number / 4; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							} else {
								for (k = 0; k < number / 4; k++) {
									System.out.print("_ ");
								}
								for (j = 0; j <= number / 2; j++) {
									System.out.print("* ");
								}
								for (k = 0; k < number / 4; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						break;

					case 13:
						System.out.println("\nYou Select Arrow Down");
						for (i = number / 2; i > 0; i--) {
							if ((number / 2) % 2 == 1) {
								for (k = 0; k <= number / 4; k++) {
									System.out.print("_ ");
								}
								for (j = 0; j < number / 2; j++) {
									System.out.print("* ");
								}
								for (k = 0; k <= number / 4; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							} else {
								for (k = 0; k < number / 4; k++) {
									System.out.print("_ ");
								}
								for (j = 0; j <= number / 2; j++) {
									System.out.print("* ");
								}
								for (k = 0; k < number / 4; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						for (i = 0; i <= number; i++) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}

								for (j = number; j >= i; j--) {
									System.out.print("* ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						break;

					case 14:
						System.out.println("\nYou Select X");
						for (i = 0; i < number; i++) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}
								for (j = number; j >= i; j--) {
									if (j % 2 == 1 && j == number || j == i || j == j + 1)
										System.out.print("* ");
									else
										System.out.print("_ ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						for (i = number; i >  0; i--) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2; k++) {
									System.out.print("_ ");
								}

								for (j = number; j >= i; j--) {
									if (j % 2 == 1 && j == number || j == i  || j == j + 1)
										System.out.print("* ");
									else
										System.out.print("_ ");
								}

								for (k = 0; k < i / 2; k++) {
									System.out.print("_ ");
								}
								System.out.println();
							}
						}
						break;

					case 15:
						System.out.println("\nYou Select Bowtie");
						for (i = 0; i <= number - 2; i++) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2 + 1; k++) {
									System.out.print("* ");
								}
								for (j = number - 1; j > i; j--) {
									System.out.print("_ ");
								}

								for (k = 0; k < i / 2 + 1; k++) {
									System.out.print("* ");
								}
								System.out.println();
							}
						}

						for (i = number; i > 0; i--) {
							System.out.print("* ");
						}
						System.out.println();

						for (i = number - 2; i > 0; i--) {
							if (i % 2 == 1) {
								for (k = 0; k <  i / 2 + 1; k++) {
									System.out.print("* ");
								}

								for (j = number - 1; j > i; j--) {
									System.out.print("_ ");
								}

								for (k = 0; k < i / 2 + 1; k++) {
									System.out.print("* ");
								}
								System.out.println();
							}
						};
						break;
					} //switch end
				} //end of elif2
			} //end of elif 1
			System.out.println();
		} while (choice != 0);
		System.out.println("\nPROGRAM TERMINATED...");
		in.close();
	}
}