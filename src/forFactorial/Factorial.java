package forFactorial;

public class Factorial {
    public static long FactorialNum(int number){
        if(number<0){
            throw new IllegalArgumentException("the number is not defined for negative numbers");
        }
        if(number==0 || number==1){
            return 1;
        }

        int factorial=1;
        for (int i = 2; i <=number ; i++) {
            factorial*=i;
        }
        return factorial;

    }

    public static void main(String[] args) {
        System.out.println(FactorialNum(5));
    }
}
