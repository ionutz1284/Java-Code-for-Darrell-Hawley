package test;

import java.util.Scanner;
import java.util.*;

public class Car {
	public static final double FAVNUMBER = 1.5680;
	private String model;
	private int weight;
	private boolean hasBeenSold = false;
	private byte year;
	private long uniqueID;
	private char favoriteChar;
	private double speed;
	private float mpg;

	protected static int numberOfCars = 0;

	static Scanner userinput = new Scanner(System.in);

	public Car() {
		numberOfCars++;
		int sumofNumbers = 5 + 1;
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
		if (userinput.hasNextLine()) {
			this.setModel(userinput.nextLine());
		}
		this.setFavoriteChar(favoriteChar);
		this.setUniqueID();

	}

	public String getModel() {
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

	public void setUniqueID(long uniqueID) {
		this.uniqueID = uniqueID;
		System.out.println("Unique ID set to: " + this.uniqueID);
	}

	public void setUniqueID() {
		long minNumber = 1;
		long maxNumber = 1000000;
		this.uniqueID = (long) (Math.random() * ((maxNumber - minNumber) + 1));
		String stringNumber = Long.toString(maxNumber);
		int numberString = Integer.parseInt(stringNumber);
		System.out.println("Unique ID set to " + this.uniqueID);

	}

	public char getFavoriteChar() {
		return favoriteChar;
	}

	public void setFavoriteChar(char favoriteChar) {
		int randomNumber = (int) (Math.random() * 126) + 1;
		this.favoriteChar = (char) randomNumber;
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

		switch (randomNumber) {
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
		for (int i = StartingNumber; i <= 100; i++) {
			if (i == 90)
				continue;
			System.out.println(i);

		}
	}

	protected static String PrintNumbers(int MaxNumbers) {

		int i = 1;
		while (i < (MaxNumbers / 2)) {
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
		do {
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

	public static void frameType(Car randCar) {
		System.out.println("Frame is made our of " + randCar.alloyUsed());
	}

	public static void main(String[] args) {

		Car theCars = new Car();

	}

}
