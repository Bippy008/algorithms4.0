package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество чисел:");
        int num = scanner.nextInt();
        int[] mass = new int[num];
        System.out.println("Старый массив: ");
        for (int i = 0; i < num; i++) {
            mass[i] = random.nextInt(101);
            System.out.print(mass[i] + " ");
        }
        int start = 0, end = mass.length-1;
        while (start <= end) {
            boolean changed = false;
            for (int i = start; i < end; i++) {
                if (mass[i] > mass[i+1]) {
                    int temp = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = temp;
                    changed = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (mass[i] < mass[i-1]) {
                    int temp = mass[i-1];
                    mass[i-1] = mass[i];
                    mass[i] = temp;
                    changed = true;
                }
            }
            start++;
            if(!changed) {
                break;
            }
        }
        System.out.println("Новый массив: ");
        for (int i = 0; i < num; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
