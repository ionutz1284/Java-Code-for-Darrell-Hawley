package test;

import java.util.Scanner;
import java.util.*;

public class Car {
	public static final double FAVNUMBER = 1.5680;//static means that it can be shared by every Car abject that is being created
	private String model;//declaration of the fields or variables within the  Car class takes place here
	private int weight;
	private boolean hasBeenSold = false;//private mean that it can be accesses by other methods in the class and that's it!
	private byte year;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float mpg;

	protected static int numberOfCars = 0;//protected means it can only be accessed by other code in the packet. here I am declaring and initializing the field numberOfCars 

	static Scanner userinput = new Scanner(System.in);// creating a new Scanner object that will allow us to get input from the keyboard

	public Car() {      // generating the constructor
		numberOfCars++;
		int sumofNumbers = 5 + 1;  //the next 10 lines demonstrates the use of the basic arithmetical operators
		System.out.println("5 + 1 =" + sumofNumbers);

		int diffofNumbers = 5 - 1;
		System.out.println("5 - 1 =" + diffofNumbers);

		int multofNumbers = 5 * 1;
		System.out.println("5 * 1 =" + multofNumbers);

		int divofNumbers = 5 / 1;
		System.out.println("5 / 1 =" + divofNumbers);

		int modofNumbers = 5 % 3;
		System.out.println("5 % 3 =" + modofNumbers);
		System.out.print("Enter the name: \n");
		if (userinput.hasNextLine()) { // if the user enter a series of characters
			this.setModel(userinput.nextLine()); //setting the model of the Car object that has been created; what the user types from the keyboard gets assigned as the model of the Car object
		}
		this.setFavoriteChar(favoriteChar);//  "this" is a way to refer to the object that has been created
		this.setUniqueID();

	}

	public String getModel() { // the next methods are getters and setters that I generated for all the fields. I did modified some of them from the default ones
		return model;
	}

	public void setModel(String name) {
		this.model = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean gethasBeenSold() {
		return hasBeenSold;
	}

	public void setHasBeenSold(boolean hasOwner) {
		this.hasBeenSold = hasOwner;
	}

	public byte getYear() {
		return year;
	}

	public void setYear(byte year) {
		this.year = year;
	}

	public long getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(long uniqueID) { //the next two methods point to the same method. This is an example of a method overload in which the same method can have two instances, but with different parameters.
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}

	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		this.uniqueID = (long) (Math.random() * ((maxNumber - minNumber) + 1)); //a demonstration of casting here; 
		String stringNumber = Long.toString(maxNumber);// converting from primitive to String using toString
		int numberString = Integer.parseInt(stringNumber);// converting from String to a primitive using parseInt
		System.out.println("Unique ID set to " + this.uniqueID);

	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		int randomNumber = (int) (Math.random() * 126) + 1;//Math.random generates random numbers between 0 and 1;
		this.favoriteChar = (char) randomNumber;//converting randomNumber to char; This is an example of using the ASCII table in which every character has a value from 0 to 126.
		if (randomNumber == 32) {
			System.out.println("Favorite character is space");

		} else if (randomNumber == 10) {
			System.out.println("avorite character is Newline");
		}

		else {
			System.out.println("favorite character set to " + this.favoriteChar);
		}

		if ((randomNumber > 97) && (randomNumber < 122)) {
			System.out.println("Favorite charachter set is a lowerCase letter");
		}

		if (((randomNumber > 97) && (randomNumber < 122)) || ((randomNumber > 64) && (randomNumber < 91))) {
			System.out.println("Favorite charachter set is a  letter");
		}

		int WhichisBigger = (50 > randomNumber) ? 50 : randomNumber;

		switch (randomNumber) { //example of using the switch statement
		case 8:
			System.out.println("Favorite Character set to backspace");
			break;

		case 10:
		case 11:
		case 12:
			System.out.println("Favorite Character set to backspace");
			break;

		default:
			System.out.println();
			break;

		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public float getMpg() {
		return mpg;
	}

	public void setMpg(float mpg) {
		this.mpg = mpg;
	}

	protected static void countTo(int StartingNumber) {
		for (int i = StartingNumber; i <= 100; i++) { // in this for statement I am printing to the screen consecutive numbers that start with StartingNumber and go up to 100. 90 does not get printed to the screen, though
			if (i == 90)
				continue;
			System.out.println(i);

		}
	}

	protected static String PrintNumbers(int MaxNumbers) {

		int i = 1; //initializing i outside the while loop
		while (i < (MaxNumbers / 2)) { // printing "i" as long as "i" is smaller than MaxNumbers/2, and incrementing "i" after each print
			System.out.println(i);
			i++;
			if (i == MaxNumbers / 2)
				break;

		}
		Car.countTo(MaxNumbers / 2);
		return "End of printNumbers";

	}

	protected static void guessMynumber() {
		int number;
		do {  //example of using do-while statement. in contrast with "while", here the printing takes place at least once
			System.out.println("Guess number up to 100");
			while (!userinput.hasNextInt()) {
				String numberEntered = userinput.next();
				System.out.printf("%s is not a number\n", numberEntered);
			}
			number = userinput.nextInt();

		} while (number != 50);
	}

	public String alloyUsed() {

		return "Steel or Aluminum";
	}

	public static void frameType(Car randCar) { // a function having as parameter a Car object
		System.out.println("Frame is made our of " + randCar.alloyUsed());// randCar will execute the right alloyused method as part of the polymorphism
	}

	public static void main(String[] args) {  // main function that gets called first

		Car theCars = new Car(); //creating a new car object

	}

}
