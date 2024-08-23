import java.util.Scanner;
public class AtividadePedro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Digite 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(" ");
        System.out.println(" O maior numero é : " + max(a,b,c));
    }
    public static int max(int a, int b, int c) {

        if (a > c && a > b) {
            return a;
        } else if (b > c && b > a) {
            return b;
        }else if (c > a && c > b) {
            return c;
        }
        return 0;
    }

}
