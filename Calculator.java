package Calculator;

public class Calculator {

	    // Addition of two integers
	    int calculate(int a, int b) {
	        return a + b;
	    }

	    // Multiplication of two double values
	    double calculate(double a, double b) {
	        return a * b;
	    }

	    // Find largest of three integers
	    int calculate(int a, int b, int c) {
	        return Math.max(a, Math.max(b, c));
	    }

	    // Subtraction of integer and double
	    double calculate(int a, double b) {
	        return a - b;
	    }

	    public static void main(String[] args) {

	        Calculator c = new Calculator();

	        System.out.println("Sum = " + c.calculate(10, 20));

	        System.out.println("Product = " + c.calculate(2.5, 4.0));

	        System.out.println("Largest = " + c.calculate(10, 30, 20));

	        System.out.println("Difference = " + c.calculate(10, 4.5));
	    }
	}

