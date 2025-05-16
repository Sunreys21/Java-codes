public class Array1d {
        public static void main(String[] args) {
            /*int[] numbers = new int[5];  // Declaration of an integer array
    
            numbers[0] = 10;  // Assigning a value to the first element
            numbers[1] = 20;  // Assigning a value to the second element
    
            int sum = numbers[0] + numbers[1];  // Accessing and performing operations on array elements
    
            System.out.println("Sum: " + sum);  // Output the sum of the first and second elements*/

        int[] numbers = {10, 20, 30, 40, 50};  // Declaration and initialization of an integer array
            
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");  // Printing each element of the array
        }
    }
}

/*
 * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter 8 characters: \n");
        char[] input = new char[8];
        int j=0;
        for(int i = 0; i < 8; i++){
            
            input[i] = sc.next().charAt(0);
            
            if(input[i] == 'a' || input[i] == 'A' || input[i] == 'e' || input[i] == 'E' || 
            input[i] == 'i' || input[i] == 'I' || input[i] == 'o' || input[i] == 'U' || input[i] == 'u'){
                j++;
            }
        }
        
        sc.close();
        
        System.out.printf("Number of vowel elements: %d", j);
    }
}
 */

 /*
  * public class Main{
    public static void main(String[]args){
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        for(int i= 0; i<num.length; i++){
            System.out.printf("%d ", num[i]);
        }
        
    }
}
  */

  /*
   * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter 5 integer numbers: \n");
        int[] num = new int[5];
        int sum = 0;
        
        for(int i = 0; i<5; i++){
            num[i] = sc.nextInt();
        }
        for(int j=0; j<5; j++){
            sum += num[j];
        }
        
        System.out.printf("Sum: %d", sum);
    }
}
   */

   /*
    * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter 6 double values: \n");
        double[] num = new double[6];
        
        for(int i=0; i<6; i++){
            num[i] = sc.nextDouble;
        }
        
        System.out.printf("Arrat elements: \n");
        for(int j=0; j<6; j++){
            System.out.printf("%.3f\t", num[j]);
        }
    }
}
    */

    /*
     * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter 10 floating-point numbers: \n");
        float[] num = new float[10];
        
        for(int i=0; i<10; i++){
            num[i] = sc.nextFloat();
        }
        sc.close(); 
        
        float sum = 0;
        
        for(int j=0; j<10; j++){
            sum+= num[j];
        }
        
        float avg = sum/10;
        System.out.printf("The average is: %.2f", avg);
    }
}
     */
