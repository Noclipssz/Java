import java.util.Scanner;
public class AtividadePedro1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Digite quantos alunos: ");
      int student = sc.nextInt();

      String[] students = new String[student];

      for (int i = 0; i < students.length; i++) {
          System.out.println("Digite o nome do aluno: ");
          students[i] = sc.next();
      }
      double[] notas = new double[students.length];

      for (int i = 0; i < students.length; i++) {
          double total = 0;
          for (int j = 0; j < 3; j++) {
              System.out.println("Digite as notas do aluno " + students[i] + ": ");
              total += sc.nextDouble();
          }
          notas[i] = total / 3;
      }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - " + notas[i]);
        }


      sc.close();
    }
}
