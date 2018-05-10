/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

/**
 *
 * @author Jared
 */
public class ColaCircular extends Cola{
    ColaCircular(){
        super();
    }
    @Override
    void setDato(Object dato) {
         Nodo aux = new Nodo(dato);
        if(this.first == null){
            this.first = aux;
            size++;
        }else if(this.last == null){
            this.last = aux;
            this.first.siguiente = this.last;
            this.last.siguiente = this.first;
            size++;
        }else {
            Nodo aux2 = this.last;
            this.last = aux;
            aux2.siguiente = this.last;
            this.last.siguiente = this.first;
            size++;
        }
    }
    @Override
    void imprimirCola(){
         Nodo aux = this.first;
         do{
              System.out.print(aux.dato+" ");
            aux = aux.siguiente;
         }while(aux!=this.first);
         System.out.println("");
    }
    @Override
    void deleteDato(){
        this.first = this.first.siguiente;
        this.last.siguiente = this.first;
        size--;
    }

}
