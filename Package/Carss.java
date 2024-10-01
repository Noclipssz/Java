package Package;

import java.util.ArrayList;

public class Carss {

    private String plate;
    private int year;
    private double engine;
    private int chassis;
    private String color;
    private String automaker;

    private ArrayList<Carss> listaVeiculo = new ArrayList<>();

    public Carss(String plate, int year, double engine, int chassis, String color, String automaker) {
        this.plate = plate;
        this.year = year;
        this.engine = engine;
        this.chassis = chassis;
        this.color = color;
        this.automaker = automaker;
    }

    public void addCarToList(Carss veiculo) {
        this.listaVeiculo.add(veiculo);
    }

    public void getCarlist() {
        for (int i = 0; i < listaVeiculo.size(); i++) {
            System.out.println("Car Plate:  " + listaVeiculo.get(i).plate);
            System.out.println("Car Color:  " + listaVeiculo.get(i).color);
            System.out.println("Car Year:  " + listaVeiculo.get(i).year);
            System.out.println("Car Chassis:  " + listaVeiculo.get(i).chassis);
            System.out.println("Car Automaker:  " + listaVeiculo.get(i).automaker);
            System.out.println("Car Engine:  " + listaVeiculo.get(i).engine);
        }
    }

    public void Carssrun() {
        System.out.println("Lista de Veículos:");
        getCarlist();
    }
}
