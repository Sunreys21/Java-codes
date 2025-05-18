import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Please input the 1st value: ");
        int a = sc.nextInt(); sc.nextLine();
        System.out.printf("Please input 2nd value: ");
        int b = sc.nextInt(); sc.nextLine();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;


        System.out.printf("Perform the operations of %d and %d\n", a, b);
        System.out.printf("Sum is: %d\n", sum);
        System.out.printf("Difference is %d\n", difference);
        System.out.printf("Product is %d\n", product);
        System.out.printf("Quotient is: %d\n", quotient);
        System.out.printf("Remainder is: %d\n", remainder);

        int increment = a++;
        int decrement = b--;

        System.out.printf("Increment is: %d\n", increment);
        System.out.printf("Decrement is %d\n", decrement);

        sc.close();

    }  
}
