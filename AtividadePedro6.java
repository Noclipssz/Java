import java.util.Scanner;

public class AtividadePedro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[media(sc)];
        float soma = 0;
        soma = media(soma,vetor,sc);
        System.out.println(media(soma,vetor.length));
    }



    public static float media(float soma ,int[] vetor, Scanner sc ) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Escreva o n " + (i+1) + " do vetor: ");
             vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        return soma;
    }

    public static int media(Scanner sc) {
        System.out.print(" Escreva quantos numeros deseja dividir: ");
         return sc.nextInt();
    }

    public static double media(float soma,int vet) {
        System.out.print(" o total do vetor dividido pelo numero do vetor é : ");
        return soma / vet;
    }
}
