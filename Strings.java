
public class Strings {

    //String output
    /* 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.println("Hello, " + name + "!");
        */

    //String concatenation
    /* 
        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "World";
    
            // Using the + operator
            String result1 = str1 + " " + str2;
    
            // Using the concat method
            String result2 = str1.concat(" ").concat(str2);
    
            System.out.println("Concatenated string (using + operator): " + result1);
            System.out.println("Concatenated string (using concat method): " + result2);
            */

    //String Comparison
        /*public static void main(String[] args) {
            String str1 = "banana";
            String str2 = "banana";

            // Content comparison
            boolean isEqual = str1.equals(str2);

            // Lexicographic comparison
            int result = str1.compareTo(str2);

            System.out.println("Content comparison: " + isEqual);
            System.out.println("Lexicographic comparison: " + result);*/
            
    //String Copying
            public static void main(String[] args) {
                String str1 = "Hello";
                String str2 = str1.substring(0); // Copies the entire string

                System.out.println("Copied string: " + str2);
        

        }
    }

