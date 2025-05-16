import java.util.Scanner;

public class LoopBreak {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        /*int number;
	        
	        while (true) {
	            System.out.print("Enter a number (-1 to exit): ");
	            number = scanner.nextInt();
	            
	            if (number == -1) {
                break;
	            }
	        
				
	            // Other code
	        }*/

				int[] numbers = {1, 2, 3, 4, 5};
					        int searchNumber = -1;
					        int index = -1;
					        
					        for (int i = 0; i < 5; i++) {
					            if (numbers[i] == searchNumber) {
					                index = i;
					                break;
					            }
					        }
					        
					        if (index != -1) {
					            System.out.println("Element found at index " + index);
					        } else {
					            System.out.println("Element not found");
					        }
							
							scanner.close();
					    }
				}

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a positive integer: ");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        int sqrt2 = (int) sqrt;
        int result = 0;
    
        for(int i = 2; i<=sqrt2; i++){
            result = num%i;
                if(result == 0 ){
                    System.out.printf("%d is not a prime number", num);
                    break;
                }
            }
        
        if(result != 0 ){
                System.out.printf("%d is a prime number", num);
            }
        }
    }*/
			
	
/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        do{
            System.out.printf("Enter the password: ");
            String pass = sc.nextLine();
            if(pass.equals("secret")){
                System.out.printf("Access granted!");
                break;
            }
            else{
                --attempts;
                System.out.printf("Access denied! %d attempts remaining.\n", attempts);
                if(attempts == 0){
                    System.out.printf("Access denied!");
                }
            }
            
        }while(attempts!= 0);
        
        
        
        sc.close();
        
    }
}*/

/*
 import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num[]= new int[100];
        int i = 0;
        int sum = 0;
        
        do{
            System.out.printf("Enter a number: ");
            num[i] = sc.nextInt();
            
            if(num[i]<0){
                break;
            }

        }while(num[i++]>-1);
        sc.close();
        
        for(int n = 0; n<=i; n++){
            if(num[n]>0){
            sum += num[n];
            }
        }
        
        System.out.printf("Sum of positive numbers: %d", sum);
        
        
    }
}
 */
	
 /*
  import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(n != 0){
            System.out.printf("Enter a number: ");
            n = sc.nextInt();
            if(n == 0){
                break;
            }
            System.out.printf("Number: %d\n", n);
        }
    }
}
  */

  /*
   * import java.util.Scanner; 

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int num[] = new int[100];
        int i = 0;
        int k = 0;
        do{
            System.out.printf("Enter a number: ");
            num[i] = sc.nextInt();
            if(num[i]>=0){
                k++;
            }
        }while(num[i++]!=0);
        
        sc.close();
        
        int sum = 0;
        int j;
        for(j=0; j<i-1; j++){
            if(num[j]<0){
                continue;
            }
            sum += num[j];
        }
        

        double avg = (double) sum/(k-1);
        System.out.printf("Average: %.2f", avg);
    }
}
   */

   /*
    * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int limit = sc.nextInt();
        
        for(int i = 0; i<= limit; i+=2){
            if(i==10){
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
    */
