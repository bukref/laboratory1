package tech.relaib.java.cources.bukreevda;
import java.util.Scanner;
public class zadanie2 {
    public  static  void z1(){ //������� 4. � ���������� ��������: �������� ����� ������������ �, �, � (�������� � ��������) � �������� ��������� ���������� R. ��������� ������� ������������.
        Scanner input = new Scanner(System.in);
        int dig1,dig2,dig3;
        double radius,side1,side2,side3;

        System.out.println("������� ������������");
        System.out.print("������� ���� 1:\n");
        dig1 = input.nextInt();
        System.out.print("������� ���� 2:\n");
        dig2 = input.nextInt();
        System.out.print("������� ���� 3:\n");
        dig3 = input.nextInt();
        System.out.print("������� ������ ��������� ����������(��):\n");
        radius = input.nextDouble();
        side1 = 2*radius* Math.sin(Math.toRadians(dig1));
        side2 = 2*radius* Math.sin(Math.toRadians(dig2));
        side3 = 2*radius* Math.sin(Math.toRadians(dig3));
        System.out.printf("������� 1 = %.3f(��), c������ 2 = %.3f(��), c������ 3 = %.3f(��) :\n", side1,side2,side3);
    }
    public  static  void z2(){ //������� 6. � ���������� �������� ������� ��������������� ������������ �. ��������� ������ ��������� r � ��������� R ����������� ����� ������������.
        Scanner input = new Scanner(System.in);
        double r1,r2,side;
        System.out.println("���������� ������������");
        System.out.print("������� �������(��):");
        side = input.nextDouble();
        r1 = side / Math.sqrt(3);
        System.out.printf("������ ��������� ����������= %.3f(��)\n", r1);
        r2 = side / 2*Math.sqrt(3);
        System.out.printf("������ ��������� ����������= %.3f(��)\n", r2);
    }
    public  static  void z3(){ //������� 9. � ���������� ��������: ������� ������� �����������(� ������) � ������(� �����������) ��������� R. ��������� ������ ������ H � ����� ������.
        Scanner input = new Scanner(System.in);
        double sqr,r,h,v,l;
        System.out.println("����� ������.");
        System.out.print("������� ������� ������� �����������(�^2):");
        sqr = input.nextDouble();
        sqr = sqr*100;
        System.out.print("������� ������ ���������(��):");
        r = input.nextDouble();
        l = sqr / Math.PI*r;
        System.out.printf("����������(��) = %.3f\n", l);
        h = Math.sqrt(l*l-r*r);
        System.out.printf("������(��) = %.3f\n", h);
        v = (Math.PI * r * r * h) / 3;
        System.out.printf("�����(��^3) = %.3f\n", v);

    }
    public  static  void z4(){ //������� 13. � ���������� ��������: ���������� ������ ������� X1,Y1 � X2, Y2. ��������� ���������� �������� �������.
        Scanner input = new Scanner(System.in);
        double x1,x2,y1,y2,x3,y3;
        System.out.println("�������� �������.");
        System.out.print("������� ��������� �1:\n");
        x1 = input.nextInt();
        System.out.print("������� ��������� y1:\n");
        y1 = input.nextInt();
        System.out.print("������� ��������� �2:\n");
        x2 = input.nextInt();
        System.out.print("������� ��������� y2:\n");
        y2 = input.nextInt();
        x3 = (x1+x2) / 2;
        y3 = (y1+y2) / 2;
        System.out.printf("�������� ������� ����� ����������:(%.1f ; %.1f)\n", x3,y3);

    }
}
