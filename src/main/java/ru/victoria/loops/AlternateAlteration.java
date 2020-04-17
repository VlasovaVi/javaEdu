package ru.victoria.loops;

public class AlternateAlteration {
    public static void main(String[] args) {
        int[] arr = {15, 16, 74, 155, 54, 45, 74, 44};
        // Дан массив arr
        // Нужно заменить элементы на четных местах на сумму элементов справа и слева
        // если элемента справа или слева нет, то оставить без изменений


        // для массива arr ответ {15, 16, 171, 155, 200, 45, 89}


        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && i != arr.length - 1) {
                if (i % 2 == 0) {
                    int t = arr[i];
                    int a = arr[i - 1];
                    int b = arr[i + 1];
                    t = a + b;
                    System.out.println(t);
                }else {
                    System.out.println(arr[i]);
                }
            }else {
                System.out.println(arr[i]);
            }
        }
    }
}