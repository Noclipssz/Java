import java.util.Scanner;
import Package.Usuarios;
public class AtividadePedro13 {
    public static void main(String[] args) {
        Usuarios[] us = new Usuarios[5];

        ler(us);
    //    System.out.println("O percentual de Homens é : " + percentualMasculino(us));
    //    System.out.println("O percentual de Feminino é : " + percentualFeminuno(us));
        System.out.println(calc(us));
    }
    public static void ler(Usuarios[] us) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < us.length; i++) {
            us[i] = new Usuarios();

            System.out.print("\nDigite sua idade: ");
            us[i].idade = sc.nextInt();
            System.out.print("\n M = mascuino F = feminino \nDigite seu sexo: ");
            us[i].sexo = sc.next().toLowerCase();
        }
        sc.close();
    }
    public static String calc(Usuarios[] us) {
        int masc = 0;
        int fem = 99;
        for (int i = 0; i < us.length; i++) {
            if (us[i].sexo.equals("m")) {
                if (us[i].idade > masc) {
                    masc = us[i].idade;
                }
            } else if (us[i].sexo.equals("f")) {
                if (us[i].idade < fem) {
                    fem = us[i].idade;
                }
            }
        }

    return "Maior idade Masc:" + masc + "Maior idade Femin:" + fem;
    }


    public static double percentualMasculino(Usuarios[] us) {
        int masc = 0;
        for (int i = 0; i < us.length; i++) {
            if ("m".equals(us[i].sexo)){
            masc++;
            }
        }
    return (((double) masc / us.length) * 100);
    }

    public static double percentualFeminuno(Usuarios[] us) {
        int femin = 0;
        for (int i = 0; i < us.length; i++) {
            if ("f".equals(us[i].sexo)){
                femin++;
            }
        }
        return (((double) femin / us.length) * 100);
    }
}
