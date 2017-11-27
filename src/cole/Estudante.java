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
public class Estudante extends DatosBasicos {

    private String nomeCole, nivel;

    public Estudante( String nome, String direccion, String nomeCole, String nivel) {
        super(nome, direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
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

    @Override
    public String toString() {
        return "Estudante ---> " + super.toString() + ", nomeCole=" + nomeCole + ", nivel=" + nivel;
    }



}
