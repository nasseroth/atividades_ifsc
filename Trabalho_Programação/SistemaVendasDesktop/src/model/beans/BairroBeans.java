package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class BairroBeans {

    private int idBairro;
    private String nomeBairro;

    public BairroBeans() {
    }

    public BairroBeans(int idBairro) {
        this.idBairro = idBairro;
    }

    public BairroBeans(int idBairro, String nomeBairro) {
        this.idBairro = idBairro;
        this.nomeBairro = nomeBairro;
    }

    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

}
