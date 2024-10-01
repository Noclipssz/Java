import Package.Carss;
import java.util.Scanner;

    public class AtividadePedro15 {
        // Função que roda o programa principal com leitura dos itens pelo usuário
        public static void runProgram() {
            Scanner scanner = new Scanner(System.in);

            // Cria um objeto Carss para armazenar e manipular veículos
            Carss carManager = new Carss("", 0, 0.0, 0, "", "");
            boolean adicionarMais = true;

            // Loop para adicionar os veículos de forma dinâmica
            while (adicionarMais) {
                System.out.println("Digite as informações do veículo:");

                System.out.print("Placa: ");
                String plate = scanner.nextLine();

                System.out.print("Ano: ");
                int year = scanner.nextInt();

                System.out.print("Motor (Engine): ");
                double engine = scanner.nextDouble();

                System.out.print("Chassi: ");
                int chassis = scanner.nextInt();

                scanner.nextLine(); // Consumir a quebra de linha após o número

                System.out.print("Cor: ");
                String color = scanner.nextLine();

                System.out.print("Fabricante (Automaker): ");
                String automaker = scanner.nextLine();

                // Adiciona o novo carro à lista
                carManager.addCarToList(new Carss(plate, year, engine, chassis, color, automaker));

                System.out.println("Veículo adicionado!\n");

                // Pergunta se o usuário deseja adicionar mais veículos
                System.out.print("Deseja adicionar outro veículo? (S/N): ");
                String resposta = scanner.nextLine();

                // Se o usuário responder com "N", a adição de carros será interrompida
                if (resposta.equalsIgnoreCase("N")) {
                    adicionarMais = false;
                }
            }


            // Executa o metodo
            carManager.Carssrun();


            // Fechar o scanner para evitar vazamento de recursos
            scanner.close();

        }


        public static void main(String[] args) {
            // Chamando a função para rodar o programa
            runProgram();
        }
    }

