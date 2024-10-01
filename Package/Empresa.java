package Package;
import java.util.Scanner;


    public class Empresa {
        int idade;
        String Sexo;
        boolean Experiencia;
        People people;
        Empresa teste = new Empresa(0, "", false);


        public Empresa(int idade, String Sexo, boolean Experiencia) {
            this.idade = idade;
            this.Sexo = Sexo;
            this.Experiencia = Experiencia;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getSexo() {
            return Sexo;
        }

        public void setSexo(String sexo) {
            Sexo = sexo;
        }

        public boolean getExperiencia() {
            return Experiencia;
        }

        public void setExperiencia(boolean experiencia) {
            Experiencia = experiencia;
        }

        public int GetcandMas() {
            int Mas = 0;
            for (int i = 0; i < people.candidatos.size(); i++) {
                if (people.candidatos.get(i).getSexo().equalsIgnoreCase("M")) {
                    Mas++;
                }
            }
            return Mas;
        }

        public int GetcandFem() {
            int Mas = 0;
            for (int i = 0; i < people.candidatos.size(); i++) {
                if (people.candidatos.get(i).getSexo().equalsIgnoreCase("F")) {
                    Mas++;
                }
            }
            return Mas;
        }

        public Double GetMediaHomens() {
            int exp = 0;
            double Med = 0;
            for (int i = 0; i < people.candidatos.size(); i++) {
                if (people.candidatos.get(i).getExperiencia()) {
                    exp++;
                }
                Med = ((double) exp / GetcandMas()) * 100;
            }
            return Med;
        }

        public double GetmediaHomens() {
            int id = 0;
            for (int i = 0; i < people.candidatos.size(); i++)
                if (people.candidatos.get(i).idade > 45) {
                    if (people.candidatos.get(i).Sexo.equalsIgnoreCase("M")) {
                        id++;
                    }
                }
            double med = ((double) id / GetcandMas()) * 100;
            return med;
        }

        public int GetIdMinFem() {
            int minFem = 0;
            for (int i = 0; i < people.candidatos.size(); i++) {
                if (people.candidatos.get(i).getExperiencia()) {
                    if (GetcandFem() < 35) {
                        minFem++;
                    }
                }
            }
            return minFem;

        }
            public void run () {
                //   Lerdados();
                //    print();
            }

        }

