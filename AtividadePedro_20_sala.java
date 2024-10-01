import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import Package.Norma;
import Package.AnexoTecnico;

public class AtividadePedro_20_sala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Norma norm;
        Norma Normas = new Norma("", "", "", "");
        boolean v1 = false;
        boolean v2 = false;
        do {
            v2 = false;
            v1 = false;
            System.out.println("Deseja Adicionar algum Normas : (SIM/NAO)");
            String Snormas = sc.nextLine();
            if (Snormas.equalsIgnoreCase("SIM")) {
                Normas.addNorma(readNorma(sc));
                v2 = true;
                do {
                    System.out.println("Deseja Adicionar algum anexo : (SIM/NAO)");
                    String anexo = sc.nextLine();
                    if (anexo.equalsIgnoreCase("SIM")) {
                        Normas.addAnexo(readAnexo(sc));
                        v1 = true;
                    } else {break;}
                } while (v1);
            } else if (Snormas.equalsIgnoreCase("NAO")) {
                v2 = false;
            }
        } while (v2);

        System.out.println(ListaMaiorNorma(Normas));
        System.out.println(encontrarNormaMaisAntiga(Normas));
    }

    public static Norma readNorma(Scanner sc) {
        String titulo = " ";
        String DataCriacao = " ";
        String OrgaoNormativo = " ";
        String Versao = " ";
        System.out.println("Digite o titulo: ");
        titulo = sc.nextLine();
        System.out.println("Digite a Data de Criacao: ");
        DataCriacao = sc.nextLine();
        System.out.println("Digite o Orgao Normativo: ");
        OrgaoNormativo = sc.nextLine();
        System.out.println("Digite o Versao: ");
        Versao = sc.nextLine();
        Norma norma;
        norma = new Norma(titulo, DataCriacao, OrgaoNormativo, Versao);
        return norma;
    }

    public static AnexoTecnico readAnexo(Scanner sc) {
        String titulo = " ";
        String DataCriacao = " ";
        String Tema = " ";

        System.out.println("Digite o titulo: ");
        titulo = sc.nextLine();
        System.out.println("Digite a Data de Criacao: ");
        DataCriacao = sc.nextLine();
        System.out.println("Digite o Tema: ");
        Tema = sc.nextLine();
        AnexoTecnico anexo;
        anexo = new AnexoTecnico(titulo, DataCriacao, Tema);

        return anexo;
    }

    public static String ListaMaiorNorma(Norma Normas) {
        int maior = 0;
        int atual = 0;
        int i2 = 0;
        for(int i = 0; i < Normas.normaArrayList.size(); i++) {
            atual = Normas.normaArrayList.get(i).normaAnexoList.size();
            if (atual > maior) {
                maior = atual;
                i2 = i;
            }
        }
        String msg = Normas.normaArrayList.get(i2).getTitulo() + "\n" + Normas.normaArrayList.get(i2).getDataCriacao() + "\n"+ Normas.normaArrayList.get(i2).getOrgaoNormativo() + "\n" +Normas.normaArrayList.get(i2).getVersao();
         return msg;
    }

    public static String encontrarNormaMaisAntiga(Norma normas) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Norma maisAntiga = normas.normaArrayList.get(0);

        for (int i = 1; i < normas.normaArrayList.size(); i++) {
            // Compara a data da norma atual com a da mais antiga
            if (LocalDate.parse(normas.normaArrayList.get(i).getDataCriacao(), formatter)
                    .isBefore(LocalDate.parse(maisAntiga.getDataCriacao(), formatter))) {
                maisAntiga = normas.normaArrayList.get(i);
            }
        }

        return maisAntiga.getTitulo() + " - " + maisAntiga.getDataCriacao();
    }

}

