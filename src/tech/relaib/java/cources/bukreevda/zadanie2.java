package tech.relaib.java.cources.bukreevda;
import java.util.Scanner;
public class zadanie2 {
    public  static  void z1(){ //Задание 4. С клавиатуры вводятся: величины углов треугольника а, в, с (значения в градусах) и радиусом описанной окружности R. Вычислить стороны треугольника.
        Scanner input = new Scanner(System.in);
        int dig1,dig2,dig3;
        double radius,side1,side2,side3;

        System.out.println("Стороны треугольника.");
        System.out.print("Введите угол 1:\n");
        dig1 = input.nextInt();
        System.out.print("Введите угол 2:\n");
        dig2 = input.nextInt();
        System.out.print("Введите угол 3:\n");
        dig3 = input.nextInt();
        System.out.print("Введите радиус описанной окружности(см):\n");
        radius = input.nextDouble();
        side1 = 2*radius* Math.sin(Math.toRadians(dig1));
        side2 = 2*radius* Math.sin(Math.toRadians(dig2));
        side3 = 2*radius* Math.sin(Math.toRadians(dig3));
        System.out.printf("Сторона 1 = %.3f(см), cторона 2 = %.3f(см), cторона 3 = %.3f(см) :\n", side1,side2,side3);
    }
    public  static  void z2(){ //Задание 6. С клавиатуры вводится сторона равностороннего треугольника А. Вычислить радиус вписанной r и описанной R окружностей этого треугольника.
        Scanner input = new Scanner(System.in);
        double r1,r2,side;
        System.out.println("Окружности треугольника");
        System.out.print("Введите сторону(см):");
        side = input.nextDouble();
        r1 = side / Math.sqrt(3);
        System.out.printf("Радиус описанной окружности= %.3f(см)\n", r1);
        r2 = side / 2*Math.sqrt(3);
        System.out.printf("Радиус вписанной окружности= %.3f(см)\n", r2);
    }
    public  static  void z3(){ //Задание 9. С клавиатуры вводятся: площадь боковой поверхности(в метрах) и радиус(в сантиметрах) основания R. Вычислить высоту конуса H и объем конуса.
        Scanner input = new Scanner(System.in);
        double sqr,r,h,v,l;
        System.out.println("Объём конуса.");
        System.out.print("Введите площадь боковой поверхности(м^2):");
        sqr = input.nextDouble();
        sqr = sqr*100;
        System.out.print("Введите радиус основания(см):");
        r = input.nextDouble();
        l = sqr / Math.PI*r;
        System.out.printf("Образующая(см) = %.3f\n", l);
        h = Math.sqrt(l*l-r*r);
        System.out.printf("Высота(см) = %.3f\n", h);
        v = (Math.PI * r * r * h) / 3;
        System.out.printf("Объём(см^3) = %.3f\n", v);

    }
    public  static  void z4(){ //Задание 13. С клавиатуры вводятся: координаты концов отрезка X1,Y1 и X2, Y2. Вычислить координаты середины отрезка.
        Scanner input = new Scanner(System.in);
        double x1,x2,y1,y2,x3,y3;
        System.out.println("Середина отрезка.");
        System.out.print("Введите кординату х1:\n");
        x1 = input.nextInt();
        System.out.print("Введите кординату y1:\n");
        y1 = input.nextInt();
        System.out.print("Введите кординату х2:\n");
        x2 = input.nextInt();
        System.out.print("Введите кординату y2:\n");
        y2 = input.nextInt();
        x3 = (x1+x2) / 2;
        y3 = (y1+y2) / 2;
        System.out.printf("Середина отрезка имеет координаты:(%.1f ; %.1f)\n", x3,y3);

    }
}
