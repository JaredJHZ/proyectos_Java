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
public class Pila {
    Nodo first;
    Nodo last;
    private int size;
    Pila(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
   private void setDato(Object dato){
        Nodo aux = new Nodo(dato);
        if(first==null){       
            this.first = aux;
            size++;
        }else if(last == null){
            this.last = aux;
            this.first.siguiente = this.last;
            size++;
        }else{
            Nodo aux2 = this.last;
            this.last = aux;
            aux2.siguiente = this.last;
            size++;
        }
    }
   private void deleteDato(){
        Nodo aux = this.first;
        while(aux.siguiente!=this.last){
            aux = aux.siguiente;
        }
        this.last = aux;
        this.last.siguiente = null;
        size--;
        
    }
   private void imprimirPila(){
       System.out.println("La pila contiene:");
       Nodo aux = this.first;
       while(aux != null){
           System.out.println(aux.dato);
           aux = aux.siguiente;
       }
    }
  private  int getSize(){
        return this.size;
    }
   private Object getFirst(){
        return this.first.dato;
    }
  private  Object getLast(){
        return this.last.dato;
    }
    
    public static void menu(){
        Pila p = new Pila();
        Scanner eleccion = new Scanner(System.in);
        int entrada;
        int dato;
        boolean bandera = false;
        do{
        System.out.println("1) Insertar");
        System.out.println("2) Eliminar");
        System.out.println("3) Salir");
        entrada = eleccion.nextInt();
        switch(entrada){
            case 1:{
                System.out.println("Elija el dato");
                dato = eleccion.nextInt();
                p.setDato(dato);
                p.imprimirPila();
                break;
            }
            case 2:{
                p.deleteDato();
                System.out.println("Dato eliminado");
                p.imprimirPila();
                break;
            }
            case 3:
            {
      
                bandera = true;
                break;
            }
        }
        }while(bandera!=true);
    }
}
