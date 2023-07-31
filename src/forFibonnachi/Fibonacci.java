package forFibonnachi;

public class Fibonacci {
    public static void main(String[] args) {
//        int n=10;
//        Long[] FibonacciNumbers = new Long[n];
//        FibonacciNumbers[0] = 0L;
//        FibonacciNumbers[1] = 1L;
//
//        for (int i = 2; i < n; i++) {
//            FibonacciNumbers[i] = FibonacciNumbers[i - 1] + FibonacciNumbers[i - 2];
//        }
//
//        System.out.println("Fibonacci numbers are ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(FibonacciNumbers[i] + " ");
//        }
        getFib(10);
    }
    public static void getFib(int n){
        Long[] FibonacciNumbers = new Long[n];
        FibonacciNumbers[0] = 0L;
        FibonacciNumbers[1] = 1L;

        for (int i = 2; i < n; i++) {
            FibonacciNumbers[i] = FibonacciNumbers[i - 1] + FibonacciNumbers[i - 2];
        }

        System.out.println("Fibonacci numbers are ");
        for (int i = 0; i < n; i++) {
            System.out.println(FibonacciNumbers[i] + " ");
        }
    }



}
