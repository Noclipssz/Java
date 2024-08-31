package Package;

public class Biblioteca {
    String titulo;
    String autor;
    String editora;

    boolean emprestado;

    public void emprestar(){
        this.emprestado = true;
    }

    public void devolver(){
        this.emprestado = false;
    }

    public String exibirDetalhes() {
        return titulo +
                autor +
                editora;
    }
}
