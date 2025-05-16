public class LoopContinue {
    	    public static void main(String[] args) {
        	        /*for (int i = 1; i <= 10; i++) {
        	            if (i % 2 == 1) {
        	                continue;
        	            }
        	            System.out.print(i + " ");
        	        }*/

					
						
			/*int i = 0;
				while (i < 10) {
					i++;
					if (i == 5 || i == 7) 
						continue;
				
                    if(i==6 || i == 3)

					System.out.print(i + " ");
					}
				}
			}*/

            int i = 10;
            if (i > 5)
            System.out.print("Oten");
            if (i > 8)
            System.out.print("Oten");


			/*
			 import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        System.out.printf("Prime factors of %d (excluding multiples of 3): ", num);
        
        if(num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
        
        for(int i = 3; i<= num; i+=2){
            if(i%3==0){
                continue;
            }
            
            while(num % i == 0){
                System.out.printf("%d ", i);
                num /= i;
            }
        }
        
        if (num > 2 && num % 3 != 0) {
            System.out.print(num);
        }
    }
}
			 */

			 /*
			  * import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = sc.nextInt();
        
        for(int i = 1; i<=number; i++){
            if(i == 4){
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
			  */
            }
        }
