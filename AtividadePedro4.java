import java.util.Scanner;
import entities.triangulo;
public class AtividadePedro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Enter the measures of triangle x: ");
            x.ler(x.a,x.b,x.c);

        System.out.println("Enter the measures of triangle y: ");
            x.ler(x.a,x.b,x.c);

         x.p = x.calc(x.a,x.b,x.c);
         y.p = y.calc(y.a,y.b,y.c);
        System.out.printf("The area of the triangle X is %.2f \n", x.p);
        System.out.printf("The area of the triangle Y is %.2f \n", y.p);

        sc.close();
    }
}
