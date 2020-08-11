package ru.victoria.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskSort {
        public static void main (String[] args) {
            List<Integer> list = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < 100; i++) {
                list.add(r.nextInt(1_000));
            }
            System.out.println("до сортировки: " + list);
            for(int a = 1; a < list.size(); a++){
                for (int b = list.size()-1; b >= a; b--){
                    if(list.get(b-1) > list.get(b)){
                        int c = list.get(b-1);
                        list.set(b-1, b);
                        list.set(b, c);
                    }
                }
            }
            System.out.println("после сортировки: " + list);
        }
    }
