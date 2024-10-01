package Package;

public class AnexoTecnico {
    private String Titulo;
    private String DataCriacao;
    private String Tema;

    public String getTitulo() {
        return Titulo;
    }

    public String getDataCriacao() {
        return DataCriacao;
    }

    public String getTema() {
        return Tema;
    }

    public AnexoTecnico(String titulo, String dataCriacao, String tema) {
        Titulo = titulo;
        DataCriacao = dataCriacao;
        Tema = tema;
    }

}
