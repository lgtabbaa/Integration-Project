
public class Operations {
	public static void main(String[] args) {
		System.out.print("Please input a number: ");
		int a = Scan.sc.nextInt();
		double h = (double) a;
		System.out.print("Please input a number with a decimal: ");
		double b = Scan.sc.nextDouble();
		System.out.println("You entered: " + h + " and " + b + ".");
		double c = h + b;
		double d = h - b;
		double e = h * b;
		double f = h / b;
		double g = h % b;
		System.out.println("The numbers added: " + c);
		System.out.println("The numbers subtracted: " + d);
		System.out.println("The numbers multiplied: " + e);
		System.out.println("The numbers devided: " + f);
		System.out.println("The numbers modulus: " + g);
	}

	}



