import java.util.Scanner;
public class AtividadePedro2   {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println(" Calculador do Kairo ");
            System.out.print("Digite um valor: ");
            double valor = sc.nextDouble();
            System.out.print("Digite outro valor: ");
            double valor2 = sc.nextDouble();
        String met;
        boolean ve = false;
            do {
                System.out.println(" + | - | * | / ");
                System.out.println(" Escreva qual o método: ");
                 met = sc.next();
                if (met.equals("+")  || met.equals("-")  || met.equals("*") || met.equals("/") ) {
                ve  = true;
                } else {
                    System.out.println("invalido");
                }
            } while (!ve);
        switch (met) {
            case "+" -> System.out.println(" Resultado: " + (valor + valor2));
            case "-" -> System.out.println(" Resultado: " + (valor - valor2));
            case "*" -> System.out.println(" Resultado: " + (valor * valor2));
            case "/" -> System.out.println(" Resultado: " + (valor / valor2));
        }
    sc.close();
    }
}
