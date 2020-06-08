package javaProject;

public class HelloWorld {
	public static void main(String[] arg) {
		System.out.println("Hello World!");
		System.out.println("Hello World Ishaan!");
		System.out.println("Hello World CHERRY!");
		System.out.println("Hello");
		// boolean
		boolean isCar = false;
		if (!isCar)
			System.out.println("Car is available!");
		isCar = true;
		boolean WasCar = isCar ? true : false;
		if (isCar)
			System.out.println("isCar was true");
		int ageClient = 26;
		// there are three conditions 1.(ageClient <= 26) ? 2. true 3. :false;
		// summary of operators. look up in the google.
		// http://docs.oracle.com/javase/tutorial/java
		boolean isEighteenOrOver = (ageClient <= 26) ? true : false;
		if (isEighteenOrOver) {
			System.out.println("The client is adult");
		}

		// challenges from 39 video.
		// int num1 = 20.00;
		double num = 20.00d;
		double num2 = 80.00d;
		double sum = (num + num2) * 100.00d;
		System.out.println( "sum =" +sum);
		double remainder = sum % 60.00;
		System.out.println("remainder =  "+ remainder);
		boolean checkRemainder = remainder == 0 ? true : false;
		System.out.println( "remainder = " + checkRemainder);
		// checked on the calculator.
		if (checkRemainder) {
			System.out.println("checkRemainder is true");
		} else {
			System.out.println("Got some remainder! checkRemainder is not ture");
		}
	}
}