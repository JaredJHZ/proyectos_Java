/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudoaleatorios;

/**
 *
 * @author Jared
 */
public class Prueba {
    public static void main(String args[]){
        Pseudoaleatorios p = new Pseudoaleatorios(); // Bueno aqui importamos nuestra clase , ya les dije que Erika rompio mi corazon sorry por los acentos, teclado en formato UK jej
        //Creamos dos arrays uno con cada metodo , como pueden ver son metodos estaticos de la clase Pseudoaletorios por lo que primero se tiene que poner el nombre de la clase, buenas practicas.
        double x[]=Pseudoaleatorios.cuadradosMedios("5735", 10); 
        double y[]=Pseudoaleatorios.lineal("37", 19, 33, 100, 4);
        // a partir de aqui unicamente recorremos los arreglos imprimiendo valor por valor
        System.out.println("Cuadrados medios");
        for(int i=0;i<x.length;i++){
            System.out.println(String.format("%.4f",x[i]));
        }
        System.out.println("Lineal");
         for(int i=0;i<y.length;i++){
            System.out.println(String.format("%.4f",y[i]));
        }
    }
}
