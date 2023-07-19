// Java Program to Add Two Complex Numbers

// Importing all utility classes
import java.util.*;

// Class 1
// Helper class
// User Defined Complex class
class Complex {

	// Declaring variables
	int real, imaginary;

	// Constructors of this class

	// Constructor 1 - Empty Constructor
	Complex() {}

	// Constructor 2

	// Parameterised constructor
	// Constructor to accept
	// real and imaginary part
	Complex(int tempReal, int tempImaginary)
	{
		real = tempReal;
		imaginary = tempImaginary;
	}

	// Method
	// To add two complex number
	Complex addComp(Complex C1, Complex C2)
	{
		// Creating temporary variable
		Complex temp = new Complex();

		// Adding real part of complex numbers
		temp.real = C1.real + C2.real;

		// Adding Imaginary part of complex numbers
		temp.imaginary = C1.imaginary + C2.imaginary;

		// Returning the sum
		return temp;
	}
}

// Class 2
// Main Class
public class Add_Complex {

	// Main function
	public static void main(String[] args)
	{

		// First Complex number
		Complex C1 = new Complex(3, 2);

		// printing first complex number
		System.out.println("Complex number 1 : " + C1.real
						+ " + i" + C1.imaginary);

		// Second Complex number
		Complex C2 = new Complex(9, 5);

		// Printing second complex number
		System.out.println("Complex number 2 : " + C2.real
						+ " + i" + C2.imaginary);

		// Storing the sum
		Complex C3 = new Complex();

		// Calling addComp() method
		C3 = C3.addComp(C1, C2);

		// Printing the sum
		System.out.println("Sum of complex number : "
						+ C3.real + " + i"
						+ C3.imaginary);
	}
}
