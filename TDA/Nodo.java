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
public class Nodo {
    Nodo siguiente;
    Object dato;
    Nodo(Object dato){
        this.dato = dato;
        this.siguiente = null;
    }
}
