package maxMinOfArray;

public class MaxMinFinder {
    public static void main(String[] args) {
        int [] arr={25,1,785,69,458};
        System.out.println("the max value of array is"+" "+findMax(arr));
        System.out.println("the minimum value of array is"+" "+findMin(arr));
    }




    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


}
