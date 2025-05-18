public class PredefinedStringfunc {
    public static void main(String[]args){
        /*String str = "Hello, World!";
		int length = str.length();

		System.out.println("Length of the string: " + length);

        String str1 = "Hello, ";
		String str2 = "World!";
		String concatenated = str1.concat(str2);

		System.out.println("Concatenated string: " + concatenated);

        String str3 = "hello";
		String str4 = "HELLO";

		boolean isEqual = str3.equals(str4); // returns false
		boolean isEqualIgnoreCase = str3.equalsIgnoreCase(str4); // returns true

		System.out.println("isEqual: " + isEqual);
		System.out.println("isEqualIgnoreCase: " + isEqualIgnoreCase);

        String str5 = "Hello, World!";
		char ch = str5.charAt(4);

		System.out.println("Character at index 4: " + ch);

        String stra = "Hello, World!";
		int index1 = stra.indexOf('o'); // returns 4
		int index2 = stra.indexOf("World"); // returns 7
		int index3 = stra.indexOf("Java"); // returns -1

		System.out.println("Index of 'o': " + index1);
		System.out.println("Index of 'World': " + index2);
		System.out.println("Index of 'Java': " + index3);*/

        //String Manipulation and Searching Operations
        String str = "Hello, World!";
		boolean startsWithHello = str.startsWith("Hello"); // returns true
		boolean endsWithWorld = str.endsWith("World!"); // returns true

		System.out.println("Starts with 'Hello': " + startsWithHello);
		System.out.println("Ends with 'World!': " + endsWithWorld);

		String str2 = "Hello, World!";
		String substring1 = str2.substring(7); // returns "World!"
		String substring2 = str2.substring(0, 5); // returns "Hello"

		System.out.println("Substring 1: " + substring1);
		System.out.println("Substring 2: " + substring2);

        String str3 = "Hello, World!";
		String substring3 = str3.substring(7); // returns "World!"
		String substring4 = str3.substring(0, 5); // returns "Hello"

		System.out.println("Substring 1: " + substring3);
		System.out.println("Substring 2: " + substring4);
    }
}
