package Complex;

public class Complex {
	    double real, imaginary;

	    // Constructor
	    Complex(double r, double i) {
	        real = r;
	        imaginary = i;
	    }

	    // Addition
	    Complex add(Complex c) {
	        return new Complex(
	            real + c.real,
	            imaginary + c.imaginary
	        );
	    }

	    // Multiplication
	    Complex multiply(Complex c) {
	        return new Complex(
	            real * c.real - imaginary * c.imaginary,
	            real * c.imaginary + imaginary * c.real
	        );
	    }

	    // Copy method
	    Complex copy() {
	        return new Complex(real, imaginary);
	    }

	    // Calculate magnitude
	    double magnitude() {
	        return Math.sqrt(real * real + imaginary * imaginary);
	    }

	    // Compare magnitude
	    String compareMagnitude(Complex c) {
	        if (magnitude() > c.magnitude()) {
	            return "First number is greater";
	        } else if (magnitude() < c.magnitude()) {
	            return "Second number is greater";
	        } else {
	            return "Both are equal";
	        }
	    }

	    // Display complex number
	    void display() {
	        System.out.println(real +
	            (imaginary >= 0 ? " + " : " - ") +
	            Math.abs(imaginary) + "i");
	    }
	    public static void main(String[] args) {

	        Complex a = new Complex(3, 2);
	        Complex b = new Complex(1, 4);

	        Complex copied = a.copy();

	        System.out.print("Addition: ");
	        a.add(b).display();

	        System.out.print("Multiplication: ");
	        a.multiply(b).display();

	        System.out.println("Magnitude comparison: "
	            + a.compareMagnitude(b));

	        a.real = 99;

	        System.out.print("Original after change: ");
	        a.display();

	        System.out.print("Copied object: ");
	        copied.display();
	    }
	}
