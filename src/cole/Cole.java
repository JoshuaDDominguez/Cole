/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Codifica un programa e fai o correspondente digrama de clases.
//Clase estudante cos atributos: nome, direccion, nomeCole, nivel.
//Clase ensinante: nome, direccion, materia
//Clase estudanteinternacional: nome, direccion, nomeCole, nivel, pais
//Cada clase debe levar constructor, get e set, toString
//Na clase principal crea un obxecto de cada clase e fai un toString
//Cambialle o nivel o estudante e cambialle a materia o ensinante, despois fai o toString
package cole;

/**
 *
 * @author jdominguezdominguez
 */
public class Cole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatosBasicos datos = new DatosBasicos("Joshua", "Ponteareas");
        Estudante estudante = new Estudante("Maria", "Salvatierra", "Santiago Apostol", "4º ESO");
        Ensinante ensinante = new Ensinante("Ale", "Vigo", "Matematicas");
        EstudanteInternacional estudanteInter = new EstudanteInternacional("Fernando", "Ponteareas", "Femin", "2º ESO", "España");

        System.out.println("\n");

        System.out.println(datos.toString());
        System.out.println(estudante.toString());
        System.out.println(ensinante.toString());
        System.out.println(estudanteInter.toString());

        System.out.println("\n");

        estudante.setNivel("3º ESO");
        ensinante.setMateria("Ingles");
        System.out.println(estudante.toString());
        System.out.println(ensinante.toString());

    }

}
