package tech.relaib.java.cources.bukreevda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.printf("������������ ������ �1\n");
        System.out.printf("������� �.�., ��.12002008, ������� 4\n");
        Scanner input = new Scanner(System.in);
        int choose=99;
        do {
            System.out.printf("1. ������� 1. ������ 1.\n");
            System.out.printf("2. ������� 1. ������ 2.\n");
            System.out.printf("3. ������� 2. ������ 1.\n");
            System.out.printf("4. ������� 2. ������ 2.\n");
            System.out.printf("5. ������� 2. ������ 3.\n");
            System.out.printf("6. ������� 2. ������ 4.\n");
            System.out.printf("0. �����\n");
            System.out.printf("�������� �������:");
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
