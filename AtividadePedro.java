
import java.util.Scanner;

public class AtividadePedro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] A = new float[20];
        float[] B = new float[20];
        float[] C = new float[20];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite valores para o vetor A: ");
            A[i] = sc.nextFloat();
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite valores para o vetor B: ");
            B[i] = sc.nextFloat();
        }
         for (int i = 0; i < A.length; i++) {
             int a = 0, b = 20;
             C[i] = A[i] * B[i];
             a++; b--;
         }
         for (int i = 0; i < A.length; i++) {
             System.out.println(" Vetor C[" + i + "]: " + C[i]);
         }



        sc.close();
    }

}
