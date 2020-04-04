package ru.victoria.loops;

import java.util.Scanner;

public class LoopsDemo {
    public static void main(String[] args) {
        int[] other_arr = new int[10];// 10 - array size
        other_arr[0] = 1;
        other_arr[1] = 2;
        //findDefect();
        //sumOfEven();
        Scanner scanner = new Scanner(System.in);//
        int sum = 0;

        while (sum < 1000) {
            int userInput = scanner.nextInt();
            sum += userInput;
        }
        System.out.println("sum= " + sum );

    }

    private static void sumOfEven() {
        int[] arr = {5,3,47, 474,222};

        int sumOfEvenNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            //arr[i] -- current element of array
            if (arr[i]%2 == 0) { // arr[i] is even
                sumOfEvenNumbers += arr[i];//sumOfEvenNumbers = sumOfEvenNumbers + arr[i]

            } else {
                System.out.println(arr[i]);
            }
        }

        System.out.println("sumOfEvenNumbers = " + sumOfEvenNumbers);
        int x = 13;
        int y = x%2;
        System.out.println(y);
    }

    private static void findDefect() {
        int[] arr = {1,2,3,4,5,8,9,10,11,12, 14, 20};
        //System.out.println(arr[arr.length -1]);
        for (int i = 1; i < arr.length; i++ ) {
            int curr = arr[i];
            int prev = arr[i - 1];
            if (prev + 1 != curr) {
                System.out.println(prev);
                break;
            }
        }
    }
}
