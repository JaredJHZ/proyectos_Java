/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;
import java.util.Scanner;

/**
 *
 * @author Jared
 */
public class TDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int eleccion;
        System.out.println("Bienvenido a las pruebas de los TDA Lineales");
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        do{
            System.out.println("1) Pilas");
            System.out.println("2) Colas");
            System.out.println("3) Listas");
            System.out.println("4) Salir");
            eleccion = entrada.nextInt();
            switch(eleccion){
                case 1:{
                    Pila.menu();
                    break;
                }
                case 2:{
                    
                }
                case 3:{
                    bandera=true;
                    break;
                }
                    
            }
        }while(bandera!=true);
    }
    
}
