package tech.relaib.java.cources.bukreevda;
import java.util.Scanner;
public class zadanie1 {
    public static void mat1(){
        double a,x,b,e,fin;
        Scanner input = new Scanner(System.in);

        System.out.println("������� �������� ��� ������� �������:");
        System.out.print("���������� a = ");
        a = input.nextFloat();
        System.out.print("���������� x = ");
        x = input.nextFloat();
        System.out.print("���������� b = ");
        b = input.nextFloat();
        System.out.print("���������� e = ");
        e = input.nextFloat();
        fin = ((a*x+2*b+Math.pow(x,2)* Math.abs(Math.cos(Math.pow(x,2))))) / (Math.PI* Math.pow(e,x));
        System.out.printf("�������� ��������� = %f\n", fin);
    }
    public static void mat2(){
        double y, x, b, fin;
        Scanner input = new Scanner(System.in);

        System.out.println("������� �������� ��� ������� �������:");
        System.out.print("���������� x = ");
        x = input.nextFloat();
        System.out.print("���������� y = ");
        y = input.nextFloat();
        System.out.print("���������� b = ");
        b = input.nextFloat();
        fin = Math.log((Math.sqrt(x*x+y*y)-b) / (Math.sqrt(Math.abs(x))+Math.sin(y)+b));
        System.out.printf("�������� ��������� = %f\n", fin);
    }

}
