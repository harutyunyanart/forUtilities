import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter  non-negative number");
            while (!scanner.hasNextInt()) {
                System.out.println("invalid input.Enter a non-negative integer");
                scanner.nextInt();
            }
            number = scanner.nextInt();
        } while (number < 0);

        int factorial = calculateFactorial(number);
        System.out.println("factorial of" + number + "is" + factorial);

    }

    private static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
