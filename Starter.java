
// Laila Tabbaa
// First computer program, a variety of examples to show my knowledge on programming.
//a variable in Java is is a piece of memory that can contain a data value.
//		1. byte: 8-bit signed two's compliment integer. Minimum value of –128 and maximum of 127.
//		It can be useful in saving information in large arrays. It can also be used in place of int, It can clarify your code on how limited the array is.
//		*2. short: 16-bit signed two's compliment integer. It has a minimum value of –32,768 and max value of 32,767. 
//		3. int: 32-bit signed two's compliment integer. It has a minimum value of –2^31 and max of 2^31-1. Use int to assign integers. 
//		4. long: 64-bit two's compliment integer. Minimum value of –2^63 and max value of 2^63-1. You can use the long data type to represent a 64-bit 
//		long data type that is unsigned. Use this date type when int range is not large enough. 
//		5. float: a single-precision 32-bit IEEE 754 floating point. It has a abnormally large range of values. 
//		Used if you need to save numbers in large arrays of floating point numbers. Should never be used for precise values such as currency.
//		6. double: is a double-precision 64 –bit IEEE 754 floating point. Abnormally large range of values.  This is usually the default data type for using decimals. 
//		Never use this for default values. 
//		7. boolean: The boolean data type only has two possible values, true or false.
//		8. char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive). a Palindrome")

public class Starter {
	public static void main(String[] args) {
		System.out.println("Please enter your name: ");
		String name = Scan.sc.nextLine();

		System.out.println("Welcome to the beginning of my program " + name + "\n"
				+ "This program will calculate your weight based on the gravitational pull of a specified planet.");
		String answer;
		String[] pick = { "Yes", "No" };
		boolean correctInput = false;
		
		while (!correctInput) {
			System.out.println("Would you like to continue? Please type Yes or No.");
			answer = Scan.sc.nextLine();
			if (answer.equalsIgnoreCase(pick[0])) {
				System.out.println("Let's continue!");
				correctInput = true;
				double mass = gettingUserWeight();
				System.out.println("Your overall mass is: " + mass);
				String[ ] namePlanets = {"1. Mercury", "2. Venus", "3. Mars", "4. Jupiter", "5. Saturn", "6. Uranus", "7. Neptune"};
				System.out.println("Please choose the number of the planet you would like your weight to be calculated on: ");
				System.out.print(namePlanets[0] + "\t" +
						namePlanets[1] + "\n" +
						namePlanets[2] + "\t" + "\t" +
						namePlanets[3] + "\n" +
						namePlanets[4] + "\t" +
						namePlanets[5] + "\n" +
						namePlanets[6] + "\n" +
						"Number: "); 
				int planet = Scan.sc.nextInt();
		        String planetString;
		        switch (planet) {
		            case 1:  planetString = "Mercury";
		            			System.out.println("You picked Mercury,");
		            			double resultMerc= mass * 3.7;
		            			System.out.println("Your weight would be: " + resultMerc + " lbs.");
		                     break;
		            case 2:  planetString = "Venus";
		            			System.out.println("You picked Venus,");
		            			double resultVen= mass * 8.87;
		            			System.out.println("Your weight would be: " + resultVen + " lbs.");
		                     break;
		            case 3:  planetString = "Mars";
		            			System.out.println("You picked Mars,");
		            			double resultMars= mass * 3.711;
		            			System.out.println("Your weight would be: " + resultMars + " lbs.");
		                     break;
		            case 4:  planetString = "Jupiter";
		            			System.out.println("You picked Jupiter,");	
		            			double resultJupit= mass * 24.79;
		            			System.out.println("Your weight would be: " + resultJupit + " lbs.");
		                     break;
		            case 5:  planetString = "Saturn";
		            			System.out.println("You picked Saturn,");
		            			double resultSatur= mass * 10.44;
		            			System.out.println("Your weight would be: " + resultSatur + " lbs.");
		                     break;
		            case 6:  planetString = "Uranus";
		            			System.out.println("You picked Uranus,");
		            			double resultUran= mass * 8.69;
		            			System.out.println("Your weight would be: " + resultUran + " lbs.");
		                     break;
		            case 7:  planetString = "Neptune";
		            			System.out.println("You picked Neptune,");
		            			double resultNeptu= mass * 11.15;
		            			System.out.println("Your weight would be: " + resultNeptu + " lbs.");
		                     break;
		            default: planetString = "Invalid number";
		                     break;
		        }	
			} else if (answer.equalsIgnoreCase(pick[1])) {
				System.out.println("Maybe next time.");
				correctInput = true;
			} else {
				System.out.println("Incorrect input, please try again.");
			}
		} // end bracket of while loop
		
		Scan.sc.close();
	} // end bracket of main method
	
	// static means belonging to the class, not to the object
	//method in main class returning a double, there are no parameters
	public static double gettingUserWeight () {
		System.out.println("Please enter your weight in lbs: ");
		double earthWeight = Scan.sc.nextDouble();
		CalculatingMass personMass = new CalculatingMass(earthWeight);
		return personMass.getMass();	
	}
} // end bracket of main class
