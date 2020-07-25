package ru.victoria.streams;

import java.io.*;

public class ReaderDemo {
    public static void main_old(String[] args) throws IOException {
        Writer writer = null;
        try {
            writer = new FileWriter("/Users/viktoriavlasova/Desktop/java_lessons/data/foo.txt");
            writer.write("foo bar baz\n");
        } finally {
            writer.close();
        }
    }

    public static void main_writeTofile(String[] args) throws IOException {
        try (Writer writer = new FileWriter("/Users/viktoriavlasova/Desktop/java_lessons/data/foo.txt")) {
            writer.write("foo bar baz\n");
        }
        System.out.println();
    }



    public static void main_readFromFile_old(String[] args) throws IOException {
        Reader reader = new FileReader("/Users/viktoriavlasova/Desktop/java_lessons/data/example.txt");
        char[] buf = new char[10];
        StringBuilder sb = new StringBuilder();

        while(reader.ready()) {
            int read = reader.read(buf);
            sb.append(buf, 0, read);
            System.out.println();
        }
        String result = sb.toString();
    }

    public static void main_readFromFile(String[] args) throws IOException {
        try (Reader reader = new FileReader("/Users/viktoriavlasova/Desktop/java_lessons/data/example.txt")){
            char[] buf = new char[10];
            StringBuilder sb = new StringBuilder();

            while(reader.ready()) {
                int read = reader.read(buf);
                sb.append(buf, 0, read);
                System.out.println();
            }
            String result = sb.toString();
        }
    }

    public static void main_hints_for_HW(String[] args) {
        //int i = "test,foo,bar".indexOf(',');//returns 4
        String[] strings = "test,foo,bar".split(",");
        System.out.println();
    }

    public static void main(String[] args) {
        main_hints_for_HW(args);
    }
}
