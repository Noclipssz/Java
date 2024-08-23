import java.util.Scanner;
import java.math.MathContext;
public class AtividadePedro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle x: ");
        double xA = sc.nextDouble();
        double xB = sc.nextDouble();
        double xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle x: ");
        double yA = sc.nextDouble();
        double yB = sc.nextDouble();
        double yC = sc.nextDouble();

        double xP = (xA + xB + xC) / 2;
        xP = Math.sqrt(xP * (xP - xA) * (xP - xB) * (xP - xC));
        double yP = (yA + yB + yC) / 2;
        yP = Math.sqrt(yP * (yP - yA) * (yP - yB) * (yP - yC));

        System.out.printf("The area of the triangle X is %.2f \n", xP);
        System.out.printf("The area of the triangle Y is %.2f \n", yP);

        if (xP > yP) {
            System.out.println(" Triangle of big is " + xP);
        } else if (xP < yP) {
                System.out.println(" Triangle of big is " + yP);
        }
        sc.close();
    }
}
