public class Predefinedcharfunc{
    public static void main(String[]args){
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isDigit('4')); // displays true
		System.out.println(Character.isDigit('c')); // displays false

        char ch = 'a';

		System.out.println("Original character: " + ch); // Original character: a
		System.out.println("Uppercase: " + Character.toUpperCase(ch)); // Uppercase: A
		System.out.println("Lowercase: " + Character.toLowerCase(ch)); // Lowercase: a

        System.out.println(Character.isLetterOrDigit('9')); // displays true
        System.out.println(Character.isWhitespace('\n')); // displays true

        System.out.println(Character.isLowerCase('c')); // displays true
		System.out.println(Character.isUpperCase('c')); // displays false
        System.out.println(Character.isSpaceChar(' ')); // displays true

        System.out.println(Character.isISOControl('\n')); // displays true
		System.out.println(Character.isISOControl('A')); // displays false
        //System.out.println(Character.isPunctuation('.')); // displays true

        System.out.println(Character.isDigit('f')); // displays false
		System.out.println(Character.isDigit('9')); // displays true

		//int value = Character.toDigit('f', 16);
		//System.out.println("Integer value of 'f' in hexadecimal: " + value); // Integer value of 'f' in hexadecimal: 15
    }
}