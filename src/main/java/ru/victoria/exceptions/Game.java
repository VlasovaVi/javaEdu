package ru.victoria.exceptions;

import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        String[] questions = {"Первым программистом в истории считается женщина?", "Автор романа \"Улисс\" Теодор Драйзер?", "Верно ли, что шесть отчественных фильма стали обладателями премии \"Оскар\"?"};
        String[] array = {"да", "нет", "да"};
        for (int i = 0; i < questions.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println(questions[i]);

            String answer = in.nextLine();

            if (answer.equalsIgnoreCase(array[i])) {
                System.out.println("Верно");
            } else {
                System.out.println("Неверно");
            }
        }
    }
}