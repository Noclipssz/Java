import java.util.Scanner;

public class AtividadePedro5 {
    public static void main(String[] args) {
        int valor,valor1 =0;
        Scanner sc = new Scanner(System.in);
        valor = read(sc); valor1 = read(sc);
        calc(valor,valor1,sc);
     sc.close();
    }
public static int read(Scanner sc) {
        System.out.println("Escreva um numero: ");
    int a = sc.nextInt();
    return a;
}
public  static void calc(int valor,int valor2,Scanner sc) {
    sc.nextLine();
    boolean bo = false;
    do {
        System.out.println("Digite o Operador: ' + | - | * | / ' ");
        String op = sc.nextLine();
        switch (op) {
            case "+" -> System.out.println(" Resultado: " + (valor + valor2));
            case "-" -> System.out.println(" Resultado: " + (valor - valor2));
            case "*" -> System.out.println(" Resultado: " + (valor * valor2));
            case "/" -> System.out.println(" Resultado: " + (valor / valor2));
            default -> {
                System.out.println("Operação inválida!");
                bo = false;
            }
        }
    } while (bo);
}

}
