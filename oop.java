

/*class Person {
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to display person's information
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class oop {
	public static void main(String[] args) {
		// Create instances of Person class
		Person person1 = new Person("John", 30);
		Person person2 = new Person("Jane", 25);
        
		// Call the displayInfo method for each person
		person1.displayInfo();
		person2.displayInfo();
	}
}*/

/*class Car {
	private String make;
	private String model;
	private int year;

	// Parameterized constructor
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Method to display car information
	public void displayInfo() {
		System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
	}
}

public class oop {
	public static void main(String[] args) {
		// Create instances of Car class
		Car car1 = new Car("Toyota", "Camry", 2022);
		Car car2 = new Car("Ford", "Mustang", 2023);

		// Call the displayInfo method for each car
		car1.displayInfo();
		car2.displayInfo();
	}
}*/

/*class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
}

public class oop {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		System.out.println("Initial balance: " + account.getBalance());

		account.deposit(1000);
		System.out.println("After deposit: " + account.getBalance());

		account.withdraw(500);
		System.out.println("After withdrawal: " + account.getBalance());
	}
}*/

/*class Animal {
	public void makeSound() {
		System.out.println("Some generic animal sound.");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Woof! Woof!");
	}
}

public class oop{
	public static void main(String[] args) {
		// Create instances of Animal and Dog classes
		Animal genericAnimal = new Animal();
		Dog dog = new Dog();

		// Call methods from both classes
		genericAnimal.makeSound();
		dog.makeSound();
		dog.bark();
	}
}*/

/*class A{
	void show(){
		System.out.println("Class A");
	}
}

class B extends A{
	void show(){
		System.out.println("Class B");
	}
}

public class oop{
	public static void display(A obj){
		obj.show();
	}
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		display(b);
	}
}*/

//Abstract class

/*abstract class Shape {
	public abstract void draw();

	public void displayInfo() {
		System.out.println("This is a shape.");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a circle.");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle.");
	}
}

public class oop {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.displayInfo();
		circle.draw();

		Rectangle rectangle = new Rectangle();
		rectangle.displayInfo();
		rectangle.draw();
	}
}*/

/*abstract class Animal{
        private String name;
        
        public Animal(String name){
            this.name = name;
        }
        
        public abstract void makeSound();
        
        public String getName(){
            return name;
        }
    }
    
    class Dog extends Animal{
        public Dog(String name){
            super(name);    
        }
        @Override
        public void makeSound(){
            System.out.print("Woof! My name is " + getName());
        }
    }
*/

//Shape abstract class
/*abstract class Shape {
    private String name;
    private String color;
    private boolean isFlat;
    
    public Shape(String name, String color, boolean isFlat){
        this.name = name;
        this.color = color;
        this.isFlat = isFlat;
    }
    
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public boolean getIsFlat(){
        return isFlat;
    }
    public void setColor(String color){
        this.color = color;
    }
}

abstract class TwoDShape extends Shape{
    private int numberOfSides;
    
    public TwoDShape(String name, String color, int numberOfSides){
        super(name, color, true);
        this.numberOfSides = numberOfSides;
    }
    
    public int getNumberOfSides(){
        return numberOfSides;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

abstract class ThreeDShape extends Shape{
    public ThreeDShape(String name, String color){
        super(name, color, false);
    }
    public abstract double getSurfaceArea();
    public abstract double getVolume();
}

class Square extends TwoDShape{
    private double lengthOfSide;
    
    public Square(String color, double lengthOfSide){
        super("Square", color, 4);
        this.lengthOfSide = lengthOfSide;
    }
    public double getLengthOfSide(){
        return lengthOfSide;
    }
    public double getArea(){
        return lengthOfSide*lengthOfSide;
    }
    public double getPerimeter(){
        return 4*lengthOfSide;
    }
}

class RectangularPrism extends ThreeDShape{
    private double length;
    private double width;
    private double height;
    
    public RectangularPrism(String color, double length, double width, double height){
        super("Rectangular Prism", color);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getSurfaceArea(){
        return (2*(width*length+height*length+height*width));
    }
    public double getVolume(){
        return width*height*length;
    }
} */

/*
abstract class Influencer {
    private String name;
    private String platform;
    
    public Influencer(String name, String platform){
        this.name = name;
        this.platform = platform;
    }
    
    public String toString(){
        return String.format("I'm " + name + " an influencer at " + platform);
    }
    
    abstract void doLiveStream();
}

class FacebookInfluencer extends Influencer{
    public FacebookInfluencer(String name){
        super(name, "Facebook");
    }
    public void doLiveStream(){
        System.out.printf("Doing livestream on Facebook, please send stars\n");
    }
}

class TiktokInfluencer extends Influencer{
    public TiktokInfluencer(String name){
        super(name, "Tiktok");
    }
    public void doLiveStream(){
        System.out.printf("Doing livestream on Tiktok, please send love\n");
    }
}*/

/*abstract class HypotheticalAbstract1 {
    protected int a;
    protected int b;
    
    public HypotheticalAbstract1(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public abstract int getValue1();
    public abstract int getValue2();
}

abstract class HypotheticalAbstract2 extends HypotheticalAbstract1{
    public HypotheticalAbstract2(int a, int b){
        super(a,b);
    }
    public int getValue1(){
        return a+b;
    }
}

abstract class HypotheticalAbstract3 extends HypotheticalAbstract2{
    public HypotheticalAbstract3(int a, int b){
        super(a,b);
    }
    public int getValue2(){
        return a*b;
    }
}

class HypotheticalNonAbstract extends HypotheticalAbstract3{
    public HypotheticalNonAbstract(int a, int b){
     super(a,b);   
    }
    
} */

//Interface
/*
 * interface Shape {
	void area();
}

interface Polygon extends Shape {
	void sides();
}

class Triangle implements Polygon {
	@Override
	public void area() {
		System.out.println("Calculating area of a triangle.");
	}

	@Override
	public void sides() {
		System.out.println("A triangle has 3 sides.");
	}
}

public class Main {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.area();
		triangle.sides();
	}
}
 */
/*
interface VehicleControls{
    void startEngine();
    void stopEngine();
    void turnOnHeadlights();
    void turnOffHeadlights();
    void honk();
}

class Car implements VehicleControls{
    @Override
    public void startEngine(){
        System.out.println("Engine started.");
    }
    @Override
    public void stopEngine(){
        System.out.println("Engine stopped.");
    }
    @Override
    public void turnOnHeadlights(){
        System.out.println("Headlights turned on.");
    }
    @Override
    public void turnOffHeadlights(){
        System.out.println("Headlights turned off.");
    }
    @Override
    public void honk(){
        System.out.println("Horn sounds.");
    }
}
    */

/*// Start typing your code here
interface PolygonInterface{
    public double getArea();
    public double getPerimeter();
}

class Square implements PolygonInterface{
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
    public double getArea(){
        return side*side;
    }
    
    public double getPerimeter(){
        return 4*side;
    }
}

class Rectangle implements PolygonInterface{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}

class Trapezoid implements PolygonInterface{
    private double a;
    private double b;
    private double c;
    private double d;
    private double height;
    
    public Trapezoid(double a, double b, double c, double d, double height){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.height = height;
    }
    
    public double getArea(){
        return ((a+b)/2)*height;
    }
    
    public double getPerimeter(){
        return a+b+c+d;
    }
} */

/*interface MusicControls{
    public void play();
    public void pause();
    public void stop();
}
public class BasicPlayer implements MusicControls{
    @Override
    public void play(){
        System.out.printf("Music is playing.\n");
    }
    @Override
    public void pause(){
        System.out.printf("Music is paused.\n");
    }
    @Override
    public void stop(){
        System.out.printf("Music has stopped.\n");
    }
}
 */

 /*interface Clickable{
    public void click();
}

interface Resizable{
    public void resize(int newWidth, int newHeight);
    public void resize(int multiplier);
}
abstract class AbstractButton implements Clickable, Resizable{
    protected String title;
    protected int width;
    protected int height;
    protected boolean isClicked;
    
    public AbstractButton(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;
    }
    
    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title = title;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(){
        this.height = height;
    }
}

class Checkbox implements Clickable{
    private boolean isChecked;
    private String text;
    
    public Checkbox(String text){
        this.text = text;
    }
    
    public void click(){
        isChecked = !isChecked;
        if(isChecked)
            System.out.printf("Checkbox is checked\n");
        else
            System.out.printf("Checkbox is unchecked\n");
    }
    
    @Override
    public String toString(){
        return String.format("Checkbox (Check me - Checked = " + isChecked + ")");
    }
}

class NormalButton extends AbstractButton{
    public NormalButton(String title, int width, int height){
        super(title, width, height);
    }
    
    public void click(){
        isClicked = !isClicked;
        System.out.printf(isClicked ? "Button is clicked\n" : "Button is not clicked anymore\n");
    }
    
    public void resize(int newWidth, int newHeight){
        this.width = newWidth;
        this.height = newHeight;
    }
    public void resize(int multiplier){
        this.width *= multiplier;
        this.height *= multiplier;
    }
    
    @Override
    public String toString(){
        return "NormalButton ((" + width + 
                "px, " + height + "px) - Clicked = " + isClicked + ")";
    }
} */

//Polymorphism
/*
interface IShape {
	void draw();
}

// Classes implementing the IShape interface
class Circle implements IShape {
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Square implements IShape {
	public void draw() {
		System.out.println("Drawing a square");
	}
}

public class oop {
	public static void main(String[] args) {
		IShape circle = new Circle();
		IShape square = new Square();

		circle.draw();
		square.draw();
	}
}*/

/*public abstract class Bird{
    public abstract void makeSound();
}
public class Sparrow extends Bird{
    @Override
    public void makeSound(){
        System.out.printf("Chirp Chirp");
    }
}public class Parrot extends Bird{
    @Override
    public void makeSound(){
        System.out.printf("Tweet Tweet");
    }
}import java.util.ArrayList;
public class BirdCage{
    public void makeBirdSounds(ArrayList<Bird>birds){
        for(Bird bird : birds){
            bird.makeSound();
            System.out.printf("\n");
        }
    }
} */

/*public abstract class Shape{
    public abstract double getArea();
    public abstract double getPerimeter();
}public class Square extends Shape{
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public double getPerimeter(){
        return 4*side;
    }
}public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*length + 2*width;
    }
}import java.util.ArrayList;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override
    public double getPerimeter(){
        return a+b+c;
    }
}

class ShapeCollection{
    private ArrayList<Shape> shapes;
    
    public ShapeCollection(ArrayList<Shape>shapes){
        this.shapes = shapes;
    }
    
    public void calculateAndPrintAreaAndPerimeter(){
        for(Shape shape : shapes){
        System.out.printf("Area: %.2f\n", shape.getArea());
        System.out.printf("Perimeter: %.2f\n\n", shape.getPerimeter());
        }
        

    }
} */

/*public abstract class Pet{
    private String type;
    private boolean isFriendly;
    
    public Pet(String type, boolean isFriendly){
        this.type = type;
        this.isFriendly = isFriendly;
    }
    
    public String getType(){
        return type;
    }
    public boolean getIsFriendly(){
        return isFriendly;
    }
    abstract public void makeNoise();
    public String toString(){
        return String.format("Pet " + type + " is " + isFriendly);
    }
}

class Cat extends Pet{
    public Cat(){
        super("cat", true);
    }
    @Override
    public void makeNoise(){
        System.out.printf("Meow!");
    }
}

class Lion extends Pet{
    public Lion(){
        super("lion", false);
    }
    @Override
    public void makeNoise(){
        System.out.printf("Roar!");
    }
}

class Dog extends Pet{
    private String breed;
    
    public Dog(String breed){
        super("dog", true);
        this.breed = breed;
    }
    @Override
    public void makeNoise(){
        System.out.printf("Arf!");
    }
    @Override
    public String toString(){
        return String.format("Pet %s is %b %s", getType(), getIsFriendly(), breed);
    }
}import java.util.ArrayList;
public class PetHouse{
    public void makeNoise(ArrayList<Pet> pets){
        for(Pet pet: pets){
            pet.makeNoise();
            System.out.printf("\n");
        }
    }
} */

/*interface MediaPlayer{
    void playAudio();
    void playVideo();
}public class MP3Player implements MediaPlayer{
    @Override
    public void playAudio(){
        System.out.printf("MP3Player playing audio.\n");
    }
    @Override
    public void playVideo(){
        System.out.printf("MP3Player cannot play video.\n");
    }
}public class MP4Player implements MediaPlayer{
    @Override
    public void playAudio(){
        System.out.printf("MP4Player playing audio.\n");
    }
    @Override
    public void playVideo(){
        System.out.printf("MP4Player playing video.\n");
    }
}public class Device{
    private MediaPlayer mediaPlayer;
    
    public Device(MediaPlayer mediaPlayer){
        this.mediaPlayer = mediaPlayer;
    }
    public void playAudio(){
        mediaPlayer.playAudio();
    }
    public void playVideo(){
        mediaPlayer.playVideo();
    }
} */

/*public class InputElement {
    private int maxLength;
    private String value;
    
    public InputElement(int maxLength, String value) {
        this.maxLength = maxLength;
        this.value = value;
    }
    
    public InputElement(int maxLength) {
        this(maxLength, "");
    }
    
    public boolean validate() {
        return (value.length() >= 1 && value.length() <= maxLength);
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(char c) {
        if (c == '/') {
            if (!value.isEmpty()) {
                value = value.substring(0, value.length() - 1);
            }
        } else {
            String newValue = value + c;
            if (newValue.length() <= maxLength) {
                value = newValue;
            }
        }
    }
}
class PasswordInputElement extends InputElement {
    private char[] allowedCharacters;
    
    public PasswordInputElement(int maxLength, char[] allowedCharacters) {
        super(maxLength); // Now using the one-param constructor
        this.allowedCharacters = allowedCharacters;
    }
    
    @Override
    public boolean validate() {
        if (!super.validate()) return false;
        
        String value = getValue();
        for (char c : value.toCharArray()) {
            boolean found = false;
            for (char allowed : allowedCharacters) {
                if (c == allowed) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }
}
class CustomPasswordInputElement extends PasswordInputElement {
    
    public CustomPasswordInputElement(int maxLength) {
        super(maxLength, new char[]{'J', 'r', 'v', 'D'});
    }
}public class PasswordField {
    public void validate(String password, PasswordInputElement passwordInputElement) {
        passwordInputElement.setValue('/');
        
        for (char c : password.toCharArray()) {
            passwordInputElement.setValue(c);
        }
        boolean isValid = passwordInputElement.validate();
        System.out.println("Password validation result: " + isValid);
    }
} */