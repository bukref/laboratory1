package tech.relaib.java.cources.bukreevda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.printf("Лабораторная работа №1\n");
        System.out.printf("Букреев Д.А., гр.12002008, вариант 4\n");
        Scanner input = new Scanner(System.in);
        int choose=99;
        do {
            System.out.printf("1. Задание 1. Пример 1.\n");
            System.out.printf("2. Задание 1. Пример 2.\n");
            System.out.printf("3. Задание 2. Пример 1.\n");
            System.out.printf("4. Задание 2. Пример 2.\n");
            System.out.printf("5. Задание 2. Пример 3.\n");
            System.out.printf("6. Задание 2. Пример 4.\n");
            System.out.printf("0. Выход\n");
            System.out.printf("Выберите задание:");
            choose = input.nextInt();
            switch (choose) {
                case  (1):
                    zadanie1.mat1();
                    break;
                case (2):
                    zadanie1.mat2();
                    break;
                case (3):
                    zadanie2.z1();
                    break;
                case (4):
                    zadanie2.z2();
                    break;
                case (5):
                    zadanie2.z3();
                    break;
                case (6):
                    zadanie2.z4();
                    break;
                default:
                    break;
            }
        } while(choose!=0);


    }
}
