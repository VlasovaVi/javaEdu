package ru.victoria.loops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ValidNumberI {
    public static void main(String[] args) throws IOException {
        final int size = 100;
        char[] number = new char[size];

        for (int i = 0; i < number.length; i++) {
            number[i] = (char) System.in.read();
        }
        //верхний код не трогать решение добавить после комментария
        //массив number хранит 10 символов, введенных с клавиатуры
        // проверить что этот массив соостваляет валидное число и вывести соответствующее сообщение
        // пример валидных чисел 123457890 +777777777 -123456789
        // пример невалидных 123456789ф +-1235745 ++745467467 abcdef7
        // подсказка для типа char доступны операции сравнения (< > <= >= ==)
        boolean isValid = true;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == '+' || number[i] == '-') {
                if (i == 0) {
                    continue;
                }
                else {
                    isValid = false;
                    break;
                }
            }

            if (!(number[i] >= '0' && number[i] <= '9')) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("valid number");
        } else {
            System.out.println("invalid number");
        }

    }
}
