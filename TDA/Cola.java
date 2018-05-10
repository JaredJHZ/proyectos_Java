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
public class Cola {
    Nodo first;
    Nodo last;
    int size;
    Cola(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
     void setDato(Object dato){
        Nodo aux = new Nodo(dato);
        if(this.first == null){
            this.first = aux;
            size++;
        }else if(this.last == null){
            this.last = aux;
            this.first.siguiente = this.last;
            size++;
        }else {
            Nodo aux2 = this.last;
            this.last = aux;
            aux2.siguiente = this.last;
            size++;
        }
    }
     void deleteDato(){
        this.first = this.first.siguiente;
        size--;
    }
     void imprimirCola(){
        System.out.println("La cola contiene:");
        Nodo aux = this.first;
        while(aux!=null){
            System.out.print(aux.dato+" ");
            aux = aux.siguiente;
        }
        System.out.println("");
    }
    private int getSize(){
        return this.size;
    }
    public static void menu(){
        Cola c = new Cola();
        Scanner entrada = new Scanner(System.in);
        int eleccion;
        int dato;
        boolean bandera = false;
        do{
            System.out.println("Menu de colas");
            System.out.println("1) Insertar");
            System.out.println("2) Eliminar");
            System.out.println("3) Salir");
        }while(bandera!=true);
    }
}
