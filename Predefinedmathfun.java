public class Predefinedmathfun{
    public static void main(String[]args){
        double num = 16;
		double result = Math.sqrt(num);

		System.out.printf("Square root of %.2f is %.2f%n", num, result);

        double base = 2;
		double exponent = 3;
		double result1 = Math.pow(base, exponent);

		System.out.printf("%.2f raised to the power of %.2f is %.2f%n", base, exponent, result1);

        double angle = 0.5;
		double sinResult = Math.sin(angle);
		double cosResult = Math.cos(angle);

		System.out.printf("Sine of %.2f is %.2f%n", angle, sinResult);
		System.out.printf("Cosine of %.2f is %.2f%n", angle, cosResult);
    }
}