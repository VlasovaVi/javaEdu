package ru.victoria.exceptions;

public class ExceptionsDemo {
    public static void main_simpleExample(String[] args) {
        int i = 10;
        long l = 0L;
        int[] arr = {1,2,3,4};
        //System.err.println("error test");
        try {
            System.out.println(i/l);
            System.out.println("further try-catch");
        }
        catch (java.lang.Exception e) {
            System.out.println(e.toString());
        }


        System.out.println("further code");
    }

    public static void main(String[] args) {
        try {
            int order = getOrder(new int[]{1, 2, 3, 4, 5}, 10);
            System.out.println("order = " + order);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("*********");




        int order = getOrderUnchecked(new int[]{1, 2, 5, 7445, 54}, 3);
        System.out.println("order = " + order);
    }

    public static int getOrder(int[] arr, int value) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        throw new Exception("value = " + value + " not found in array");
    }

    public static int getOrderUnchecked(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        throw new RuntimeException("value = " + value + " not found in array");
    }


}
