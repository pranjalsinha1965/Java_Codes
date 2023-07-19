// Java program to find factorial of given number

class Number {

	// Method to find factorial of the given number
	static int find_factorial(int n)
	{
		if(n == 0)
		return 1;
		int i = n, fact = 1;
		while (n / i != n) {
			fact = fact * i;
			i--;
		}
		return fact;
	}

	// Driver method
	public static void main(String[] args)
	{
		int num = 5;
		System.out.println(
			"Factorial of " + num
			+ " is " + find_factorial(5));
	}
}
