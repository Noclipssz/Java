package Package;

public class Artigos {
    private String nome;
    private double preco;
    private double percentual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return CalcularPreco();
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public String mostrar(){
        return getNome() + " - " + getPreco() + " - " + getPercentual();
    }

    public double CalcularPreco() {
        return getPreco() - ( getPreco() * ( getPercentual()/100 ));
    }
}
