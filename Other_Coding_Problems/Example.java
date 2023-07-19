package Factorial;
public class Number{
    static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while(i <= n) {
           fact *= i;
           i++;
        }
        return fact;
}
}
