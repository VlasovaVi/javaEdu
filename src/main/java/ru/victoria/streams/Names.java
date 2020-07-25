package ru.victoria.streams;

import java.io.*;

public class Names {
    public static void main_writeTofile() throws IOException {
        try (Reader reader = new FileReader("/Users/viktoriavlasova/Desktop/java_lessons/data/Names.txt")) {
            char[] buf = new char[1000];
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                int read = reader.read(buf);
                sb.append(buf, 0, read);
                System.out.println();
            }
            String result = sb.toString();

            String[] parts = result.split(",");
            for (String x : parts) {
                System.out.println(x);
                if (x.length() > 6) {
                    try (Writer writer = new FileWriter("/Users/viktoriavlasova/Desktop/java_lessons/data/Names2.txt", true)) {
                        writer.write(x + "\n");
                    }
                    System.out.println();
                }
            }
        }
    }
}
