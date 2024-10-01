package Package;
import java.util.ArrayList;

public class Norma {
    private String Titulo;
    private String DataCriacao;
    private String OrgaoNormativo;
    private String Versao;

    public ArrayList<Norma> normaArrayList = new ArrayList<Norma>();

    public ArrayList<AnexoTecnico> normaAnexoList = new ArrayList<AnexoTecnico>();


    public Norma(String titulo, String dataCriacao, String orgaoNormativo, String versao) {
        Titulo = titulo;
        DataCriacao = dataCriacao;
        OrgaoNormativo = orgaoNormativo;
        Versao = versao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getDataCriacao() {
        return DataCriacao;
    }

    public String getOrgaoNormativo() {
        return OrgaoNormativo;
    }

    public String getVersao() {
        return Versao;
    }



    public void addAnexo(AnexoTecnico anexo) {
        this.normaAnexoList.add(anexo);
    }


    public void addNorma(Norma norma) {
        this.normaArrayList.add(norma);
    }











}
