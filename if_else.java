public class if_else {
    public static void main(String[]args){
/*int num = 5;

if (num > 0) {	    
    System.out.println("The number is positive.");
        } else if (num < 0) {
	    System.out.println("The number is negative.");
	} else if (num == 0) {
	    System.out.println("The number is zero.");
	} else {
	    System.out.println("Invalid number.");
	}
    }*/

int num = 10;

if (num > 0) {
	    if (num % 2 == 0) {
	        System.out.println("The number is positive and even.");
	    } else {
	        System.out.println("The number is positive and odd.");
	    }
	} else if (num < 0) {
	    System.out.println("The number is negative.");  
    } else {
	    System.out.println("The number is zero.");
    }
    }
}
