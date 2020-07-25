package ru.victoria.streams;

import java.io.IOException;

public class StreamsDemo {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int x = System.in.read();
            sum += x;
        }
        char answer = (char) System.in.read();
        System.out.println(sum);
    }
}
