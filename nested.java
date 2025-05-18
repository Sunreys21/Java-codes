import java.util.Scanner;

public class nested {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*int num;

		System.out.print("Enter a number: ");
		num = scanner.nextInt();

		if (num > 0) {
			System.out.println("Positive");
		} else {
			if (num < 0) {
				System.out.println("Negative");
			} else {
				System.out.println("Zero");
			}
		}*/

		int num;

		System.out.print("Enter a number: ");
		num = scanner.nextInt();

		if (num > 0) {
			if (num < 10) {
				System.out.println("Small positive");
			} else {
				System.out.println("Large positive");
			}
		} else {
			if (num < 0) {
				System.out.println("Negative");
			} else {
				System.out.println("Zero");
			}
		}
	}
}

