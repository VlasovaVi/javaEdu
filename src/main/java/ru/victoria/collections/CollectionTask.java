package ru.victoria.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTask {
    public static void main(String[] args) throws IOException {
        read_Tofile();
    }

    public static void read_Tofile() throws IOException {
        try (Reader reader = new FileReader("/Users/viktoriavlasova/Desktop/java_lessons/data/Names2.txt")) {
            char[] buf = new char[1000];
            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                int read = reader.read(buf);
                sb.append(buf, 0, read);
                System.out.println();
            }
            String result = sb.toString();

            List<String> strings = new ArrayList<>();
            String[] parts = result.split("\n");
            for (String x : parts) {
                strings.add(x);
            }


            Set<String> string = new HashSet<String>();
            Set<String> string2 = new HashSet<String>();
            for (int i = 0; i < strings.size(); i++) {
                boolean a = string.add(strings.get(i));
                if (a == false) {
                    string2.add(strings.get(i));
                }
            }
            try (Writer writer = new FileWriter("/Users/viktoriavlasova/Desktop/java_lessons/data/Names3.txt")) {
                writer.write(string.toString());
                try (Writer writer2 = new FileWriter("/Users/viktoriavlasova/Desktop/java_lessons/data/Names4.txt")) {
                    writer2.write(string2.toString());
                }
            }
        }
    }
}
