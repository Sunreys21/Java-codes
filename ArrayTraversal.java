public class ArrayTraversal {
    public static void main(String[]args){
    /*int[] arr = {1, 2, 3, 4, 5};

	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " "); // Accessing and printing each element
	}   */

    /*int[] arr = {1, 2, 3, 4, 5};
    int i = 0;
    	
    while (i < arr.length) {
    	    System.out.print(arr[i] + " "); // Accessing and printing each element
    	    i++;
    	}*/

        /*int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // Adding each element to the sum
		}

		System.out.println("Sum: " + sum);*/

        /*int[] arr = {4, 2, 9, 1, 7};
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i]; // Updating the maximum value
			}
		}

		System.out.println("Maximum value: " + max);*/

        /*int[] arr = {1, 2, 3, 4, 5};

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] *= 2; // Doubling the even elements
			}
		}

		System.out.print("Updated array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
            }*/

            /*int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            };
    
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " "); // Accessing and printing each element
                }
                System.out.println(); // Move to the next row
            }*/

            int[][][] arr = {
                {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
                },
                {
                    {13, 14, 15, 16},
                    {17, 18, 19, 20},
                    {21, 22, 23, 24}
                },
                {
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}
                }
            };
    
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Depth " + i + ":");
                for (int j = 0; j < arr[i].length; j++) {
                    for (int k = 0; k < arr[i][j].length; k++) {
                        System.out.print(arr[i][j][k] + " "); // Accessing and printing each element
                    }
                    System.out.println(); // Move to the next row
                }
                System.out.println(); // Separate each depth with a new line
        }
    }
}

/*
 * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.printf("Enter the elements of the array: \n");
        int[] arr = new int[size];
        
        for(int i=0; i<size; i++){
            System.out.printf("Element %d: ", i);
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        
        System.out.printf("Array with zeros moved to the end: ");
        
        int[] arr2 = new int[size];
        int index = 0;
        for(int j=0; j<size; j++){
            if(arr[j] != 0){
               arr2[index++] = arr[j];
            }
        }
        
        for(int a = 0; a<size; a++){
            System.out.printf("%d ", arr2[a]);
        }
        
    }
}
 */

 /*
  * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.printf("Enter the elements of the array: \n");
        int[] array = new int[size];
        int sum = 0;
        for(int i = 0; i<size; i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        
        sc.close();
        System.out.printf("The sum of the elements is %d", sum);
    }
}
  */

  /*
   * import java.util.Scanner;


public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.printf("Enter the elements of the array: \n");
        int[] array = new int[size];
        
        for(int i =0; i<size; i++){
            System.out.printf("Element %d: ", i);
            array[i] = sc.nextInt();
        }
        
        sc.close();
        
        System.out.printf("Sum of each addition of the elements: \n");
        
        int[] sum = new int[size];
        sum[0] = array[0];
        
        System.out.printf("%d ", sum[0]);
        
        for(int j=1; j<size; j++){
            sum[j] = sum[j-1] + array[j];
            System.out.printf("%d ", sum[j]);
        }
    }
}
   */

   /*
    * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.printf("Enter the elements of the array: \n");
        int[] array = new int[size];
        int large = 0;
        for(int i = 0; i<size; i++){
            System.out.printf("Element %d: ", i);
            array[i] = sc.nextInt();
            if(large < array[i]){
                large = array[i];
            }
        }
        System.out.printf("The largest element in the array is: %d", large);
    }
}
    */

    /*
     * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.printf("Enter the elements of the array: \n");
        int[] array = new int[size];
        
        System.out.printf("Element 0: ");
        array[0] = sc.nextInt();
        System.out.printf("Element 1: ");
        array[1] = sc.nextInt();
        int large = Math.max(array[0], array[1]);
        int secLarge = Math.min(array[0], array[1]);
        
        for(int i = 2; i<size; i++){
            System.out.printf("Element %d: ", i);
            array[i] = sc.nextInt();
            
            if(large < array[i]){
                secLarge = large;
                large = array[i];
            }else if(secLarge < array[i] && large > array[i]){
                secLarge = array[i];
            }
        }
        
        sc.close();
        System.out.printf("The second largest element in the array is: %d", secLarge);
    }
}
     */
