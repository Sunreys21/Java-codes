/*public class exception {
    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            System.out.println(a[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of BOunds");
        } catch(Exception e){
            System.out.printf("General Exception");
        }
    }
}*/

/*public class exception{
    public static void main(String[] args) {
        try {
            System.out.printf("In try ");
            throw new Exception();
        } catch (Exception e) {
            System.out.printf("In catch ");
        } finally{
            System.out.printf("In finally ");
        }
    }
}*/

/*public class exception{
    public static void main(String[] args) {
        int a=8;
        int b=0;
        if(b==0){
            throw new ArithmeticException("Cannot be divided by 0");
        }
        int result = a/b;
        System.out.println(result);
    }
}*/

/*public class exception{
    public static void main(String[]args){
        try {
            String s = null;
            System.out.println(s.length());
            System.out.printf("Hello self ");
            //throw new Exception();
            throw new NullPointerException();
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (NullPointerException e) {
            System.out.println("Hello world");
        }
        catch (Exception e){
            System.out.printf("wow ");
        } finally{
            System.out.printf("wowew\n");
        }
    }*/

/*class MyException extends exception{
    public MyException(String msg){
        super(msg);
    }
}

public class exception{
    public static void main(String[] args) {
        try {
            throw new MyException("Custom error!");
        } catch (MyException e) {
            System.out.println("Caught: " +  e.getMessage());
        }
    }
}*/

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
        String myString = null;
        System.out.printf("Enter a string: ");
        String input = sc.nextLine(); 
        if(!input.startsWith("-")&&!input.endsWith("-")){
            myString = input;
        }
        System.out.println("" + myString.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("myString is still null");
        }finally{
            System.out.println("Everything's over");
        }
    }
} */


/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int age = 16;
            if (age < 18) {
                throw new AgeException(age);
            }
            System.out.println("User is eligible.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            int age = 18;
            if (age < 18) {
                throw new AgeException(age);
            }
            System.out.println("User is eligible.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}class AgeException extends Exception{
    public AgeException(int age){
        super("Age " + age + " is too young.");
    }
} */

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String password = "weakpas";
            if (!isValidPassword(password)) {
                throw new PasswordException();
            }
            System.out.println("Password is valid.");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            String newPassword = "strongerpassword123" ;
            if (!isValidPassword(newPassword)) {
                throw new PasswordException();
            }
            System.out.println("Password is valid.");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8; // A simple example: password should be at least 8 characters
    }
}class PasswordException extends Exception{
    public PasswordException(){
        super("Invalid password");
    }
} */

/*public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Initialize account with a balance of $1000

        try {
            // Simulate some withdrawal operations
            account.withdraw(500.0);
            account.withdraw(800.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}class BankAccount{
    private double balance;
    
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException();
        }else{
            balance -= amount;
            System.out.printf("Withdrawal successful. Remaining balance: %.1f\n", balance);
        }
    }
}class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Insufficient funds for withdrawal.");
    }
} */

/* import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.printf("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.printf("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Quotient: " + a/b);
        }catch(ArithmeticException e){
            System.out.printf("Invalid division");
        }
    }
}*/

/*import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter the size of the array: ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        for(int n = 0; n<size; n++){
            System.out.printf("Enter element %d: ", n+1);
            arr[n] = sc.nextDouble();
        }
        
        System.out.printf("Enter the index of the element to print: ");
        int x = sc.nextInt();
        
        try{
            System.out.printf("Element at index %d: %.2f", x, arr[x]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.printf("Index %d is invalid.", x);
        }
        
    }
} */