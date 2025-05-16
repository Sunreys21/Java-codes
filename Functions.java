public class Functions {
	public static void greetUser() {
		System.out.println("Hello, user! Welcome to CodeChum!");
	}

	public static void main(String[] args) {
		greetUser(); // Calling the method
	}
}

/*import java.util.Scanner;

public class Main{
    
    public static void getCalculation(){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter the base of the triangle: ");
        float base = sc.nextFloat();
        System.out.printf("Enter the height of the triangle: ");
        float height = sc.nextFloat();
        sc.close();
        float result = (base*height)/2;
        System.out.printf("Result: %.2f", result);
    }

    public static void main(String[]args){
        getCalculation();

    }
}*/

/*public class Main{
    public static void display(){
        System.out.printf("I love programming");
    }
    public static void main(String[]args){
        display();
    }
} */

/*
 * import java.util.Scanner;

public class Main{
    static void PrintPass(){
        System.out.printf("Pass");
    }
    static void PrintFail(){
        System.out.printf("Fail");
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the grade (between 0 and 100): ");
        int grade = sc.nextInt();
        if(grade >= 60){
            PrintPass();
        }else{
            PrintFail();
        }
    }
}
 */

 /*import java.util.Scanner;

public class Main{
    public static void convertTemperature(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the temperature in Celsius: ");
        float Celsius = sc.nextFloat();
        float Fahrenheit = (Celsius*9/5) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f", Fahrenheit);
        
    }
    public static void main(String[]args){
        convertTemperature();
    }
} */

//w return val

/*import java.util.Random;

public class Main {
	public static int generateRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(100); // Generate a random number between 0 and 99
		return randomNumber;
	}

	public static void main(String[] args) {
		int randomNum = generateRandomNumber(); // Calling the method

		System.out.println("The random number is: " + randomNum);
	}
} */

/*
import java.util.Scanner;

public class Main{
    public static double calculateRectanglePerimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.printf("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        sc.close();
        
        return 2*(length+width);
    }
    public static void main(String[]args){
        double result = calculateRectanglePerimeter();
        System.out.printf("Perimeter of the rectangle: %.2f", result);
    }
}
 */

 /*import java.util.Scanner;

public class Main{
    public static double calculateCylinderVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.printf("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        sc.close();
        
        double PI = 3.141592653589793;
        return PI*(radius*radius)*height;
        
    }
    public static void main(String[]args){
        double result = 4*calculateCylinderVolume();
        System.out.printf("Result: %.2f", result);
    }
} */

/*
 * import java.util.Scanner;

public class Main{
    public static float calculateAverage(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.printf("Enter the second number: ");
        float num2 = sc.nextFloat();
        System.out.printf("Enter the third number: ");
        float num3 = sc.nextFloat();
        sc.close();
        
        float sum = num1 + num2 + num3;
        return sum/3;
    }
    public static void main(String[]args){
        float average = calculateAverage();
        System.out.printf("The average of the three numbers is: %.2f", average);
    }
}
 */

 /*
  * import java.util.Scanner;

public class Main{
    public static double calculateSquareArea(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the side of the square: ");
        double side = sc.nextDouble();
        return side*side;
    }
    
    public static double calculateCircleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double pi = 3.141592653589693;
        return pi*(radius*radius);
    }
    public static void main(String[]args){
        double Square = calculateSquareArea();
        double Circle = calculateCircleArea();
        
        System.out.printf("Total area (square + circle): %.2f", Square+Circle);
    }
}
  */

  /*public class Main {
	public static void greetUser(String name) {
		System.out.println("Hello, " + name + "!");
	}

	public static void main(String[] args) {
		String userName = "John";
		greetUser(userName);
	}
} */

/*
 * public class Main {
	public static void printSum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
	}

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		printSum(num1, num2);
	}
}
 */

 /*import java.util.Scanner;

public class Main{
    public static void displayBodyMetrics(double height1, double weight1){
        double BMI1 = weight1/(height1*height1);
        System.out.printf("BMI: %.2f", BMI1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your height (in meters): ");
        double height = sc.nextDouble();
        System.out.printf("Enter your weight (in kilograms): ");
        double weight = sc.nextDouble();
        displayBodyMetrics(height, weight);
        
    }
} */
/*
 * import java.util.Scanner;

public class Main{
    public static void sumOfIntegers(int x, int y, int z){
        int sum = x+y+z;
        System.out.printf("%d", sum);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first integer: ");
        int a = sc.nextInt();
        System.out.printf("Enter second integer: ");
        int b = sc.nextInt();
        System.out.printf("Enter third integer: ");
        int c = sc.nextInt();
        sc.close();
        sumOfIntegers(a,b,c);
    }
}
 */

 /*import java.util.Scanner;

public class Main{
    public static void evaluatePolynomial(double a, double b, double c, double d, double x){
        double polynomial = a*(x*x*x) + b*(x*x) + c*x + d;
        System.out.printf("Value of the polynomial: %.2f", polynomial);
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter coefficient a: ");
        double a1 = sc.nextDouble();
        System.out.printf("Enter coefficient b: ");
        double b1 = sc.nextDouble();
        System.out.printf("Enter coefficient c: ");
        double c1 = sc.nextDouble();
        System.out.printf("Enter coefficient d: ");
        double d1 = sc.nextDouble();
        System.out.printf("Enter value of x: ");
        double x1 = sc.nextDouble();
        
        evaluatePolynomial(a1,b1,c1,d1,x1);

    }
}
 */

 /*import java.util.Scanner;

public class Main{
    
    static float BillA;
    public static void calculateBill(float unitC1, float unitR1){
        BillA = unitC1 * unitR1;
    }
    
    public static void displayBillDetails(String name2, float unitC2, float unitR2){
        System.out.printf("Customer Name: %s\n", name2);
        System.out.printf("Units Consumed: %.2f\n", unitC2);
        System.out.printf("Rate Per Unit: %.2f\n", unitR2);
        System.out.printf("Bill Amount: %.2f\n", BillA);
        System.out.printf("Thank you for using our services!");
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.printf("Enter Units Consumed: ");
        float unitC = sc.nextFloat();
        System.out.printf("Enter Rate Per Unit: ");
        float unitR = sc.nextFloat();
        
        calculateBill(unitC , unitR);
        displayBillDetails(name, unitC, unitR);

    }
} */

/*import java.util.Scanner;

public class Main{
    public static void displayFavorites(String color1, String animal1, int num1){
        System.out.printf("Favorite Color: %s\n", color1);
        System.out.printf("Favorite Animal: %s\n", animal1);
        System.out.printf("Favorite Number: %d\n", num1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your favorite color: ");
        String color = sc.nextLine();
        System.out.printf("Enter your favorite animal: ");
        String animal = sc.nextLine();
        System.out.printf("Enter your favorite number: ");
        int num = sc.nextInt();
        
        displayFavorites(color, animal, num);
    }
} */

/*public class Main {
	public static int calculateSum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		int sum = calculateSum(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	}
} */

//FUNCTIONS WITH RETURN VALUE 

/*public class Main {
	public static int calculateSum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		int sum = calculateSum(num1, num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	}
} */

/*import java.util.Scanner;

public class Main{
    public static double calculateAverageRating(double quality1, double price1, double service1){
        double sum = quality1+price1+service1;
        return sum/3;
    }
    public static void analyzeProductRating(String productName2, String category2, double quality2, double price2, double service2){
        System.out.printf("Product Name: %s\n", productName2);
        System.out.printf("Category: %s\n", category2);
        System.out.printf("Quality Rating: %.2f\n", quality2);
        System.out.printf("Price Rating: %.2f\n", price2);
        System.out.printf("Service Rating: %.2f\n", service2);
        double average = calculateAverageRating(quality2, price2, service2);
        System.out.printf("Overall Average Rating: %.2f\n", average);
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Product Name: ");
        String productName = sc.nextLine();
        System.out.printf("Enter Category: ");
        String category = sc.nextLine();
        System.out.printf("Enter Quality Rating: ");
        double quality = sc.nextDouble();
        System.out.printf("Enter Price Rating: ");
        double price = sc.nextDouble();
        System.out.printf("Enter Service Rating: ");
        double service = sc.nextDouble();
        
        sc.close();
        
        calculateAverageRating(quality, price, service);
        analyzeProductRating(productName, category, quality, price, service);
    }
}
} */

/*import java.util.Scanner;

public class Main{
    public static int addNumbers(int numa, int numb){
        return numa + numb;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.printf("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();
        
        int sum = addNumbers(num1, num2);
        System.out.printf("Sum of numbers: %d", sum);
    }
} */

/*import java.util.Scanner;

public class Main{
    public static float min(float numa, float numb, float numc){
        float minVal1 = 0;
        if(numa > numb){
            minVal1 = numb;
        }else{
            minVal1 = numa;
        }
        
        if(minVal1 > numc){
            minVal1 = numc;
        }
        
        return minVal1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first value: ");
        float num1 = sc.nextFloat();
        System.out.printf("Enter second value: ");
        float num2 = sc.nextFloat();
        System.out.printf("Enter third value: ");
        float num3 = sc.nextFloat();
        
        sc.close();
        float minVal = min(num1, num2, num3);
        System.out.printf("Minimum Value: %.3f", minVal);
    }
} */

/*import java.util.Scanner;

public class Main{
    public static double calculateLinearEquation(double x1, double slope1, double yIntercept1){
        return (x1*slope1) + yIntercept1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter x: ");
        double x = sc.nextDouble();
        System.out.printf("Enter slope: ");
        double slope = sc.nextDouble();
        System.out.printf("Enter y intercept: ");
        double yIntercept = sc.nextDouble();
        sc.close();
        double result = calculateLinearEquation(x, slope, yIntercept);
        System.out.printf("Result: %.2f", result);
    }
} */

//RECURSIVE FUNCTIONS
/* public class Main {
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n; // Base case: Fibonacci of 0 and 1 is the number itself
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case: F(n) = F(n-1) + F(n-2)
		}
	}

	public static void main(String[] args) {
		int num = 6;
		System.out.println("Fibonacci number at position " + num + " is: " + fibonacci(num));
	}
}*/

/*public class Main {
	public static int factorial(int n) {
		if (n == 0) {
			return 1; // Base case: factorial of 0 is 1
		} else {
			return n * factorial(n - 1); // Recursive case: n! = n * (n-1)!
		}
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is: " + factorial(num));
	}
} */

/*import java.util.Scanner;

public class Main{
    public static int sumFibonacci(int n1){
        if (n1 <= 1) {
			return n1;
		} else {
			return sumFibonacci(n1 - 1) + sumFibonacci(n1 - 2);
        }
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        int sum = sumFibonacci(n+2);
        System.out.printf("Sum of the first %d Fibonacci numbers is %d.", n, sum-1);
        
    }
} */

/*import java.util.Scanner;

public class Main{
    public static void countdown(int n1){
        if(n1 >= 0){
            System.out.printf("%d ", n1);
            countdown(n1-1);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        countdown(n);
    }
} */

/*import java.util.Scanner;

public class Main{
    public static float sum(int n1){
        if(n1 < 0){
            return 0;
        }else{

            return (float)n1 + sum(n1-1);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the value of N: ");
        int n = sc.nextInt();
        sc.close();
        float sum1 = sum(n);
        System.out.printf("Sum: %.2f", sum1);
    }
} */

/*import java.util.Scanner;

public class Main{
    public static int gcd(int a1,int b1){
        if (b1 == 0) {
            return a1;
        }
        
        return gcd(b1, a1 % b1);
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a: ");
        int a = sc.nextInt();
        System.out.printf("Enter b: ");
        int b = sc.nextInt();
        sc.close();
        int gcd1 = gcd(a,b);
        System.out.printf("GCD of %d and %d is %d", a, b, gcd1);
        
    }
} */

/*
 * import java.util.Scanner;

public class PalindromeChecker {
    
    // Recursive function to check if a string is palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: when start meets or passes end
        if (start >= end) {
            return true;
        }
        
        // If characters at current positions don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Recursive case: check next pair of characters
        return isPalindrome(str, start + 1, end - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        
        boolean result = isPalindrome(processedInput, 0, processedInput.length() - 1);
        
        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
 */

//FUNCTIONS ARRAY

/*public class Main {
	public static void main(String[] args) {
		double[] arr = {1, 3.14, 3.2220, 4.1, 55};
		double sum = getSum(arr);
		System.out.printf("Sum = %.2f", sum);
	}

	public static double getSum(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
} */

/*public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int constant = 10;

		System.out.print("Original Array: ");
		printArray(arr);

		// Calling the method to add a constant value to the elements
		addConstant(arr, constant);

		System.out.print("\nModified Array: ");
		printArray(arr);
	}

	public static void addConstant(int[] arr, int constant) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += constant;
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
} */

/*public class Main {
	public static void main(String[] args) {
		int size = 5;
		int[] newArr = createArray(size);

		System.out.print("New Array: ");
		printArray(newArr);
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
 */

 /*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter the elements of the array: \n");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        int ans = findMostFrequentElement(arr, size);
        System.out.printf("The most frequent element in the array is %d", ans);
    }
    public static int findMostFrequentElement(int[] arr,int size){
        int count = 0;
        int frequent = arr[0];
        
        for(int i = 0; i < size; i++){
            int Ncount = 1;
            for(int j = i+1; j < size; j++){
                if(arr[i] == arr[j]){
                    Ncount++;
                }
            }
            
        if(Ncount > count){
            count = Ncount;
            frequent = arr[i];
            }
        }
        
        return frequent;
    }
} */

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter the elements of the array: \n");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = sumArray(arr, size);
        System.out.printf("The sum of the elements in the array is: %d", sum);
    }
    
    public static int sumArray(int[] arr1,int size1){
        int sum = 0;
        for(int i = 0; i<size1; i++){
            sum += arr1[i];
        }
        return sum;
    }
} */

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter the elements of the array: \n");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.printf("Enter the integer N to count its occurrences: ");
        int N = sc.nextInt();
        
        int result = countOccurrences(arr, size, N);
        System.out.printf("The number of occurrences of %d in the array is: %d", N, result);
        
    }
    
    public static int countOccurrences(int[] arr1, int size1, int N1){
        int occurences = 0;
        for(int i = 0; i<size1; i++){
            if(arr1[i] == N1){
                occurences++;
            }
        }
        return occurences;
    }
} */

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter the array elements: \n");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int result = findPeakIndex(arr, size);
        if (result != -1) {
            System.out.printf("The peak element is at index %d", result);
        } else {
            System.out.printf("No peak element found in the array");
        }
    }

    public static int findPeakIndex(int[] arr, int size) {
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
} */

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter the elements of the array:\n");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        arrayZeroSum(arr, size);
        
    }
    public static void arrayZeroSum(int[] arr1, int size1){
        int result = 0;
        for(int i = 0; i<size1; i++){
            for(int j = i+1; j<size1; j++){
                if((arr1[i]-arr1[j])==0){
                    System.out.printf("The array has two elements that sum to zero.");
                    return;
                }else if((arr1[j] + arr1[i])==0){
                    System.out.printf("The array has two elements that sum to zero.");
                    return;
                }
            }
        }
            System.out.printf("The array does not have two elements that sum to zero.");
        }

    }
 */

 //2D ARRAY FUNCTIONS
 /*public class Main {

	// Method to display a 2D array
	public static void displayArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3},
						  {4, 5, 6},
						  {7, 8, 9}};

		// Passing the 2D array to the method
		displayArray(matrix);
	}
} */

/*public class Main {
	
	// Method to add a constant value to each element of the 2D array
	public static void addConstant(int[][] arr, int constant) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += constant;
			}
		}
	}

	// Method to display the modified array
	public static void displayArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {{1, 2}, {3, 4}};

		// Adding a constant value to the array
		addConstant(matrix, 5);

		// Display the modified array
		displayArray(matrix);
	}
} */

/*public class Main {

	// Method to create and return a 2D array dynamically
	public static int[][] create2DArray(int rows, int cols) {
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = i + j; // Initializing array elements for demonstration
			}
		}
		return arr;
	}

	// Method to display a 2D array
	public static void displayArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int rows = 3, cols = 4;
		int[][] matrix = create2DArray(rows, cols);

		// Display the dynamically allocated array
		displayArray(matrix);
	}
} */

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.printf("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.printf("Enter the elements of the array: \n");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        printEven(rows, columns, arr);
    }
    
    public static void printEven(int rows1,int columns1, int[][] arr1){
        System.out.printf("Even Values:\n");
        for(int i = 0; i < rows1; i++){
            for(int j = 0; j < columns1; j++){
                if((arr1[i][j]%2) == 0){
                    System.out.printf("%d, ", arr1[i][j]);
                }
            }
        }
        System.out.printf("\b\b");
    }
} */

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.printf("Enter number of columns: ");
        int columns = sc.nextInt();
        float[][] arr = new float[rows][columns];
        System.out.printf("Enter the elements of the array: \n");
        for(int i = 0; i<rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextFloat();
            }
        }
        
        float average1 = average(rows, columns, arr);
        System.out.printf("Average: %.2f", average1);
        
    }
    
    public static float average(int row1, int column1, float[][] arr1){
        float n = row1*column1;
        float sum = 0;
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < column1; j++){
                sum += arr1[i][j];
            }
        }
        
        float average = sum/n;
        return average;
    }
} */

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.printf("Enter number of columns: ");
        int columns = sc.nextInt();
        float[][] arr = new float[rows][columns];
        System.out.printf("Enter the elements of the array:\n");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextFloat();
            }
        }
        
        System.out.printf("Enter start index: ");
        int start = sc.nextInt();
        System.out.printf("Enter end index: ");
        int end = sc.nextInt();
        
        int sum1 = sumAtRange(rows, columns, arr, start, end);
        System.out.printf("Sum: %d", sum1);
    }
    
    public static int sumAtRange(int row1, int column1, float[][] arr1, int start1, int end1){
        float[] arr2 = new float[100];
        int k = 0;
        float sum = 0;
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < column1; j++){
                arr2[k++] = arr1[i][j];
            }
        }
        
        for(int a = start1; a<=end1; a++){
            sum += arr2[a];
        }
        
        int sum1 = (int)sum;
        return sum1;
    }
} */

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the dimensions of the 2D array: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        
        int[][] arr = new int[rows][columns];
        System.out.printf("Enter the elements of the array: \n");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.printf("Enter the target integer: ");
        int target = sc.nextInt();
        sc.close();
        
        int occur = countOccurrences(arr, rows, columns, target);
        System.out.printf("The number of times %d appears in the array is: %d", target, occur);
    }
    
    public static int countOccurrences(int[][] arr1, int row1, int column1, int target1){
        int occurrence = 0;
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < column1; j++){
                if(arr1[i][j] == target1){
                    occurrence++;
                }
            }
        }
        
        return occurrence;
    }
} */

/*
 * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the square array: ");
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        System.out.printf("Enter the elements of the array:\n");
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        boolean result = isSymmetric(arr, N);
        if(result == true){
            System.out.printf("The array is symmetric.");
        }else{
            System.out.printf("The array is not symmetric.");
        }
    }
    
    public static boolean isSymmetric(int[][] arr1, int N1){
        for(int i = 0; i < N1; i++){
            for(int j = 0; j < N1; j++){
                if(arr1[i][j] != arr1[j][i]){
                    return false;
                    }
                }
            }
            return true;
        }
        
    }
 */
