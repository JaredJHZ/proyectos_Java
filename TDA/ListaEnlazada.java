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
    
    public int getSize() {
    	return this.size;
    }
    
    public void setDatoAlInicio(Object dato) {
    	Nodo aux = new Nodo(dato);
    	Nodo aux2 ;
    	aux2 = this.inicio;
    	this.inicio = aux;
    	aux.siguiente = aux2;
    }
    public void setDatoAlFinal(Object dato) {
    	Nodo aux = new Nodo(dato);
    	Nodo aux2 = this.inicio;
    	while(aux2.siguiente!=null) {
    		aux2 = aux2.siguiente;
    	}
    	aux2.siguiente = aux;
    }
    
    public static void menu() {
    	ListaEnlazada lista = new ListaEnlazada();
    	int eleccion;
    	int referencia;
    	int dato;
    	boolean bandera = false;
    	System.out.println("Menu Lista enlazada");
    	Scanner entrada = new Scanner(System.in);
    	do {
    		System.out.println("Elija una opcion");
    		System.out.println("1) Creacion");
    		System.out.println("2) Insercion");
    		System.out.println("3) Eliminacion");
    		System.out.println("4) Busquedad");
    		System.out.println("5) Recorrido");
    		System.out.println("6) Regresar");
    		eleccion = entrada.nextInt();
    		switch(eleccion) {
    		case 1:{
    			if(lista.inicio==null) {
    			System.out.println("Escriba el dato que iniciara la lista enlazada");
    			dato = entrada.nextInt();
    			lista.setDato(dato);}
    			else System.out.println("Lista ya iniciada");
    			break;
    		}
    		case 2:{
    			System.out.println("1) Inicio");
    			System.out.println("2) Final");
    			System.out.println("3) Antes");
    			System.out.println("4) Despues");
    			System.out.println("5) Regresar");
    			eleccion = entrada.nextInt();
    			if(eleccion ==1) {
    				System.out.println("Escriba el dato");
    				dato = entrada.nextInt();
    				lista.setDatoAlInicio(dato);
    			}else if(eleccion == 2) {
    				System.out.println("Escriba el dato");
    				dato = entrada.nextInt();
    				lista.setDatoAlFinal(dato);
    			}else if(eleccion == 3) {
    				System.out.println("Escriba el dato referenciado");
    				referencia = entrada.nextInt();
    				System.out.println("Escriba el dato a agregar");
    				dato = entrada.nextInt();
    				lista.setDatoAntes(referencia, dato);
    				System.out.println("Dato agregado");
    			}else if(eleccion ==4) {
    				System.out.println("Escriba el dato referenciado");
    				referencia = entrada.nextInt();
    				System.out.println("Escriba el dato a agregar");
    				dato = entrada.nextInt();
    				lista.setDatoDespues(referencia, dato);
    				System.out.println("Dato agregado");
    			}else if(eleccion == 5) {
    				System.out.println("Ok");
    			}else {
    				System.out.println("error volviendo");
    			}
    		break;
    		}
    		case 3:{
    			System.out.println("Escriba el dato a eliminar");
    			dato = entrada.nextInt();
    			lista.eliminarDato(dato);
    			break;
    		}
    		case 4:{
    			System.out.println("Escriba el dato a buscar");
    			dato = entrada.nextInt();
    			lista.buscarDato(dato);
    			break;
    		}
    		case 5:{
    			lista.imprimirLista();
    			break;
    		}
    		case 6:{
    			bandera = true;
    			break;
    		}
    		default:{
    			System.out.println("Escriba una eleccion valida!");
    			break;
    		}
    		}
    		
    	}while(bandera!=true);
    	 TDA.main();
    }
}
