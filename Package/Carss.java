package Package;

import java.util.ArrayList;

public class Carss {

    private String plate;
    private int year;
    private double engine;
    private int chassis;
    private String color;
    private String automaker;

    // Lista que armazena todos os carros
    private ArrayList<Carss> listaVeiculo = new ArrayList<>();

    // Construtor da classe Carss
    public Carss(String plate, int year, double engine, int chassis, String color, String automaker) {
        this.plate = plate;
        this.year = year;
        this.engine = engine;
        this.chassis = chassis;
        this.color = color;
        this.automaker = automaker;
    }

    // Método para adicionar um veículo à lista
    public void addCarToList(Carss veiculo) {
        this.listaVeiculo.add(veiculo);
    }

    // Método que retorna a lista de carros em formato de string
    public String getCarlist() {
        StringBuilder carlist = new StringBuilder();
        for (Carss car : listaVeiculo) {
            carlist.append("Carro: ")
                    .append(car.plate).append(", ")
                    .append(car.year).append(", ")
                    .append(car.engine).append(", ")
                    .append(car.chassis).append(", ")
                    .append(car.color).append(", ")
                    .append(car.automaker).append("\n");
        }
        return carlist.toString();
    }


    // Método que simula o processo
    public void Carssrun() {
        System.out.println("Lista de Veículos:");
        System.out.println(getCarlist());
    }
}
