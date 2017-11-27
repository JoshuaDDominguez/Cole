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
public class Ensinante extends DatosBasicos {

    private String materia;

    public Ensinante(String nome, String direccion, String materia) {
        super(nome, direccion);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Ensiante ---> " + super.toString() + ", materia=" + materia;
    }

}
