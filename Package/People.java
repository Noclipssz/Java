package Package;
import java.util.ArrayList;
import java.util.Scanner;

public class People {
    ArrayList<Empresa> candidatos = new ArrayList<Empresa>();

public void SetCandidatos(Empresa candidato) {
    this.candidatos.add(candidato);
}
    public void Lerdados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Sexo da pessoa: ");
        String sexo = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Tem experiencia: ");
        String Sex = sc.nextLine();
        boolean experiencia;
        if (sexo.equalsIgnoreCase("S")){
            experiencia = true;
        }
        else{
            experiencia = false;
        }
      //  SetCandidatos(new Empresa(idade, Sexo, Experiencia));
    }

    public void print(){
        for (int i = 0; i < candidatos.size(); i++  ) {
            System.out.println("Idade: " + candidatos.get(i).getIdade());
            System.out.println("Sexo: " + candidatos.get(i).getSexo());
            System.out.println("Experiencia: " + candidatos.get(i).getExperiencia());
        }
    }







}
