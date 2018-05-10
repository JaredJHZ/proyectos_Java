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
public class ListaEnlazada {
    private Nodo inicio;
    private int size;
    ListaEnlazada(){
        this.inicio = null;
    }
    void setDato(Object dato){
        Nodo aux = new Nodo(dato);
       
        if(inicio==null){
            this.inicio = aux; 
        }else{
            Nodo aux2 = this.inicio;
            while(aux2.siguiente!=null){
                aux2 = aux2.siguiente;
            }
            aux2.siguiente = aux;
        }
        size++;
    }
    void setDatoAntes(Object referencia, Object dato){
        if(this.inicio.dato == referencia){
            Nodo aux = new Nodo(dato);
            Nodo aux2 = this.inicio;
            this.inicio = aux;
            aux.siguiente = aux2;
            
        }else{
               Nodo aux = new Nodo(dato);
               Nodo aux2 = this.inicio;
               Nodo aux3;
               Nodo aux4;
               while(aux2.siguiente != null){
                   if(aux2.siguiente.dato != referencia){
                          aux2 = aux2.siguiente;
                   } else{
                       break;
                   }
               }
               aux4 = aux2;
               aux3 = aux2.siguiente;
               aux2 = aux;
               aux4.siguiente = aux2;
               aux2.siguiente = aux3;
               
        }
       size++;
    }
    void setDatoDespues(Object referencia, Object dato){
        Nodo aux = new Nodo(dato);
        Nodo aux2 = this.inicio;
        Nodo aux3;
        Nodo aux4;
        while(aux2.dato!=referencia){
            aux2 = aux2.siguiente;
        }
        aux4 = aux2;
        aux3 = aux2.siguiente;
        aux2 = aux;
        aux4.siguiente = aux2;
        aux2.siguiente = aux3;
        size++;
    }
    void imprimirLista(){
        Nodo aux = this.inicio;
        while(aux!=null){
            System.out.print(aux.dato+" ");
            aux = aux.siguiente;
        }
        System.out.println("");
    }
    void buscarDato(Object referencia){
        Nodo aux = this.inicio;
        boolean encontrado = false;
        int posicion = 0;
        while(aux.siguiente!=null){
            if(aux.dato==referencia){
                encontrado = true;
                break;
            }
            posicion++;
            aux = aux.siguiente;   
        }
        if(encontrado){
            System.out.println("El dato se encuentra en la posicion "+posicion);
        }else{
            System.out.println("No existe ese dato en la lista");
        }
    }
    void eliminarDato(Object referencia){
        if(this.inicio.dato == referencia){
            if(this.inicio.siguiente!= null){
                this.inicio = this.inicio.siguiente;
            }else{
                this.inicio = null;
            }
        }else{
               Nodo aux = this.inicio;
               Nodo aux2 = null;
               Nodo aux3;
               while(aux.siguiente!=null){
                   if(aux.siguiente.dato == referencia){
                       aux2 = aux;
                       aux = aux.siguiente;
                       break;
                   }
                   aux = aux.siguiente;
               }
               if(aux.siguiente!=null){
                   aux3 = aux.siguiente;
                   aux3.siguiente = null;
                   aux2.siguiente = aux3;

               }else{
                   aux2.siguiente = null;
               }
        
        }
       
        size--;
    }
}
