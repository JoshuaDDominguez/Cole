/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cole;

/**
 *
 * @author jdominguezdominguez
 */
public class EstudanteInternacional extends DatosBasicos {

    private String nomeCole, nivel, pais;

    public EstudanteInternacional(String nome, String direccion, String nomeCole, String nivel, String pais) {
        super(nome, direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
        this.pais = pais;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPais() {
        return pais;
    }

    public void setPais() {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Estudante Internacional ---> " + super.toString() + ", nomeCole=" + nomeCole + ", nivel=" + nivel + ", pais=" + pais;
    }

}
