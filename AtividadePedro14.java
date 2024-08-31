import java.util.Scanner;
import Package.Artigos;
public class AtividadePedro14 {
    public static void main(String[] args) {
        Artigos[] ar = new Artigos[3];

        ler(ar);
        imprimir(ar);

    }

    public static void ler(Artigos[] ar) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new Artigos();
            System.out.println("Digite o nome do Artigo: ");
            ar[i].setNome(sc.nextLine());
            System.out.println("Digite o preço do Artigo: ");
            ar[i].setPreco(sc.nextDouble());
            System.out.println("Digite o percentual: ");
            ar[i].setPercentual(sc.nextDouble());
            sc.nextLine();
        }
        sc.close();
    }

    public static void imprimir(Artigos[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Artigo: \n" + ar[i].getNome());
            System.out.println("Preço do Artigo: \n" + ar[i].getPreco());
            System.out.println("Percentual de desconto aplicado: \n" + ar[i].getPercentual());
        }
    }

}
