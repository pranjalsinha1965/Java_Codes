import Factorial.Number;
public class Demo{
    public static void main(String args[]){
        int n = 7, r = 3, comb, per;
        per = find_factorial(n) / find_Factorial(n-r);
        System.out.println("Permutation: " + per);
        comb = find_factorial(n) / (_find_factorial(r) * find_factorial(n-r));
        System.out.println("Combination: " + comb);
    }
}