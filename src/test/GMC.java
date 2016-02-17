package test;

public class GMC extends Car {   // class GMC is a subclass of class Car
	public GMC() {

	}

	public String alloyUsed() {
		return "Steel";
	}

	public static void main(String[] args) {
		Car f150 = new Ford();//creating a new Ford object, which is a Car object
		Car sierra = new GMC();// creating a new GMC object, which is also a Car object

		Car[] theCars = new Car[10]; //creating an array of size 10
		theCars[0] = f150;// putting in array box 0 Car object f150
		theCars[1] = sierra;//putting in array box 1 Car object sierra
		System.out.println("f150 frame is made out of: " + theCars[0].alloyUsed());
		System.out.println("Sierra is made out of: " + theCars[1].alloyUsed());
	}
}
