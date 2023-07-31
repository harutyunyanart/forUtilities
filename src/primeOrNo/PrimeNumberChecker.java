package primeOrNo;

public class PrimeNumberChecker {
    public static boolean IsPrime(int number) {
        if (number <= 0) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(IsPrime(1));
    }
}
