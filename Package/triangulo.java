package Package;

import java.util.Scanner;

public class triangulo {
        public double a;
        public double b;
        public double c;
        public double p;

    public double calc(double a, double b, double c) {
    double p = (double) (a + b + c) / 2;
    return Math.sqrt(p* (p-a) * (p-b) * (p-c));
    }

    public void ler(double a, double b, double c) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();
    }

    }



