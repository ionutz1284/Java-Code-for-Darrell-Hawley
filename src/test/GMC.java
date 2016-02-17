package test;

public class GMC extends Car {
	public GMC() {

	}

	public String alloyUsed() {
		return "Steel";
	}

	public static void main(String[] args) {
		Car f150 = new Ford();
		Car sierra = new GMC();

		Car[] theCars = new Car[10];
		theCars[0] = f150;
		theCars[1] = sierra;
		System.out.println("f150 frame is made out of: " + theCars[0].alloyUsed());
		System.out.println("Sierra is made out of: " + theCars[1].alloyUsed());
	}
}
