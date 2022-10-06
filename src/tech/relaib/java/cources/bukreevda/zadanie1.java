package tech.relaib.java.cources.bukreevda;
import java.util.Scanner;
public class zadanie1 {
    public static void mat1(){
        double a,x,b,e,fin;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите значения для первого примера:");
        System.out.print("Переменная a = ");
        a = input.nextFloat();
        System.out.print("Переменная x = ");
        x = input.nextFloat();
        System.out.print("Переменная b = ");
        b = input.nextFloat();
        System.out.print("Переменная e = ");
        e = input.nextFloat();
        fin = ((a*x+2*b+Math.pow(x,2)* Math.abs(Math.cos(Math.pow(x,2))))) / (Math.PI* Math.pow(e,x));
        System.out.printf("Значение выражения = %f\n", fin);
    }
    public static void mat2(){
        double y, x, b, fin;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите значения для второго примера:");
        System.out.print("Переменная x = ");
        x = input.nextFloat();
        System.out.print("Переменная y = ");
        y = input.nextFloat();
        System.out.print("Переменная b = ");
        b = input.nextFloat();
        fin = Math.log((Math.sqrt(x*x+y*y)-b) / (Math.sqrt(Math.abs(x))+Math.sin(y)+b));
        System.out.printf("Значение выражения = %f\n", fin);
    }

}
